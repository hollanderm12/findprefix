package com.mh.findprefix;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Michael Hollander
 * @date September 8, 2018
 */
public class FindPrefix {
    
    public List<String> doLogic(String word) {
  
        return goodString(word);
    }
    
    private List<String> goodString(String toCheck) {
        
        List<String> matchesFound = new ArrayList();
        String currentWord = new String();
        
        try {
            ClassLoader cl = getClass().getClassLoader();
            File f = new File(cl.getResource("dictionary.txt").getFile());
            
            try (Scanner s = new Scanner(f)) {
                while(s.hasNextLine()) {
                    currentWord = s.nextLine().toUpperCase();
                    if(currentWord.startsWith(toCheck.toUpperCase())) {
                        matchesFound.add(currentWord);
                    }             
                }
            }
        }
        catch(IOException ex) {
            matchesFound.add("%IO_ERROR%");
        }
        
        if(matchesFound.isEmpty())
            matchesFound.add("%NO_MATCHES%");
        return matchesFound;
    }
}

package com.mh.findprefix;

import java.util.List;

/**
 * @author Michael Hollander
 * @date September 8, 2018
 */
public class Words {

    private final String prefix;
    private final List<String> wordsFound;

    public Words(String prefix, List<String> wordsFound) {
        this.prefix = prefix;
        this.wordsFound = wordsFound;
    }
    
    public String getPrefix() {
        return prefix;
    }

    public List<String> getWordsFound() {
        return wordsFound;
    }
}

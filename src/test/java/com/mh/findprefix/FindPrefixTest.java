package com.mh.findprefix;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * @author Michael Hollander
 * @date September 8, 2018
 */
public class FindPrefixTest {
    
    public FindPrefixTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of doLogic method, of class FindPrefix.
     */
    @Test
    public void testDoLogic() {
        System.out.println("=== FindPrefix Test ===");
        String word = "CHECKING";
        FindPrefix instance = new FindPrefix();
        List<String> expResult = new ArrayList();
        expResult.add("CHECKING");
        List<String> result = instance.doLogic(word);
        assertEquals(expResult, result);
    }
}

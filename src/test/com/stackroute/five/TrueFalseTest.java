package com.stackroute.five;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TrueFalseTest {
    TrueFalse f=new TrueFalse();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void wordRepeat() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",true);
        expectedResult.put("two",false);
        assertEquals(expectedResult,f.wordRepeat(new String[]{"one","one","two"}));
    }
    @Test
    public void wordRepeatFailure() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",false);
        expectedResult.put("two",true);
        assertNotEquals(expectedResult,f.wordRepeat(new String[]{"one","one","two"}));
        assertNotNull(f.wordRepeat(new String[]{"one","one","two"}));
    }
    @Test
    public void wordRepeats() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",true);
        expectedResult.put("two",false);
        expectedResult.put("a",true);
        expectedResult.put("@",false);
        expectedResult.put("1",false);
        assertEquals(expectedResult,f.wordRepeat(new String[]{"one","one","two","a","a","@","1"}));
    }
    @Test
    public void wordRepeatsFailure() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",false);
        expectedResult.put("two",true);
        expectedResult.put("a",false);
        expectedResult.put("@",true);
        assertNotEquals(expectedResult,f.wordRepeat(new String[]{"one","one","two","a","a","@"}));
        assertNotNull(f.wordRepeat(new String[]{"one","one","two","a","a","@"}));
    }
}

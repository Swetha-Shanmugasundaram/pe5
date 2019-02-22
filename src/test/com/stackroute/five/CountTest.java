package com.stackroute.five;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountTest {

    Count sc = new Count();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void stringCount() {
        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one", 3);
        expectedResult.put("two", 2);

        assertEquals(expectedResult, sc.stringCount("one one+two/two-one"));

    }
    @Test
            public void stringCountFail(){

        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one", 3);
        expectedResult.put("two", 2);
        assertNotEquals(expectedResult,sc.stringCount("one++two/two-one"));

    }
}
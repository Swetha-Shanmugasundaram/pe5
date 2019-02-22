package com.stackroute.five;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UpdateElementTest {
    UpdateElement au =new UpdateElement();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void updatefunctionfail() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("apple", "Grape", "melon", "Berry"));
        ArrayList<String> actual = au.arrayUpdate(new ArrayList<>(Arrays.asList("apple", "Grape", "Mango", "Berry")), new String[]{"apple"}, new String[]{"Kiwi"});
        assertNotEquals(expected, actual);
        assertNotNull(actual);
    }
    @Test
            public void updatefunction() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Kiwi", "Grape", "melon", "Berry"));
        ArrayList<String> actual = au.arrayUpdate(new ArrayList<>(Arrays.asList("apple", "Grape", "Mango", "Berry")), new String[]{"apple", "Mango"}, new String[]{"Kiwi", "melon"});
        assertEquals(expected, actual);
    }
    }
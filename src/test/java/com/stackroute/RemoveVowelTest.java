package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelTest {
    String places[]={"india","japan", "usa"};
    String result[]={"nd","jpn", "s"};
    String notresult[] = {"dia","jap","ua"};
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testremoveVowel() {

        assertEquals("error", result, RemoveVowel.removeVowel(places));
        assertNotEquals("error", result, RemoveVowel.removeVowel(places));
        assertNotNull("error", RemoveVowel.removeVowel(places));


    }
}
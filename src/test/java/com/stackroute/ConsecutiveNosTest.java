package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNosTest {
    String numbers1[] = {"54","55","56","57"};
    String numbers2[] = {"54","55","55","57"};
    String numbers3[] = {"54","h","56","57"};
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testisConsecutive()
    {


        assertEquals("error", true, ConsecutiveNos.isConsecutive(numbers1));
        assertNotEquals("error", false, ConsecutiveNos.isConsecutive(numbers1));
        assertNotNull("error", ConsecutiveNos.isConsecutive(numbers1));
    }
}
package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseTest {


        String givenline = "Convert this into Upper Case";
        int StringLength = givenline.length();
        String StrLength = Integer.toString(StringLength);
        String[] StrRes = {"CONVERT THIS TO UPPER CASE","27"};
            @Before
            public void setUp() throws Exception {
            }

            @After
            public void tearDown() throws Exception {
            }

            @Test
            public void testuppercase() {
                assertArrayEquals("Error", StrRes, UpperCase.uppercase(givenline));

            }

        }
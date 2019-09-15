package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringExceptionTest {

    String message = "Deepak";
    StringException exceptionHandling = new StringException(message);
    @Before
    public static void setUp() throws Exception {
    }
    @After
    public static void tearDown() throws Exception {
    }
    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        exceptionHandling.printMessage();
    }
    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Deepak";
        assertEquals(message,exceptionHandling.salutationMessage());
    }



}
package com.stackroute;

import org.junit.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

class ThreeExceptions {
    public static ThreeExceptions handlingException;
    private ThreeExceptions StringMethods;
    @BeforeClass
    public static void setUp() throws Exception {
        handlingException = new ThreeExceptions();
    }
    @AfterClass
    public static void tearDown() throws Exception {
        handlingException = null;
    }
    @Test
    public void NegativeArraySize() throws NegativeArraySizeException{
        List<Object> list = new ArrayList<Object>();
    }
    @Test
    public void IndexOutOfBounds() throws IndexOutOfBoundsException{
        List<Object> list = new ArrayList<Object>();
        //thrown.expect(IndexOutOfBoundsException.class);
        //thrown.expectMessage("Index: 0, Size: 0");
        list.get(0);
    }
    @Test(expected = NullPointerException.class)
    public void NullPointerException(){
        AbstractList nullString = null;
        assertEquals(nullString.indexOf(3), StringMethods.myIndexOf(null, 'd',3));
    }
}
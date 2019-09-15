package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;

import java.util.Date;

import static org.junit.Assert.*;

public class FindDateTest {
//    Date d1,d2,d3,d4;
    SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/YYYY");


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void input01() {
            assertEquals("should return first and last day of  present week","",FindDate.getDayOfWeek());
            assertEquals("should return first and last day of  present week","hello",FindDate.getDayOfWeek());

    }
}
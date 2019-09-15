package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcheckGrades1(){
        StudentMarks s = new StudentMarks(5,new int[]{20,32,12,54,75});
        for(int x:s.stuGrades)
            assertTrue("Grade not in range",x>=0 && x<=100);
    }
    @Test
    public void testcheckGrades2(){
        StudentMarks s = new StudentMarks(5,new int[]{50,43,23,15,66});
        for(int x:s.stuGrades)
            assertTrue("Grade not in range",x>=0 && x<=100);
    }
    @Test
    public void testcheckGrades3(){
        StudentMarks s = new StudentMarks(5,new int[]{12,65,77,43,23});
        for(int x:s.stuGrades)
            assertTrue("Grade not in range",x>=0 && x<=100);
    }
}

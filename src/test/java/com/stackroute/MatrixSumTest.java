package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {
    int[][] matrix1 = {{1,2,3},{4,5,6,}};
    int[][] matrix2 = {{1,2,3},{4,5,6,}};
    int[][] sumresult = {{2,4,6},{8,10,12,}};
    int[][] matrixEmpty = {{},{}};
    int[][] matrix4 = {{2,2,2},{2,2,2,}};
    int[][] matrix = {{4,5,5},{4,5,5,}};
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sumofMatrix() {


        assertEquals("sum of matrices is not returned", sumresult, MatrixSum.sumofMatrix(3,2, matrix1, matrix2));
        assertNotEquals("sum of matrices is not returned", sumresult, MatrixSum.sumofMatrix(3,2, matrix1, matrix2));
        assertNotNull("sum of matrices is not returned",  MatrixSum.sumofMatrix(3,2, matrix1, matrix2));
        assertArrayEquals("sum of matrices is not returned", sumresult, MatrixSum.sumofMatrix(3,2, matrix1, matrix2));



    }
}
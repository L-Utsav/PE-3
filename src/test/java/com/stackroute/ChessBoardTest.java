package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    String white = "|WW|";
    String black = "|BB|";

    String [][] finalboard =   {{"|WW|","|BB|","|WW|","|BB|","|WW|","|BB|","|WW|","|BB|"},
                                {"|BB|","|WW|","|BB|","|WW|","|BB|","|WW|","|BB|","|WW|"},
                                {"|WW|","|BB|","|WW|","|BB|","|WW|","|BB|","|WW|","|BB|"},
                                {"|BB|","|WW|","|BB|","|WW|","|BB|","|WW|","|BB|","|WW|"},
                                {"|WW|","|BB|","|WW|","|BB|","|WW|","|BB|","|WW|","|BB|"},
                                {"|BB|","|WW|","|BB|","|WW|","|BB|","|WW|","|BB|","|WW|"},
                                {"|WW|","|BB|","|WW|","|BB|","|WW|","|BB|","|WW|","|BB|"},
                                {"|BB|","|WW|","|BB|","|WW|","|BB|","|WW|","|BB|","|WW|"}};

        @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void chessboard() {
    assertArrayEquals("error", finalboard, ChessBoard.chessboard(white,black));
    assertNotEquals("error", finalboard, ChessBoard.chessboard(black, white));
    assertNotNull("error", ChessBoard.chessboard(black,white));
    }
}
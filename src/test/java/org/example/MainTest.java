package org.example;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testifgood() {

        //GIVEN
        int num1 = 27;
        int num2 = 3;
//WHEN
        int actual = Main.error(num1, num2);
        //THEN
        assertEquals(actual, 9);


    }
    @Test
    public void testifgoo() {

        //GIVEN
        int num1 = 27;
        int num2 = 3;
//WHEN
        int actual = Main.error(num1, num2);
        //THEN
        assertEquals(actual, 9);


    }
    }

package com.matthew.domino.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DominoUtilsTest {

    @Test
    void testMatch_fl_equals_sl() {
        Domino first = new Domino(1, 3);
        Domino second = new Domino(1, 4);

        int[] result = DominoUtils.findCommonAndUncommonValues(first, second);
        assertArrayEquals(new int[] { 1, 3, 4 }, result);
    }

    @Test
    void testMatch_fl_equals_sr() {
        Domino first = new Domino(2, 5);
        Domino second = new Domino(4, 2);

        int[] result = DominoUtils.findCommonAndUncommonValues(first, second);
        assertArrayEquals(new int[] { 2, 5, 4 }, result);
    }

    @Test
    void testMatch_fr_equals_sl() {
        Domino first = new Domino(6, 1);
        Domino second = new Domino(1, 3);

        int[] result = DominoUtils.findCommonAndUncommonValues(first, second);
        assertArrayEquals(new int[] { 1, 6, 3 }, result);
    }

    @Test
    void testMatch_fr_equals_sr() {
        Domino first = new Domino(4, 2);
        Domino second = new Domino(6, 2);

        int[] result = DominoUtils.findCommonAndUncommonValues(first, second);
        assertArrayEquals(new int[] { 2, 4, 6 }, result);
    }

    @Test
    void testNoMatch_returnsNull() {
        Domino first = new Domino(1, 2);
        Domino second = new Domino(3, 4);

        assertNull(DominoUtils.findCommonAndUncommonValues(first, second));
    }
}

package com.matthew.domino.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DominoTest {

    @Test
    void testDominoValues() {
        Domino d = new Domino(3, 5);
        assertEquals(3, d.left);
        assertEquals(5, d.right);
    }

    @Test
    void testToString() {
        Domino d = new Domino(2, 6);
        assertEquals("2|6", d.toString());
    }
}

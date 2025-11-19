package com.matthew.domino.core;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

@TestMethodOrder(OrderAnnotation.class)
public class DominoChainCalculatorTest {

    @Order(1)
    @Test
    void testBestSumEasyPermutation() {
        System.out.println("Easy chain test:");
        Domino initial = new Domino(1, 3);
        Domino second = new Domino(1, 4);
        System.out.println("Initial match (1,3) with (1,4) → common=1, new tile=(3,4), sum=1");

        Domino third = new Domino(4, 6);
        System.out.println("Match (3,4) with (4,6) → common=4, new tile=(3,6), sum=1+4=5");

        Domino fourth = new Domino(8, 6);
        System.out.println("Match (3,6) with (8,6) → common=6, new tile=(3,8), sum=5+6=11");

        Domino fifth = new Domino(10, 8);
        System.out.println("Match (3,8) with (10,8) → common=8, new tile=(3,10), sum=11+8=19");

        Domino sixth = new Domino(10, 1);
        System.out.println("Match (3,10) with (10,1) → common=10, new tile=(3,1), final sum=19+10=29");

        List<Domino> remainingTiles = new ArrayList<>(
                List.of(second, third, fourth, fifth, sixth));

        int result = DominoChainCalculator.findBestChain(initial, remainingTiles, 0);

        System.out.println("Final Result = " + result);
        System.out.println("========================");

        assertEquals(29, result);
    }

    @Order(2)
    @Test
    void testBestSumNoMatch() {
        System.out.println("Test where at least one pair in the chain don't match:");
        Domino initial = new Domino(1, 3);
        Domino second = new Domino(10, 4);
        System.out.println("No match between (1,3) and (10,4) → skip, sum still 0");

        Domino third = new Domino(4, 3);
        System.out.println("Match (1,3) with (4,3) → common=3, new tile=(1,4), sum=3");

        Domino fourth = new Domino(4, 6);
        System.out.println("Match (1,4) with (4,6) → common=4, no remaining tiles, final sum=3+4=7");

        List<Domino> remainingTiles = new ArrayList<>(
                List.of(second, third, fourth));

        int result = DominoChainCalculator.findBestChain(initial, remainingTiles, 0);

        System.out.println("Final Result = " + result);
        System.out.println("========================");

        assertEquals(7, result);
    }

    @Order(3)
    @Test
    void testBestSumRandomPermutation_1() {
        System.out.println("Test with dominoes in different order:");
        Domino initial = new Domino(1, 3);
        Domino second = new Domino(1, 4);

        Domino third = new Domino(4, 6);

        Domino fourth = new Domino(8, 6);

        Domino fifth = new Domino(10, 8);

        Domino sixth = new Domino(10, 1);

        List<Domino> remainingTiles = new ArrayList<>(
                List.of(sixth, third, fifth, second, fourth));

        int result = DominoChainCalculator.findBestChain(initial, remainingTiles, 0);

        System.out.println("Final Result = " + result);
        System.out.println("========================");

        assertEquals(29, result);
    }

    @Order(4)
    @Test
    void testReturnsNull() {

    }
}

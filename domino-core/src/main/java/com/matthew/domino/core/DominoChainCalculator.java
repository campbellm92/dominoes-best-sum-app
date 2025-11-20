package com.matthew.domino.core;

import java.util.List;
import java.util.stream.Collectors;

public class DominoChainCalculator {

    public static int findBestChain(Domino current, List<Domino> remainingTiles, int currentSum) {
        int bestSum = currentSum;

        /* for every tile in the array of remaining tiles */
        for (Domino tile : remainingTiles) {
            /*
             * create a tileMatch variable that calls the helper function and returns an
             * array consisting of the common (matching) value from both tiles,
             * and two uncommon values which make up the next tile
             */
            int[] tileMatch = DominoUtils.findCommonAndUncommonValues(current, tile);

            if (tileMatch != null) {

                int common = tileMatch[0];
                int uncommonA = tileMatch[1];
                int uncommonB = tileMatch[2];

                Domino newTile = new Domino(uncommonA, uncommonB);

                /*
                 * keep track of the sum which takes the current sum (initialised as 0) and adds
                 * the common value from the domino pair
                 */
                int newSum = currentSum + common;

                /*
                 * create a "list comprehension" to store the new remaining tiles after every
                 * iteration
                 */
                List<Domino> newRemainingTiles = remainingTiles.stream()
                        .filter(t -> !t.equals(tile))
                        .collect(Collectors.toList());

                /*
                 * method gets called recursively until all possible sequences have been tried
                 */
                int candidateBestSum = findBestChain(newTile, newRemainingTiles, newSum);

                if (candidateBestSum > bestSum) {
                    bestSum = candidateBestSum;
                }

            }
        }
        return bestSum;
    }

}

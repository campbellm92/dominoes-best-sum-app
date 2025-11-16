package com.matthew.domino.core;

public final class DominoUtils {

    public static int[] findCommonAndUncommonValues(Domino first, Domino second) {

        /*
         * Util for getting common and uncommon values from a set of two dominoes.
         * If the left value of the first domino and left value of the second
         * dominoes are the same, return an array of values with first left, first right
         * and second right, i.e. the common value to be added to the sum chain, then
         * the first and second uncommon values that will make up the next domino (and
         * so on). So (1, 3), (1, 4) becomes (1, 3, 4). This then gets further processed
         * in DominoChainCalculator
         * 
         */

        int fl = first.left;
        int fr = first.right;
        int sl = second.left;
        int sr = second.right;

        if (fl == sl) {
            return new int[] { fl, fr, sr };
        }

        if (fl == sr) {
            return new int[] { fl, fr, sl };
        }

        if (fr == sl) {
            return new int[] { fr, fl, sr };
        }

        if (fr == sr) {
            return new int[] { fr, fl, sl };
        }

        return null;

    }

}

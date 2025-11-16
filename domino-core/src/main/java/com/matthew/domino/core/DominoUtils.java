package com.matthew.domino.core;

import com.matthew.domino.core.Domino;

public final class DominoUtils {

    public static int[] findCommonAndUncommonValues(Domino first, Domino second) {

        int fl = first.left;
        int fr = first.right;
        int sl = second.left;
        int sr = second.right;

        if (fl == sr) {
            return new int[] { fl, fr, sl };
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

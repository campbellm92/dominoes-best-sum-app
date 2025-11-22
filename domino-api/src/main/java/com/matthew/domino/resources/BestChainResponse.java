package com.matthew.domino.resources;

public class BestChainResponse {
    private int bestSum;

    public BestChainResponse(int bestSum) {
        this.bestSum = bestSum;
    }

    public int getBestSum() {
        return bestSum;
    }
}

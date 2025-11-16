package com.matthew.domino.core;

public class Domino {
    public int left;
    public int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left + "|" + right;
    }
}

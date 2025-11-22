package com.matthew.domino.resources;

import java.util.List;

import com.matthew.domino.api.Domino;

public class BestChainRequest {
    private List<Domino> tiles;

    public List<Domino> getTiles() {
        return tiles;
    }

    public void setTiles(List<Domino> tiles) {
        this.tiles = tiles;
    }
}

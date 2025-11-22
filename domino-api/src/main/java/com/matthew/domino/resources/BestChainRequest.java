package com.matthew.domino.resources;

import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

import com.matthew.domino.api.Domino;

public class BestChainRequest {

    @NotEmpty(message = "Tiles must not be empty.")
    @Valid
    private List<Domino> tiles;

    public List<Domino> getTiles() {
        return tiles;
    }

    public void setTiles(List<Domino> tiles) {
        this.tiles = tiles;
    }
}

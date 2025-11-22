package com.matthew.domino.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.stream.Collectors;

import com.matthew.domino.core.Domino;
import com.matthew.domino.core.DominoChainCalculator;

@Path("/best-chain")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DominoResource {

    @POST
    public BestChainResponse calculateBestChain(BestChainRequest request) {

        List<Domino> tiles = request.getTiles().stream()
                .map(t -> new Domino(t.getLeft(), t.getRight()))
                .collect(Collectors.toList());

        Domino start = tiles.get(0);
        List<Domino> rest = tiles.subList(1, tiles.size());

        int best = DominoChainCalculator.findBestChain(start, rest, 0);

        return new BestChainResponse(best);

    }

}

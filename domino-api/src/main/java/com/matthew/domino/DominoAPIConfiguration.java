package com.matthew.domino;

import io.dropwizard.core.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DominoAPIConfiguration extends Configuration {

    private int maxChainSum;

    @JsonProperty
    public int getMaxChainSum() {
        return maxChainSum;
    }

    @JsonProperty
    public void setMaxChainSum(int maxChainSum) {
        this.maxChainSum = maxChainSum;
    }

}

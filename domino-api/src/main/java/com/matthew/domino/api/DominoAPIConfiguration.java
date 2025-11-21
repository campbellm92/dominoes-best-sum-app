package com.matthew.domino.api;

import io.dropwizard.core.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import jakarta.validation.constraints.*;

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

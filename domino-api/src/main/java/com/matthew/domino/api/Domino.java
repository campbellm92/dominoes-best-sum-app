package com.matthew.domino.api;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

// representation class / POJO -> map Java object to JSON

public class Domino {

    @NotNull(message = "Left value cannot be empty.")
    @Min(value = 1, message = "Value must be >= 1.")
    @Max(value = 10, message = "Value must be <= 10.")
    private Integer left;

    @NotNull(message = "Right value cannot be empty.")
    @Min(value = 1, message = "Value must be >= 1.")
    @Max(value = 10, message = "Value must be <= 10.")
    private Integer right;

    @AssertTrue(message = "Left and right values cannot be equal.")
    public boolean isValidTile() {
        return left != right;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }
}

package com.groceries.models.units;

import java.math.BigDecimal;

public class Calories {
    private BigDecimal magnitude;
    private Mass mass;

    public Calories(BigDecimal calories, Mass mass) {
        this.magnitude = calories;
        this.mass = mass;
    }

    public Calories add(Mass mass) {
        return null;
    }

    public Calories scaleToMass(Mass mass) {
        return null;
    }

    public Calories scaleToOneKilogram() {
        return null;
    }
}

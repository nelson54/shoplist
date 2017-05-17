package com.groceries.models.units;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class Mass {

    @NotNull
    private BigDecimal magnitude;
    private MassUnit unit;

    public Mass(BigDecimal magnitude, MassUnit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    private Mass add(Mass mass) {
        BigDecimal added;

        if(mass.unit != unit) {
            mass = mass.convert(unit);
        }

        added = magnitude.add(mass.magnitude);

        return new Mass(added, unit);
    }

    private Mass convert(MassUnit unit) {
        return null;
    }

    private Mass copy(){
        return new Mass(this.magnitude, this.unit);
    }
}

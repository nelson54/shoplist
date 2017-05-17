package com.groceries.models.units;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by dnelson on 5/17/2017.
 */
public class Volume {

    @NotNull
    private BigDecimal magnitude;
    private MassUnit unit;

    public Volume(BigDecimal magnitude, MassUnit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }


}

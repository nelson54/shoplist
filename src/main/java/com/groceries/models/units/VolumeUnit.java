package com.groceries.models.units;

import java.math.BigDecimal;

/**
 * Created by dnelson on 5/17/2017.
 */
public enum VolumeUnit {

    CUP("236.59"),
    TEASPOON("4.93"),
    TABLESPOON("14.79"),
    LITRES("1000"),
    MILLILITRES("1"),
    PINT("473.18"),
    QUART("946.35"),
    GALLON("3785.41");

    public BigDecimal millilitres;

    VolumeUnit(String millilitres) {
        this.millilitres = new BigDecimal(millilitres);
    }
}

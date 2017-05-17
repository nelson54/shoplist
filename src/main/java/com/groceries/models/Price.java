package com.groceries.models;

import com.groceries.models.units.Location;
import com.groceries.models.units.Mass;
import org.joda.money.BigMoney;

import java.time.LocalDateTime;

public class Price {
    Ingredient ingredient;
    Mass totalAmount;
    BigMoney cost;
    LocalDateTime addedAt;
    Location location;
}

package com.company;

public class BonusMilesService {
    int pricePerMile = 20;
    public int calculate (int cost) {
        int mileBonus = cost / pricePerMile;
        return mileBonus;
    }
}

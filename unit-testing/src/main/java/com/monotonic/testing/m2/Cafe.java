package com.monotonic.testing.m2;

import java.util.Scanner;

public final class Cafe {


    private int beansInStock = 0;
    private int milkInStock = 0;


    public Coffee brew(CoffeeType coffeeType) {
        return brew(coffeeType, 1);
    }

    public Coffee brew(CoffeeType coffeeType, int quantity) {
        requirePositive(quantity);
        int requiredBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;
        if (requiredBeans > beansInStock || requiredMilk > milkInStock) {
            throw new IllegalStateException("Insufficent beans or milk");
        }

        beansInStock -= requiredBeans;
        milkInStock -= requiredMilk;


        //return new Coffee(coffeeType, requiredBeans, requiredMilk);
        return new Coffee(coffeeType, requiredBeans, requiredMilk);

    }


    public void restockBeans(int weightInGrams) {
        requirePositive(weightInGrams);
        beansInStock += weightInGrams;
    }

    public void restockMilk(int weightInGrams) {
        requirePositive(weightInGrams);
        milkInStock += weightInGrams;
    }

    private void requirePositive(int value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }
    }


    public int getBeansInStock() {
        return beansInStock;
    }

    public int getMilkInStock() {
        return milkInStock;
    }

}

package com.monotonic.testing.m2;

import org.junit.Assert;
import org.junit.Test;

public class CafeTest {


    //given
    //when
    //then


    private static int ESPRESSO_BEANS;


    @Test
    public void canBrewEspresso() {

        //given
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        //when
        Coffee coffe = cafe.brew(CoffeeType.Espresso);

        //then
        Assert.assertEquals(CoffeeType.Espresso, coffe.getType());
        Assert.assertEquals(0, coffe.getMilk());
        Assert.assertEquals(ESPRESSO_BEANS, coffe.getBeans());

    }


    @Test(expected = IllegalArgumentException.class)
    public void brewingEspressoConsumesBeans() {

        //given
        Cafe cafe1 = new Cafe();
        cafe1.restockBeans(ESPRESSO_BEANS);

        //when
        Coffee coffee = cafe1.brew(CoffeeType.Espresso);


        //then
        Assert.assertEquals(0, cafe1.getBeansInStock());

    }

    @Test(expected = IllegalStateException.class)
    public void latteRequiresMilk() {

        //given
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        //when
        cafe.brew(CoffeeType.Latte);


    }


}

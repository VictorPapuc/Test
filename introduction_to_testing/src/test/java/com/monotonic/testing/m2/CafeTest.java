package com.monotonic.testing.m2;

import org.junit.Assert;
import org.junit.Test;

public class CafeTest {


    //givem
    //when
    //then

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
        Assert.assertEquals(7, coffe.getBeans());

    }


    @Test
    public void brewingEspressoConsumesBeans() {

        //given
        Cafe cafe1 = new Cafe();
        cafe1.restockBeans(7);

        //when
        Coffee coffee = cafe1.brew(CoffeeType.Espresso);


        //then
        Assert.assertEquals(0, cafe1.getBeansInStock());


    }

}

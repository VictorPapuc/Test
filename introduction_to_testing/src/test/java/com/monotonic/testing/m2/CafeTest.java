package com.monotonic.testing.m2;

import org.junit.Assert;
import org.junit.Test;

public class CafeTest {


    //can brew expresso

    @Test
    public void canBrewEspresso() {

        Cafe cafe = new Cafe();
        cafe.restockBeans(7);
        Coffee coffe = cafe.brew(CoffeeType.Espresso);


        //it is an espresso
        //no milk
        // that we've got enough cofee in it

        Assert.assertEquals(CoffeeType.Espresso, coffe.getType());
        Assert.assertEquals(0, coffe.getMilk());
        Assert.assertEquals(7, coffe.getBeans());

    }


}

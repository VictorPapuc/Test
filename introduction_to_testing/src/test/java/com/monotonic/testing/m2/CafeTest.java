package com.monotonic.testing.m2;

import org.junit.Test;

import static com.monotonic.testing.m2.CoffeeType.Espresso;
import static com.monotonic.testing.m2.CoffeeType.Latte;
import static org.junit.Assert.assertEquals;

public class CafeTest {

    //given
    //when
    //then

    public static final int ESPRESSO_BEANS = Espresso.getRequiredBeans();
    public static final int NO_MILK = 0;
    public static final int NO_BEANS = 0;

    @Test
    public void canBrewEspresso() {
        //given
        Cafe cafe = cafeWithBeans();

        //when
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //then
        assertEquals("Wrong number of beans", ESPRESSO_BEANS, coffee.getBeans());
        assertEquals("wrong amount of milk", NO_MILK, coffee.getMilk());
        assertEquals("Wrong cofee Type", Espresso, coffee.getType());
    }

    @Test
    public void brewingEspressoConsumesBeans() {
        //given
        Cafe cafe = cafeWithBeans();

        //when
        cafe.brew(CoffeeType.Espresso);

        //then
        assertEquals(NO_BEANS, cafe.getBeansInStock());
    }

    @Test
    public void canBrewLatte() {
        //given
        Cafe cafe = cafeWithBeans();
        cafe.restockMilk(Latte.getRequiredMilk());

        //when
        Coffee coffee = cafe.brew(Latte);

        //then
        assertEquals("Wrong coffee type", Latte, coffee.getType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void mustRestockMilk() {
        //given
        Cafe cafe = new Cafe();

        //when
        cafe.restockMilk(NO_MILK);
    }


    @Test(expected = IllegalArgumentException.class)
    public void mustRestockBeans() {
        //given
        Cafe cafe = new Cafe();

        //when
        cafe.restockBeans(NO_BEANS);
    }

    @Test(expected = IllegalStateException.class)
    public void lattesRequiresMilk() {

        Cafe cafe = cafeWithBeans();

        cafe.brew(Latte);
    }

    private Cafe cafeWithBeans() {
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);
        return cafe;
    }
}

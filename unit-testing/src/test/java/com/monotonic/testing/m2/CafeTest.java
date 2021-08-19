package com.monotonic.testing.m2;

import org.hamcrest.Matchers;
import org.junit.*;

import static com.monotonic.testing.m2.CoffeeType.Espresso;
import static com.monotonic.testing.m2.CoffeeType.Latte;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CafeTest {
    //given
    //when
    //then

    public static final int ESPRESSO_BEANS = Espresso.getRequiredBeans();
    public static final int NO_MILK = 0;
    public static final int NO_BEANS = 0;

    private Cafe cafe;

    @Test
    public void canBrewEspresso() {
        //given
        withBeans();

        //when
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        assertThat(coffee, Matchers.hasProperty("beans", equalTo(ESPRESSO_BEANS)));

        //then
        assertEquals("Wrong number of beans", ESPRESSO_BEANS, coffee.getBeans());
        assertEquals("wrong amount of milk", NO_MILK, coffee.getMilk());
        assertEquals("Wrong cofee Type", Espresso, coffee.getType());
    }

    @Test
    public void brewingEspressoConsumesBeans() {
        //given
        withBeans();

        //when
        cafe.brew(CoffeeType.Espresso);

        //then
        assertEquals(NO_BEANS, cafe.getBeansInStock());
    }

    @Test
    public void canBrewLatte() {
        //given
        withBeans();
        cafe.restockMilk(Latte.getRequiredMilk());

        //when
        Coffee coffee = cafe.brew(Latte);

        //then
        assertEquals("Wrong coffee type", Latte, coffee.getType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void mustRestockMilk() {
        //given
        //    Cafe cafe = new Cafe();

        //when
        cafe.restockMilk(NO_MILK);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mustRestockBeans() {
        //given
        // Cafe cafe = new Cafe();

        //when
        cafe.restockBeans(NO_BEANS);
    }

    @Test(expected = IllegalStateException.class)
    public void lattesRequiresMilk() {
        //given
        withBeans();

        //when
        cafe.brew(Latte);
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after Class");
    }

    @Before
    public void before() {
        cafe = new Cafe();
    }

    @After
    public void after() {
        System.out.println("after");
    }

    private void withBeans() {
        // cafe = new Cafe();
        cafe.restockBeans(ESPRESSO_BEANS);
        //   return cafe;
    }
}

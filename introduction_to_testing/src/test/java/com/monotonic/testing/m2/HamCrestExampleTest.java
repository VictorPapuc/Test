package com.monotonic.testing.m2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasKey;
import static org.junit.Assert.assertThat;

public class HamCrestExampleTest {

    @Test
    public void mapShouldContaintValue() {
        Map<String, Integer> values = getValues();

        assertThat(values, hasKey("B"));
        //assertTrue(values.containsKey("B "));
    }

    private Map<String, Integer> getValues() {
        final HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        return map;
    }

    @Test
    public void listOrderingIsIrrelevant() {
        List<Integer> numbers = getNumbers();

        assertThat(numbers, hasItem(5));

        //    assertEquals(5, (int) numbers.get(4));
    }

    private List<Integer> getNumbers() {
        return Arrays.asList(1, 2, 3, 4, 5);
    }
}

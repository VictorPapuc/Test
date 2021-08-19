package test;

import build.MyList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class MyListTest {

    //given
    private MyList listTest = new MyList();

    @Before
    public void init() {

        //when
        listTest.add("Apple");
        listTest.add("Orange");
        listTest.add("Grapes");
    }

    @Test
    public void testSize() {

      //then
        assertEquals("Check size of List", 3, listTest.size());
    }

    @Test
    public void testRemove() {
        listTest.remove("Orange");
        assertEquals("Removing 1 fruit from list", 2, listTest.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveException() {
        listTest.remove("Kiwi");
        assertEquals("Removing 1 fruit from list", 2, listTest.size());

    }

    @After
    public void destroy() {
        listTest.removeAll();
    }


}

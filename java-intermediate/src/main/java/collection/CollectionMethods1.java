package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethods1 {

    public static void main(String[] args) {

        String[] crap = {"babies", "watermelong", "melons", "fudge", "apples"};
        List<String> l1 = Arrays.asList(crap);

        Collections.sort(l1);

        System.out.printf("%s\n", l1);

        Collections.sort(l1, Collections.<String>reverseOrder());
        System.out.printf("%s\n", l1);

    }

}

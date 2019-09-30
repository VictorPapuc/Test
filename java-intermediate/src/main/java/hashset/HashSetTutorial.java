package hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTutorial {

    public static void main(String[] args) {

        String[] stuff = {"babies", "watermelong", "melons", "fudge", "apples", "apples"};
        List<String> list1 = Arrays.asList(stuff);

        System.out.printf("%s ", list1);

        System.out.println();
        Set<String> set = new HashSet<String>(list1);

        System.out.printf("%s", set);

    }
}

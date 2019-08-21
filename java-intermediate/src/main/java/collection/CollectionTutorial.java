package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTutorial {

    public static void main(String[] args) {
        String[] things = {"eggs", "potato", "bacon", "pie"};
        List<String> list1 = new ArrayList<>();

        //add array items to list
        for (String x : things) {
            list1.add(x);
        }

        String[] moreThings = {"lasers", "hayts",};
        List<String> list2 = new ArrayList<>();

        for (String y : moreThings) {
            list2.add(y);
        }

//print out list1
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
        editList(list1, list2);
        System.out.println();
    }

    public static void editList(Collection<String> l1, Collection<String> l2) {
        Iterator<String> it = l1.iterator();
        while (it.hasNext()) {
            if (l2.contains(it.next()))
                it.remove();
        }

    }


}

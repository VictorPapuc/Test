package list;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertingList {

    public static void main(String[] args) {
        String[] stuff = {"babies", "watermelong", "melons", "fudge"};

        LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));

        thelist.add("pumpikinf");
        thelist.addFirst("firsthing");

        //convert back to an array

        stuff = thelist.toArray(new String[thelist.size()]);

        for (String x:stuff
             ) {
            System.out.printf("%s", x);
        }
    }

}

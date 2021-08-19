package list;

import java.util.*;

public class ListDemo {


    public static void main(String[] args) {

        /*
        Array List
         */

        ArrayList<Integer> unluckyNumber = new ArrayList<>();
        unluckyNumber.add(7);
        unluckyNumber.add(8);
        unluckyNumber.add(9);
        unluckyNumber.add(9);
        //Sets value at index
        unluckyNumber.set(1, 8);
        //For
        for (int i = 0; i < unluckyNumber.size(); i++) {
            System.out.println(unluckyNumber.get(i));
        }

        //Enhanced Loop , for each
        for (Integer accessList : unluckyNumber) {
            System.out.println(accessList);
        }


        /*
         List
         */

        List<String> ss = new ArrayList<>();
        ss.add("ss");
        ss.add("ss2");
        for (String d : ss) {
            System.out.println(d);
        }
        for (int i = 0; i < ss.size(); i++) {
            System.out.println(ss);
        }


        /*
          Set/ Hashset
         */

        HashSet<String> s = new HashSet<>();
        s.add("1");
        s.add("1");

        System.out.println(s);

        Set<Integer> news = new HashSet<>();

        news.add(1);
        news.add(1);
        news.add(4);
        news.add(2);
        news.add(2);
        news.add(8);

        for (int us : news
        ) {
            System.out.println(us);
        }


        /*
        Linked list

         */

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

    }
}

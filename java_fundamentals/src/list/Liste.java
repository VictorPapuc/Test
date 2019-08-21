package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Liste {


    public static void main(String[] args) {

        List<String> ss = new ArrayList<>();
        ss.add("ss");
        ss.add("ss2");
        for (String d : ss) {
            System.out.println(d);
        }
        for (int i = 0; i < ss.size(); i++) {
            System.out.println(ss);
        }

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
    }
}

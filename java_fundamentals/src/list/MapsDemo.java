package list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {

    public static void main(String[] args) {
        Map<Integer, String> mDemo = new HashMap<>();
        mDemo.put(1, "22");
        mDemo.put(2,"22");

        Map<Integer, String> tmDemo = new TreeMap<>();
        mDemo.put(1, "22");
        mDemo.put(2,"22");

        Map<Integer, String> lmDemo = new LinkedHashMap<>();
        mDemo.put(1, "22");
        mDemo.put(2,"22");

    }
}

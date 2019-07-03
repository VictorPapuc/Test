package build;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyList {


    private List listFruits = new ArrayList<>();


    public void add(String fruit) {
        listFruits.add(fruit);
    }


    public void remove(String fruit) {
        if (!listFruits.contains(fruit)) {
            throw new NoSuchElementException();
        }
        listFruits.remove(fruit);
    }

    public int size() {
        return listFruits.size();
    }

    public void removeAll() {
        listFruits.clear();

    }

}

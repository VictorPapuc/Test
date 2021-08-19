import java.util.ArrayList;
import java.util.List;

public class Blocks {


    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        int firstElmnt = elements.get(1);
        System.out.println(firstElmnt);
    }


    public void eatMore(boolean hungry, int amountFood) {

        int roomBelly = 5;
        if (hungry) {
            boolean timeToEat = true;
            while (amountFood > 0) {
                int amountEaten = 0;
                System.out.println(roomBelly = roomBelly - amountEaten);
                System.out.println(amountFood = amountFood - amountEaten);

            }
        }

    }

//
//    public static void main(String[] args) {
//
//
//
//        JavaSETest ssss = new JavaSETest();
//
//
//        Blocks ss = new Blocks();
//
//        ss.eatMore(true, 3);
//    }
}

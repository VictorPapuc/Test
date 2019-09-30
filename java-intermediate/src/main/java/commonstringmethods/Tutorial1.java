package commonstringmethods;

public class Tutorial1 {

    public static void main(String[] args) {

        String [] words = {"eggs", "potato", "bacon"};

        //starts with
        for (String w:words
             ) {
            if (w.startsWith("egg"))
                System.out.printf(w + "Do that");
        }

        //ends with
        for (String w:words) {
           if(w.endsWith("gs"))
               System.out.printf( w +"Do also this");

        }
    }
}

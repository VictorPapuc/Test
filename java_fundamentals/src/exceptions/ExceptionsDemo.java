package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionsDemo {

    public static String main(String[] args) throws CustomExceptionsDemo {

        try {
            int number = Integer.parseInt("example");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        ArrayList<Integer> x = new ArrayList<>();

        x.get(3);

        try (
                Scanner file = new Scanner(new File("fileName"))) {
            return file.nextLine();
        } catch (FileNotFoundException e) {
            throw new CustomExceptionsDemo("Incorrect filename : " + "fileName");
        }

    }

}


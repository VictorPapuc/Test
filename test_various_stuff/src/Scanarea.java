import java.util.Scanner;

public class Scanarea {



    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(n == 3 || n ==4 ){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }


        scanner.close();
    }

}

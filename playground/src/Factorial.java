public class Factorial {


    public static void main(String[] args) {
        // keep this function call here

        Factorial s = new Factorial();
        System.out.println(s.returnNum(4));


    }

    public int returnNum(int num) {

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result*i;
        }

        System.out.println();
        return result;

    }
}

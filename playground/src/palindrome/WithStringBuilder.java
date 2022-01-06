package palindrome;

public class WithStringBuilder {


    public static void main(String[] args) {

        String p = "palindrome";

        String reverseString = new StringBuilder(p).reverse().toString();

        System.out.println(reverseString);

        if (p.equals(reverseString)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}

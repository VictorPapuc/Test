package palindrome;

public class Test {


    public static void main(String[] args) {

        //String builder
        String origString = "RAR";
        String reverseString = "";

        String stringBuilder = new StringBuilder(origString).reverse().toString();

        if (origString.equals(stringBuilder)) {
            System.out.println("Word is Palindrome");
        } else {
            System.out.println("Word is not a palindrome");
        }

        //Loops
        char arr[] = origString.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            reverseString = reverseString + arr[i];
        }

        if (origString.equals(reverseString)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}

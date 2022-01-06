package palindrome;

public class withLoops {

    public static void main(String[] args) {
        System.out.println("Enter any string : ");

        String origString = "RAR";
        String reverseString = "";

        char[] characters = origString.toCharArray();

        System.out.println(reverseString);

        for (int i = characters.length - 1; i >= 0; i--) {
            reverseString = reverseString + characters[i];
        }

        //Check palindrome string
        if (origString.equals(reverseString)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}


public class Palindrome {

    public static void main(String[] args) {
        String text = "Умру. Суму сум — у сурму";

        text = text.toLowerCase().replaceAll("[^а-яa-z]", "");

        StringBuilder sb_text_reverse = new StringBuilder(text).reverse();
        String reverseText = sb_text_reverse.toString();

        if (text.equals(reverseText)) {
            System.out.println("Palindrome");
        } else
            System.out.println("Not palindrome");


    }
}

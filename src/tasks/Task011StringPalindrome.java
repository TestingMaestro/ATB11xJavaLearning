package tasks;

import java.util.Scanner;

public class Task011StringPalindrome {
    static String reverseString(String userInput) {
        boolean flag = true;
        for (int i = userInput.length() - 1; i > 0; i--) {

            if (userInput.charAt(i) != userInput.charAt(userInput.length() - i - 1)) {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }
       return userInput;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings");
        String userInput = sc.next();
        String pali = reverseString(userInput);

    }
}

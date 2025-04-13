package tasks;

import java.util.Scanner;

public class Task014WithoutPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1");
        String inputString = sc.nextLine();
        String reversedString = stringReverse(inputString);
        System.out.println(reversedString);

        System.out.println("Enter the String2");
        String inputString2 = sc.nextLine();
        String reversedString2 = stringReverse2(inputString2);
        System.out.println(reversedString2);
    }

    private static String stringReverse(String inputString) {
        StringBuilder reversed = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }
        return reversed.toString();
    }

    private static String stringReverse2(String inputString2) {
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < inputString2.length() ; i++) {
            reversed.append(inputString2.charAt(inputString2.length()-i-1));
        }
        return reversed.toString();
    }

}

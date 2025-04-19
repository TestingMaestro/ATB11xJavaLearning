package b_april.ex_30_Exceptions;

import java.util.Scanner;

public class Lab236_Throw
{
    public static void main(String[] args) {

        boolean canIgoToGoa = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();

        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Invalid Age. get out");
        }else System.out.println("You can go to GOA");
    }
}

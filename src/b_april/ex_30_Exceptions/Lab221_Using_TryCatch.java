package b_april.ex_30_Exceptions;

import java.util.Scanner;

public class Lab221_Using_TryCatch
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter");
        try {

            int a = sc.nextInt(); //provide different data type instead of int ---> InputMismatchException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

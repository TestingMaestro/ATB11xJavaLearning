package tasks;

import java.util.Scanner;

public class Task005UsingScannerOps {
    // Take a user input - Name, Age and Salary and print them in the end.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee name");
        String name = sc.nextLine();

        System.out.println("Enter the Age");
        int age = sc.nextInt();

        System.out.println("Enter the Salary");
        double salary = sc.nextDouble();

        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Age: " + age);
    }
}

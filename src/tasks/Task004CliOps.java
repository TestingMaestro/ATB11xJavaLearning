package tasks;

public class Task004CliOps {
    // Take a user input - Name, Age and Salary and print them in the end.

    public static void main(String[] args) {

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Age: " + age);
    }
}

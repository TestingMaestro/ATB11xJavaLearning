package march.ex_09_Switch;

import java.util.Scanner;

public class Lab093EnhancedSwitch2 {

    static void usingCLI()
    {
        String fruit = "Plum";
        String result = switch (fruit) {
            case "Cherry","Plum","Strawberry" -> "Red Colored Fruits";
            case "Mango" -> "Yellow Fruit";
            case "Banana" -> "Robusta";
            default -> "Invalid";
        };
        System.out.println(result);
    }
    public static void main(String[] args) {

        usingCLI();
        //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit which you wanna eat");
        String fruit  = sc.nextLine();

        String result = switch (fruit) {
            case "Cherry","Plum","Strawberry" -> "Red Colored Fruits";
            case "Mango" -> "Yellow Fruit";
            case "Banana" -> "Robusta";
            default -> "Invalid";
        };
        System.out.println(result);
    }
}

package march.ex_09_Switch;

import java.util.Scanner;

public class Lab087SwitchForAutomation
{
    public static void main(String[] args) {

        // Web Automation
        //Ask user input  from the browser which he want to use
        //use to I will start automation in that browser

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser you want to start automation");
        String browser = sc.nextLine();

        switch (browser)
        {
            case "Chrome":
                System.out.println("Starting Chrome Browser");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "Edge":
                System.out.println("Starting Edge Browser");
                System.out.println("TC1");
                System.out.println("TC2");

            default:
                System.out.println("Opera is not supported");
        }
    }
}

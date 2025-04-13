package a_march.ex_09_Switch;

public class Lab084SwitchUsingCli {
    public static void main(String[] args) {

        //switch

        //Take user input
        //Monday to Friday -> 1->7
        //8--> Invalid day

        int day = Integer.parseInt(args[0]);
        if (day > 0) {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Day");
            }
        }
        else System.out.println("Please enter valid day");
    }
    }

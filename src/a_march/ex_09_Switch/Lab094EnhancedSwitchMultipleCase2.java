package a_march.ex_09_Switch;

public class Lab094EnhancedSwitchMultipleCase2 {
    public static void main(String[] args) {

//        int itemCode = 001;
        //Using CLI
        int itemCode = Integer.parseInt(args[0]);

        switch (itemCode) {
            case 001, 002, 003 -> System.out.println("All Items are electronic Gadgets");
            case 004, 005, 006 -> System.out.println("Mech");
            default -> System.out.println("None");
        }
    }
}

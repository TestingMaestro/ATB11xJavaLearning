package a_march.ex_09_Switch;

public class Lab092EnhancedSwitch {
    public static void main(String[] args) {

        char grade = 'A';

        String result = switch (grade) {
            case 'A' -> "Grade A";
            case 'B' -> "Grade B";
            case 'C' -> "Grade C";
            default -> "Invalid";
        };
        System.out.println(result);
    }
}

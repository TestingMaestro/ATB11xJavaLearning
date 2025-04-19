package b_april.ex_30_Exceptions;

public class Lab225_InterviewQuestion
{
    public static void main(String[] args) {

        System.out.println("Starting of the program");
        try {
            String input_user = args[0];
            int a = Integer.parseInt(input_user);
            int output = 100/a;
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        //NumberFormatException
        //ArrayIndexOutOfBoundsException

    }
}

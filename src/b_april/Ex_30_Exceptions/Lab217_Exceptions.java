package b_april.Ex_30_Exceptions;

public class Lab217_Exceptions
{
    public static void main(String[] args) {

        System.out.println("Starting of the program");
        String input_user = args[0];
        int a = Integer.parseInt(input_user);
        int output = 100/a;
        System.out.println(output);
        System.out.println("End of the program");

        //NumberFormatException
        //ArrayIndexOutOfBoundsException

    }
}

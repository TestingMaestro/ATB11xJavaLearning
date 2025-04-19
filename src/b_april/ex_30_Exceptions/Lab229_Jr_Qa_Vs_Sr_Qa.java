package b_april.ex_30_Exceptions;

public class Lab229_Jr_Qa_Vs_Sr_Qa {
    public static void main(String[] args) {


        // Jr QA Code
        String ip = null;
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        int n = 0;
        try {
            n = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        try {
            int m = 10 / n;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // SR QA Code
        try {
            String ip1 = args[0];
            int n1 = Integer.parseInt(ip1);
            int m1 = 10 / n1;
            System.out.println(m1);
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}

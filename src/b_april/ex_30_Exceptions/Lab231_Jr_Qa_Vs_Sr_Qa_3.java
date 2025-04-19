package b_april.ex_30_Exceptions;

public class Lab231_Jr_Qa_Vs_Sr_Qa_3 {
    public static void main(String[] args) {


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

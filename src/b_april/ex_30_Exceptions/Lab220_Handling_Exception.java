package b_april.ex_30_Exceptions;

public class Lab220_Handling_Exception {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException ae) // Cockroach hit spray
        {
            System.out.println(ae.getMessage());
        }
        /*catch (Exception e) // Rocket Launcher to Kill Cockroaches
        {
            System.out.println(e.getMessage());
        */
    }

}

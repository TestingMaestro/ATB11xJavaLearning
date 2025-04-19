package b_april.ex_30_Exceptions;

public class Lab223_TryCatch_Multiple_IQ {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
            System.out.println(a);
        }  catch (Exception e) // Rocket Launcher to Kill Cockroaches
        {
            System.out.println(e.getMessage());
        }
        /*
        Not possible because bigger exception is already used before
        catch (ArithmeticException ae) // Cockroach hit spray
        {
            System.out.println(ae.getMessage());
        }*/
    }
}
        

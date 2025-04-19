package b_april.ex_30_Exceptions;

public class Lab232_Iq {
    public static void main(String[] args) {

        int a = 0;

        try {
            int b = 100 / a;
        } catch (Exception w) {
            System.out.println(w.getMessage());
        } finally {
            System.out.println("I'll be executed anyhow");
        }
    }
}

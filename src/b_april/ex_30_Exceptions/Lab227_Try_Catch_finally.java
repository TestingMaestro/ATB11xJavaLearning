package b_april.ex_30_Exceptions;

public class Lab227_Try_Catch_finally {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I'm always executed if there are exceptions or not");
        }
    }
}

package b_april.ex_31_Generics;

public class Lab237Generics_Method {
    public static void main(String[] args) {

        tempSum(12, 30);
        tempSum(12.00, 30.00);
        tempSum("Yashodhar", "Karki");

    }

    /*static int tempSum(int a, int b) {
        return a + b;
    }

    static double tempSum(double a, double b) {
        return a + b;
    }

    static String tempSum(String a, String b) {
        return a + b;
    }*/

    // Above problem solved using generics [To specify double,int and string value, we need to define 3 more methods]

    static <T> T tempSum(T a, T b) //with return type T
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }


}

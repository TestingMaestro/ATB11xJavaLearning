package b_april.ex_29_Wrapper_Class;

public class Lab214_Wrapper_Class
{
    public static void main(String[] args) {

        //Boxing - Autoboxing

        int a = 10;
        Integer b = a;
        System.out.println(b.intValue());
        System.out.println(b);
        System.out.println(Integer.MIN_VALUE);

        //Un-boxing

        Integer m = 89;
        int n = m;
        System.out.println(n);
    }
}

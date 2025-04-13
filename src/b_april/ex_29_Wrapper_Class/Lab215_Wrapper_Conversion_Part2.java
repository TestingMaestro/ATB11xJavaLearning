package b_april.ex_29_Wrapper_Class;

public class Lab215_Wrapper_Conversion_Part2
{
    public static void main(String[] args) {

        String num = "10";
        int aaa = 10;

        // String to Wrapper
        Integer a = Integer.parseInt(num);

        // 2nd way
        Integer b = Integer.valueOf(num);
        System.out.println(a);

        //String to primitive

        int aa = Integer.parseInt(num);


        //Primitive to String

        int age = 90;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());
    }
}

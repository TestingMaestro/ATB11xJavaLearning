package a_march.ex_14_strings;

public class Lab140StringsIQ2
{
    public static void main(String[] args) {

        //How many strings are present in the SCP -> String Constant Pool ---Ans 1
        String s1 = "Hello";
        String s2 = "Hello";
        String s10 = "Hello";

        //How many strings are present in the HEAP AREA->> OA -> Object Area --> Ans 3 new operator
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s6 = new String("Hello");
    }
}

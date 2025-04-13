package a_march.ex_14_strings;

public class Lab141StringsIQ3 {
    public static void main(String[] args) {

        /**
         *  == and .equals()
         *  == ---> Compares 2 objects or references
         *  .equals() Compares Content or values
         */
        String s1 = "Hello";
        String s2 = "Hello";


        String s3 = new String("Hello");
        String s4 = new String("hello");
        String s6 = new String("Hello");

        System.out.println(s1 == s2);//true
        System.out.println(s3 == s4);//false
        System.out.println(s1 == s3);//false

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s2.equals(s6));//true
        System.out.println(s2.equalsIgnoreCase(s4));
    }
}

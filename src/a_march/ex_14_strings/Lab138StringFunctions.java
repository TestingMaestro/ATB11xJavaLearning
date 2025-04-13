package a_march.ex_14_strings;

public class Lab138StringFunctions {
    public static void main(String[] args) {


        // String Functions

        //1. length()
        String s1 = "Yashodhar Karki";
        int length = s1.length();
        System.out.println("Length of the String is: " + length);

        //2. concat()
        s1 = s1.concat(" is a good guy");
        System.out.println("After concatenation --> " + s1);

        //3. toUpperCase();
        System.out.println("After converting to Upper Case: " + s1.toUpperCase());

        //4. toLowerCase();
        System.out.println("After converting to Lower Case: " + s1.toLowerCase());

        //5. equals()
        String s2 = s1;
        System.out.println("Comparing  string content or value" + s2.equals(s1));

        //6 equalsIgnoreCase

        String name1 = "yashu";
        String name2 = "YASHu";
        System.out.println("Comparing  string content or value by ignoring case :" + name1.equalsIgnoreCase(name2));


    }
}

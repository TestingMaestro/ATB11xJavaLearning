package a_march.ex_14_strings;

import java.util.Arrays;

public class Lab143StringFunctionsContinued {
    public static void main(String[] args) {

        String name = "Soupi";
        String name1 = "madam is bomb";
        System.out.println(name.length());

        //7. contains()
        System.out.println(name.contains("So"));

        //8. charAt(index)
        System.out.println(name.charAt(2));

        //9. indexOf(char)
        System.out.println(name1.indexOf('m'));


        //replace(old char, new char)
        System.out.println(name1.replace('b', 'B'));
        System.out.println(name.replace("Sou", "SOU"));

        //split[]
        String name2 = "@yashodhar@gmail@.com@karki";
        String[] split = name2.split("@");
        System.out.println(Arrays.toString(split));
        //or
        for (int i = 0; i < split.length; i++) {

            System.out.println(split[i]);
        }

        //substring
        String name3 = "Yashodhar Karki is a good guy";

        System.out.println(name3.substring(4));
        System.out.println(name3.substring(4,10));

        //startsWith(char) --- endsWith(char)

        String n = "yashu";
        System.out.println(n.startsWith("y"));
        System.out.println(n.endsWith("s"));

        //trim()

        String trims = "    myself very good       ";
        System.out.println(trims.length());
        System.out.println(trims.trim());


        //compareTo()
        System.out.println(n.compareTo("Yashu"));

        //compareToIgnoreCase()
        System.out.println(n.compareToIgnoreCase("YASHU"));

        // concatenation
        String a = "i";
        String b = "love";
        String c = "you";
        String res = a + b +c;
        System.out.println(res);

        //lastIndexOf

        String namez = "Yahsrueijniijjjihdgfyas";

        System.out.println(namez.lastIndexOf("j"));
        System.out.println(namez.lastIndexOf("ya"));

        int [] arr = {100,99,90,78, 89,88};
        System.out.println(arr[arr.length-1]);

    }
}

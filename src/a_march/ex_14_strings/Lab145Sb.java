package a_march.ex_14_strings;

public class Lab145Sb {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Yashodhar");
        sb.append(" Karki");

        System.out.println(sb);
        System.out.println(sb.reverse());

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;
        System.out.println(s3);
    }
}

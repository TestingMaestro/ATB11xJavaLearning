package a_march.ex_14_strings;

public class Lab144StringBuilderVsStringBuffer
{
    public static void main(String[] args) {

        String s1 = "Yashodhar";
        String s2 = new String("Pramod");


        StringBuffer sb = new StringBuffer("Yashodhar");
        StringBuilder sd = new StringBuilder("Yashodhar");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sb);
        System.out.println(sd);
    }
}

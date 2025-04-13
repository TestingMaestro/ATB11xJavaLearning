package a_march.ex_14_strings;

public class Lab147SBuilder
{
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        //Other Functions
        sb.insert(2, 2);
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);

        sb.replace(0,4,"C++");
        System.out.println(sb);
    }
}

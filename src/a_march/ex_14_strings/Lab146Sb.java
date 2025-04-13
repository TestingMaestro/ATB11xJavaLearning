package a_march.ex_14_strings;

public class Lab146Sb {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Yashu");
        sb.append(" K");
        sb.append("arki");
        System.out.println(sb);

        String convertToString = sb.toString();
        System.out.println(convertToString);
        sb.insert(2, 2);
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);
    }
}

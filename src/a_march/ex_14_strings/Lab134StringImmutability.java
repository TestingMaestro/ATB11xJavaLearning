package a_march.ex_14_strings;

public class Lab134StringImmutability
{
    public static void main(String[] args) {

        // In String Constant pool, 2 yash are present

        String name = "Yash"; // 1.Yash
        name.toUpperCase(); // 2, YASH
        System.out.println(name);
    }
}

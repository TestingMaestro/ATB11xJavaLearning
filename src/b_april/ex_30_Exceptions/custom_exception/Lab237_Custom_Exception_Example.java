package b_april.ex_30_Exceptions.custom_exception;

public class Lab237_Custom_Exception_Example {
    public static void main(String[] args) {

        Bank sbi = new Bank(2000, "INR");
        Bank icici = new Bank(200, "INR");
        Bank jp_chase = new Bank(100, "USD");
        int total = icici.add(sbi);
        System.out.println(total);
    }
}

package b_april.ex_30_Exceptions.custom_exception;

public class Lab238_Custom_Exception_Example2 {
    public static void main(String[] args) {


        BankAccount sbi = new BankAccount(100.00, 200.00);
        BankAccount icici = new BankAccount(200.89, 900.22);
        double total2 = sbi.depositPaisa(5000);
        System.out.println(total2);


    }

}

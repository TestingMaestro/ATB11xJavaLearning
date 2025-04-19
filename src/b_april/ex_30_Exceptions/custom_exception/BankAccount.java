package b_april.ex_30_Exceptions.custom_exception;

public class BankAccount {
    private double balance;
    private double amount;

    BankAccount(double balance, double amount) {
        this.balance = balance;
        this.amount = amount;
    }

    double withdrawPaisa(double amount) {

        try {
            if (amount > balance)
            {
                throw new InsufficientBalanceException("Insufficient Balance!!! Please withdrow only of amount is less than Balance");
            }else  balance = this.balance - this.amount;

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        return balance;
    }

    double depositPaisa(double amount) {
        balance = this.balance + amount;
        return balance;
    }

}
class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String message)
    {
        super(message);
    }
}

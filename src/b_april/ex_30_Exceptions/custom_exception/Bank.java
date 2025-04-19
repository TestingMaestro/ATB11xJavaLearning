package b_april.ex_30_Exceptions.custom_exception;

public class Bank {
    private Integer amount;
    private String currency;

    Bank(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    Integer add(Bank bank)
    {
        try {
            if (bank.currency.equalsIgnoreCase("INR"))
            {
                return bank.amount + this.amount;
            }
            else throw new CurrencyMismatchCustomException("Currency Mismatch");
        } catch (CurrencyMismatchCustomException e) {
            System.out.println(e.getMessage());
        }
    return 0;
    }
}
class CurrencyMismatchCustomException extends Exception
{
    CurrencyMismatchCustomException(String msg)
    {
        super(msg);
    }
}

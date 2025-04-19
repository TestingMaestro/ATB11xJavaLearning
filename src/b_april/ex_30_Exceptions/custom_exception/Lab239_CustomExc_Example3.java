package b_april.ex_30_Exceptions.custom_exception;

public class Lab239_CustomExc_Example3 extends Object
{
    public static void main(String[] args) {

        AgeValidation age1 = new AgeValidation(20,"Yashu");
        AgeValidation age2 = new AgeValidation(10,"Munni");
        age2.aggeValidation();
    }
}

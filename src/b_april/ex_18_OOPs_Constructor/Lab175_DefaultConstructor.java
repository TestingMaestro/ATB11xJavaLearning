package b_april.ex_18_OOPs_Constructor;

public class Lab175_DefaultConstructor
{
    public static void main(String[] args) {

        A a = new A();

    }
}
class A
{
    //Default or implicitly called by the compiler
    A()
    {
        System.out.println("DC");
    }
}

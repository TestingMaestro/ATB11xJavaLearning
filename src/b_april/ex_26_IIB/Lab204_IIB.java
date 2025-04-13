package b_april.ex_26_IIB;

public class Lab204_IIB
{
    public static void main(String[] args) {

        new InstanceInitializationBlock1();
    }
}

class InstanceInitializationBlock1
{
    InstanceInitializationBlock1()
    {
        System.out.println("Default constructor");
    }
    // as soon as object is created IIB's are called
    {
        System.out.println("Hello!! i'm IIB 1");
    }
    {
        System.out.println("Hello!! i'm IIB 2");
    }
    {
        System.out.println("Hello!! i'm IIB 3");
    }
    {
        System.out.println("Hello!! i'm IIB 4");
    }
}

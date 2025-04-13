package b_april.ex_27_Static;

public class Lab207_Static
{
    public static void main(String[] args) {

        B1.commonToAll();
        B1 bbb = new B1();
        bbb.display();
        System.out.println(bbb.a);
        System.out.println(B1.b);
    }
}
class B1
{
    static
    {
        System.out.println("Called whenever class gets loaded");
    }
    int a = 10;
    static int b = 10;

    void display()
    {
        System.out.println("Static value in non static "+b);
        System.out.println("Non-static");
    }
    static void commonToAll()
    {
        // System.out.println(a);--> we cannot call non static variable in static context..we should create object
        System.out.println("Static");
//        B1 nn = new B1();
//        System.out.println(nn.a);
    }
}


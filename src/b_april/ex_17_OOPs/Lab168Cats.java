package b_april.ex_17_OOPs;

public class Lab168Cats
{
    public static void main(String[] args) {

        Cat c1;
        Cat c2 = new Cat();
        c2.catName = "Johnny";
        System.out.println(c2.catName);
        new Cat().running();
    }
}
class Cat
{
    String catName;
    String catAge;

    void running()
    {
        System.out.println("Cat Running");
    }
}

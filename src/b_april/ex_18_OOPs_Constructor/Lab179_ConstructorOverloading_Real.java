package b_april.ex_18_OOPs_Constructor;

public class Lab179_ConstructorOverloading_Real {
    public static void main(String[] args) {

        Person1 p1 = new Person1("Yash", 914835918, "BG Road");
        System.out.println(p1.name);
        System.out.println(p1.phoneNumber);
        System.out.println(p1.address);

        Person1 p2 = new Person1("Soupi", 9148358, "Hulimavu");
        System.out.println(p2.name);
        System.out.println(p2.phoneNumber);
        System.out.println(p2.address);

        Person1 p3 = new Person1();
        p3.name = "Myunni";
        System.out.println(p3.name);


        Person1 p4 = new Person1("Pappa", 6778878);
        System.out.println(p4.name);
        System.out.println(p4.phoneNumber);

        Person1 p5 = new Person1("Sq");
        System.out.println(p5.name);

        p1.sleep();
        p2.sleep();
        p3.sleep();
        p4.sleep();
    }
}

class Person1 {
    String name;
    long phoneNumber;
    String address;


    Person1() {

    }

    Person1(String nameArg, long phoneNumberArg, String addressArg) {
        this.name = nameArg;
        this.phoneNumber = phoneNumberArg;
        this.address = addressArg;
    }

    Person1(String nameArg, long phoneNumberArg) {
        this.name = nameArg;
        this.phoneNumber = phoneNumberArg;
    }
    Person1(String nameArg)
    {
        this("Sanjay",99999);
    }

    //using

    void sleep() {
        System.out.println(this.name + " is sleeping");
    }
}

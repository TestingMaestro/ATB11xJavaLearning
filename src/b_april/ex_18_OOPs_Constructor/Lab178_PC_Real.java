package b_april.ex_18_OOPs_Constructor;

public class Lab178_PC_Real {
    public static void main(String[] args) {

        Person p1 = new Person("Yash", 914835918, "BG Road");
        System.out.println(p1.name);
        System.out.println(p1.phoneNumber);
        System.out.println(p1.address);

        Person p2 = new Person("Soupi", 9148358, "Hulimavu"); // my name is created during object creation
        System.out.println(p2.name);
        System.out.println(p2.phoneNumber);
        System.out.println(p2.address);

        Person p3 = new Person();
        p3.name = "Myunni"; //Sister's name is created after object is created and this is not good way to initialize
        System.out.println(p3.name);


        p1.sleep();
        p2.sleep();
        p3.sleep();
    }
}

class Person {
    String name;
    long phoneNumber;
    String address;


    Person() {

    }

    Person(String nameArg, long phoneNumberArg, String addressArg) {
        this.name = nameArg;
        this.phoneNumber = phoneNumberArg;
        this.address = addressArg;
    }
    //using

    void sleep() {
        System.out.println(this.name + " is sleeping");
    }
}

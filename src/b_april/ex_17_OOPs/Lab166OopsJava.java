package b_april.ex_17_OOPs;

public class Lab166OopsJava
{
    public static void main(String[] args) {
        /**
         * Person is a class
         * P1 is a object reference/instance variable/reference variable which holds object adress
         * new--> Creates random memory space inside heap aread or heap memory
         * Person() ---> it is a constructor which loads or initializes all the data members
         * new Person() ---> Object
         */

        Person p1;

        Person p2 = new Person();

        p2.name = "Yash";
        System.out.println(p2.name);
        p2.gender = "Male";
        System.out.println(p2.gender);
        p2.greetPerson();
        String result = p2.greetPerson();
        System.out.println(result);

    }
}
class Person
{
    //Attributes
    String name;
    String gender;
    String phoneNumber;
    String eyeColor;
    int age;
    double salary;
    boolean isMale;


    //Behaviour

    void sleep()
    {
        System.out.println("Person is Sleeping");
    }
    void talk()
    {
        System.out.println("Person is talking");
    }
    String greetPerson()
    {
        return "Hello" + name;
    }
    int remainingSalary(int salary, int tax)
    {
        return salary + tax;
    }

}


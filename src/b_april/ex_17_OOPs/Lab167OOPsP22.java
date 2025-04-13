package b_april.ex_17_OOPs;

public class Lab167OOPsP22 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Souparnika";
        s1.rollNo = 87011;
        s1.displayDetails();
        /**
         *
         * 1. Student--> Class loader loads the Student class
         * 2. S1 holds the object reference not the object
         * 3. new Student()--> Object creation--> new which creates random memory space inside heap memory
         */

    }
}

class Student
{
    int rollNo;
    String name;

    void display() {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayDetails()
    {
        System.out.println("Student Name:" +name);
        System.out.println("Student Name:" +rollNo);
    }
}

package b_april.ex_18_OOPs_Constructor;

public class Lab177ParameterizedConstructor {
    public static void main(String[] args) {

        Car2 c1 = new Car2();
        Car2 c2 = new Car2();

        System.out.println(c1.name);
        System.out.println(c2.name);

        Car2 c3 = new Car2("Tesla", "Model X", 2015);

        c3.name = "AUDI";
        System.out.println(c3.name);
        System.out.println(c3.model);
        System.out.println(c3.year);

        System.out.println(" ---------------- ");

        Car2 c4 = new Car2("BMW", "M3 GTR", 2009);
        System.out.println(c4.name);
        System.out.println(c4.model);
        System.out.println(c4.year);

    }
}

class Car2 {
    String name;
    int year;
    String model;

    Car2() {
        name = "Unknown Car";
        year = 1991;
        model = "XXXX";
        System.out.println("DC");
    }

    Car2(String name, String model, int year) {
        this.model = model;
        this.year = year;
        this.name = name;
    }
}

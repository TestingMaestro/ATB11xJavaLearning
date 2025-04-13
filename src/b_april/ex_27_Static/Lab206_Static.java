package b_april.ex_27_Static;

public class Lab206_Static {
    public static void main(String[] args) {

        A ref1 = new A(10);
        ref1.display();
        //System.out.println(ref1.b);
        System.out.println(A.b);
        System.out.println("  ----------------- ");

        A ref2 = new A(20);
        ref2.display();
        //System.out.println(ref2.b);
        A.b = 90;
        System.out.println(A.b);

        for (int i = 0; i <=5; i++) {
            new B();

        }

    }
}

class A {
    int a;
    static int b = 20;

    A(int a) {
        this.a = a;
    }

    void display() {
        System.out.println();
        System.out.println(this.a);
    }
}

class B {
    static int count = 0;

    B() {
        count++;
        System.out.println(count);
    }
}

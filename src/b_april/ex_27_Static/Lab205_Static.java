package b_april.ex_27_Static;

public class Lab205_Static {
    public static void main(String[] args) {

        P a = new P();
        P b = new P();
        P c = new P();
        System.out.println("Main Method");

    }
}

class P {
    {
        System.out.println("IIB");
    }

    P() {
        System.out.println("DC");
    }

    static {
        System.out.println("SIB 1");
    }
    static {
        System.out.println("SIB 2");
    }
}

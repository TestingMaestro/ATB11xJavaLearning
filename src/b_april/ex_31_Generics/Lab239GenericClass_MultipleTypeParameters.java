package b_april.ex_31_Generics;

public class Lab239GenericClass_MultipleTypeParameters
{
    public static void main(String[] args) {

        GenericsTypeMultiple<String,Integer> si = new GenericsTypeMultiple<>("Yash",10388);
        GenericsTypeMultiple<Integer,String> is = new GenericsTypeMultiple<>(4455,"Sou");
        si.getDetails();
    }
}

class GenericsTypeMultiple<K,V>
{
    private K details1;
    private V details2;

    public GenericsTypeMultiple(K details1, V details2) {
        this.details2 = details2;
        this.details1 = details1;
    }

    public void getDetails()
    {
        System.out.println("Student Name: "+details1);
        System.out.println("Student RollNumber: "+details2);
    }
}

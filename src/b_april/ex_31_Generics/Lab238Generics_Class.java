package b_april.ex_31_Generics;

public class Lab238Generics_Class {
    public static void main(String[] args) {

        GenericClass<String> stringGenericClass = new GenericClass<>("Yashu");
        GenericClass<Integer> integerGenericClass = new GenericClass<>(12);
        GenericClass<Double> doubleGenericClass = new GenericClass<>(12.90);
        System.out.println(integerGenericClass);
        System.out.println(stringGenericClass);
        System.out.println(doubleGenericClass);
    }
}

class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    //We are no using <T> int the method definition because, Class itself is generic
    public T getData() {
        return this.data;
    }
}
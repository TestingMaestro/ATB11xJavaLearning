package b_april.ex_30_Exceptions.custom_exception;

public class AgeValidation {
    private Integer age;
    private String name;

    AgeValidation(Integer age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void aggeValidation() {
        try {
            if (age > 18) {
                System.out.println(this.name + " can go to GOA");
            } else throw new InvalidAgeException("OOPs!!! Below 18 are not allowed to step in GOA");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

package b_april.ex_18_OOPs_Constructor;

public class Lab173OOPsConstructor
{
    public static void main(String[] args) {

        /**
         * As soon as object is created constructor is called implicitly/called by compiler automatically
         */

        Baby b1 = new Baby(); // Default constructor is called
        Baby b2 = new Baby();
    }

}

class Baby
{
    String name;

    Baby()
    {
        System.out.println("Default Constructor is called");
        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)
    }

    void cry()
    {
        System.out.println("Baby is crying!!");
    }
    void sleep()
    {
        System.out.println("Baby is sleeping!!");
    }
}

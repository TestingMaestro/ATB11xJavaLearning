package b_april.Ex_30_Exceptions;

public class Lab220_Handling_Exception
{
    public static void main(String[] args) {

        try {
            int a = 10/0;
            System.out.println(a);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}

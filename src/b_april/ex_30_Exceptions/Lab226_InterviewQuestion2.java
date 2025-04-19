package b_april.ex_30_Exceptions;

public class Lab226_InterviewQuestion2
{
    public static void main(String[] args) {

        int b = 0;
        int c = 0;

        try {
            int a = 10/c; // Vulnerable Code
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

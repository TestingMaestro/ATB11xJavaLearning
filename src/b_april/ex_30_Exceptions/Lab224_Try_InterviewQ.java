package b_april.ex_30_Exceptions;

public class Lab224_Try_InterviewQ
{
    public static void main(String[] args) {

        try
        {
            String s = null;
            s.trim();
            int a  = 10/0;
        }catch (NullPointerException | ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}

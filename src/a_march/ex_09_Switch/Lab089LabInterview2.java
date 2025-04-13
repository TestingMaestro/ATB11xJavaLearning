package a_march.ex_09_Switch;

public class Lab089LabInterview2
{
    static void interViewQs()
    {
        char code = 'A';
        switch (code)
        {

            case 65:
                System.out.println(10);
                break;
            case 66:
                System.out.println(9);
                break;        }
    }
    public static void main(String[] args) {

        long l = 20;
        switch ((int) l) //explicit narrowing
        {
            // Allowed
        }
        interViewQs();
    }
}

package b_april.ex_30_Exceptions;

import java.util.Scanner;

public class Lab228_TryCatchFinally_Purpose
{
    public static void main(String[] args) {

        Scanner scanner = null;
        int sc = scanner.nextInt();
        try {
            int b = 10/sc;
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}

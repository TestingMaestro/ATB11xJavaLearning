package b_april.ex_30_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab233_IQ1
{
    public static void main(String[] args)  {

        try {
            FileReader fr = new FileReader(new File("C://abc.txt"));
        }catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }
}

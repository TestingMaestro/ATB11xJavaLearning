package b_april.ex_30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab234_Throws
{
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("C:log.txt");
        String s1 = null;
        s1.trim();
        int a = 10/0;

    }
    static void diplay() throws Exception
    {
        FileReader fr = new FileReader("C:clog.txt");
    }
}

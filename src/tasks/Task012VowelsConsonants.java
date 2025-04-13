package tasks;

public class Task012VowelsConsonants
{
    public static void main(String[] args) {

        char ch = 'a';
        boolean flag = false;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            flag = true;
        }
        if (! flag)
        {
            System.out.println("Consonant");
        }else {
            System.out.println("Vowel");
        }

    }
}

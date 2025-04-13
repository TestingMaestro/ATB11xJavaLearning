package b_april.ex_27_Static;

public class Lab209_StaticUsageinWebAutomation
{
    public static void main(String[] args) {

        Automation tc1 = new Automation();
        System.out.println(Automation.driver);
        Automation tc2 = new Automation();
        Automation tc3 = new Automation();

        System.out.println(tc2.driver);
        System.out.println(tc3.driver);

    }
}
class Automation
{
    static String driver = "Chrome";

}

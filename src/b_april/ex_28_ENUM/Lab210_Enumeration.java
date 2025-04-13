package b_april.ex_28_ENUM;

public class Lab210_Enumeration
{
    public static void main(String[] args) {

        //using enumeration
        // enum_name.constants used inside
        // Can be used without object creation

        System.out.println(Days.FRIDAY);

        Dayss dayy = new Dayss();
        System.out.println(dayy.day[3]);

        System.out.println(URLs.google);
    }
}
enum Days
{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

//using normal class

class Dayss
{
    String[] day = {"MONDAY", "TUESDAY", "WEDNESDAY",
                    "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
}

enum URLs
{
    vwo,katalon,google
}


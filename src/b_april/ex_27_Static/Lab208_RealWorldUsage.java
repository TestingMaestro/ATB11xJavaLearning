package b_april.ex_27_Static;

public class Lab208_RealWorldUsage {
    public static void main(String[] args) {


        System.out.println(ATB.mentorName);
        System.out.println(ATB.courseName);
        ATB.doAssignment();
        ATB.joinZoomMeetings();


        ATB yash = new ATB();
        yash.setName("yash");
        yash.setPhNo("9148359187");
        System.out.println(yash.getName());
        System.out.println(yash.getPhNo());




        yash.howTheyDoAssignment();

        ATB sou = new ATB();
        sou.setName("sou");
        sou.setPhNo("9148359187");
        System.out.println(sou.getName());
        System.out.println(sou.getPhNo());
    }
}

class ATB {
    static {
        System.out.println("SIB---whenever class gets loaded");
    }

    {
        System.out.println("IIB - whenever object is created");
        // purpose
        /**
         * Here you can write code related to
         * start a website or anything before
         * web automation or api automation
         */

    }

    private String name;
    private String phNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    //If common----> mark them as static
    static String courseName = "JavaATB11x";
    static String mentorName = "Pramod Dutta";

    static void doAssignment() {
        System.out.println("Assignment is common to all students");
    }

    static void joinZoomMeetings() {
        System.out.println("All students must join");
    }

    void howTheyDoAssignment()
    {
        System.out.println("different");
    }
}

package Oct.ex_16102024;

public class Lab004 {
    public static void main(String[] args) {

        ATB s1 = new ATB("rudra");
        ATB s2 = new ATB("raja");
        ATB s3 = new ATB("ranga");
        ATB s4 = new ATB("rama");
    }
}

class ATB{

    {
        //this IIB

        System.out.println("write code here");
    }

    static {

        //this is SIB
        //will load once class created
        System.out.println("SIB");

    }

    protected String name;
    protected String phone;
    static String course_name= "ATB8X";

    public ATB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void readDocument(){
        System.out.println("non static method ");
    }

    static void doassignment(){
        System.out.println("Do assignment");
    }
}

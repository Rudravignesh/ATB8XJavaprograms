package Oct.ex_16102024;

public class Lab002_static {
    public static void main(String[] args) {

        person p1 = new person(23);
        person p2 = new person(23);
        System.out.println(p1.age);
        System.out.println(p2.age);

        System.out.println(person.school_name);
        person.school_name = " PVP";
        System.out.println(person.school_name);
    }






}

class person{

    int age;  //instance valiable
        static String school_name = "ABC"; // static variable

    public person(int age) {
        this.age = age;
    }
}

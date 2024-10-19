package Oct.ex_11102024_encapsulation.Superkeyword;

public class Lab001 {

    public static void main(String[] args) {


        car c = new car();  // here two objects are called due to super key word


    }

}

class car extends vahical{   // can access with in class

    private int maxspeed = 222;

    car(){
        super();// this will access default class vahical here
        System.out.println("dd car");
        System.out.println(this.maxspeed); // this is used to access my variable
        System.out.println(super.maxspeed); // super is used to access parents variable
    }
}

class vahical{

    public int maxspeed = 80;

    vahical(){
        System.out.println("RC vahical");
    }

    vahical(int a ){

        System.out.println(" PC vehical");

    }

    void message(){

        System.out.println("hello vehical");
    }

    void message(int a ){

        System.out.println("hello vehical");
    }
}
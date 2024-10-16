package Oct.ex_04102024;

import java.sql.SQLOutput;

public class Ahuman {
    String eye_colore;
    String name;
    long phone_number;

// default constructore
    Ahuman() {
        System.out.println("I will be called once object is created");

        // can write codes here
    }


    // parameterized constructore
    Ahuman(String name){
        System.out.println("my name is");
    }

    void walk(){
        System.out.println("NRNA");
    }

    int talk(){
        return 10; // retunr type with not argument
    }

    String sleep(String name){

        System.out.println("Sleeping");
        System.out.println("RTWA");
        return "I'm sleeping";
    }

    void eat(String name){

        System.out.println("eating");
        System.out.println("NRWA");

    }
}

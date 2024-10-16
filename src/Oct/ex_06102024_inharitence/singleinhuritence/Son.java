package Oct.ex_06102024_inharitence.singleinhuritence;

public class Son extends Father{

// here by using extended keyword we can access father assets also for son

    void bhk3(){

        System.out.println("3BHK");

        //attribute father
        System.out.println(gold_f);

        //behavior father
        bhk2();
    }
}

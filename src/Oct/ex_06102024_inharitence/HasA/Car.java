package Oct.ex_06102024_inharitence.HasA;

public class Car {

    //car has a engin and tyre

        protected void Startcar(){

        new Engin().Start();
        new Tyre().rolling();
    }

}

package Oct.ex_14102024.realex;

public class Wagnor extends Engine{

    void Drive(){

        Stardcar();
        Stopcar();
    }

    @Override
    void Stardcar() {
        System.out.println("Startd car");
    }

    @Override
    void Stopcar() {
        System.out.println("stop card");
    }
}

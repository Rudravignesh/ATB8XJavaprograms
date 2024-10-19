package Oct.ex_11102024_encapsulation.Superkeyword;

public class Testclass1 extends BaseClass{

    //single inheritence

    Testclass1(){

        super();
        this.setBrowser("edge", true);
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        super.setBrowser(browser, isAdmin);
    }
}

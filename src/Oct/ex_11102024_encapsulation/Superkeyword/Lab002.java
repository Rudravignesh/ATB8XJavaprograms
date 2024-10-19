package Oct.ex_11102024_encapsulation.Superkeyword;

public class Lab002 {
    public static void main(String[] args) {

        BaseClass t1 = new Testclass1(); // Dynamic dispatch
        t1.openBrowser();
        t1.closeBrowser();
    }
}

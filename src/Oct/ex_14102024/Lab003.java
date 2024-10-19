package Oct.ex_14102024;

public class Lab003 {

    public static void main(String[] args) {


        ChromeTC c = new ChromeTC();
        c.openBroswer("Chrome");
        c.closeBrowser("Chrome");
        c.Screenshot();

        Firefoxtc f = new Firefoxtc();
        f.openBroswer("Firefox");
        f.closeBrowser("Firefox");
        f.Screenshot();
    }
}

package Oct.ex_14102024;

public class ChromeTC extends BaseClass{

    @Override
    void openBroswer(String browser) {
        System.out.println("Open browser");

    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Closing browser");
    }
}

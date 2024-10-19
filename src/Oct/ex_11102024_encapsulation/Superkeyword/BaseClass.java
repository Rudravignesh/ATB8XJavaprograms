package Oct.ex_11102024_encapsulation.Superkeyword;

public class BaseClass {

    private String Browser;

    BaseClass (){

        System.out.println(" DC - Baseclass");
    }

    BaseClass( int a){

        System.out.println(" CC - Baseclass");
    }

    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if(isAdmin) {

            Browser = browser;
        }
        else{
            System.out.println("Not allowed");
        }
    }

    void openBrowser(){

        System.out.println("Chrome Browser!!");
    }

    void openBrowser(String browsername){

        System.out.println("Open browser"+ browsername);
    }

    void closeBrowser(){

        System.out.println("Closing browser!!");
    }
}

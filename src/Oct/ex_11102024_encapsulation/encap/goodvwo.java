package Oct.ex_11102024_encapsulation.encap;

public class goodvwo {

    private String userName;
    private String passward;


    public goodvwo(String passward, String userName) {
        this.passward = passward;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward , boolean isAthu) {
        if(isAthu) {
            this.passward = passward;
        }
        else{
            System.out.println("Not allowed");
        }
    }
}

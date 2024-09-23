package Step.ex_23092024;

public class Lab005 {

    public static void main(String[] args) {

        int itemcode = 003;
// new syntax for switch
        switch (itemcode){

            case 002,004 -> System.out.println("mobile phone!!");
            case 003,006 -> System.out.println("camera!!");
            default -> System.out.println("not lisited item");
        }
    }
}

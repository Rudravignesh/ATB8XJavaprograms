package Oct.ex_16102024;

public class Print extends Book{


    public Print(String name, String Auther, double price){
        super(name, Auther, price);
    }


    @Override
    void getDetails() {
        System.out.println(name);
        System.out.println(Auther);
        System.out.println(price);
    }
}

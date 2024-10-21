package Oct.ex_16102024;

public class Lab003 {
    public static void main(String[] args) {


        A a = new A();
        A a1 = new A();
        new A();
        A a2;
    }
}

class A{


    {
        System.out.println("IIB - this will exicute once object is created");
    }

    static {
        System.out.println(" this part will exicute ince class is loaded");
    }
}

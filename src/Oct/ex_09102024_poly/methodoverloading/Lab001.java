package Oct.ex_09102024_poly.methodoverloading;

public class Lab001 {
    public static void main(String[] args) {


        Mathoperation m = new Mathoperation();

        int result = m.add(3,6);
        System.out.println(result);

       String name = m.add("rudra","vignesh");

        System.out.println(name);
    }
}

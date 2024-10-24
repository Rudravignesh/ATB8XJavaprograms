package Oct.ex_23102024;

public class Lab002_exception {
    public static void main(String[] args) {


        int a = 0;
        try {
            int c = 10 / a;

            System.out.println(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("I will be always exicuted");
        }
    }
}

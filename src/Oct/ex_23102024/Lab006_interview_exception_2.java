package Oct.ex_23102024;

public class Lab006_interview_exception_2 {

    public static void main(String[] args) {


        final double pi = 3.14;
        int a = 0;

        try {
            int x = 10/a;

        } catch (Exception e) {
            System.out.println("div by zero");
        }finally {
            System.out.println("End");
        }
    }
}
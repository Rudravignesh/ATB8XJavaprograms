package Oct.ex_23102024;

public class Lab005_interview_exception {

    public static void main(String[] args) {


        try{
            String s1 = "rudra";
         //   String a1 = args[0];
            int a = 10/0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("there is some problem");
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}

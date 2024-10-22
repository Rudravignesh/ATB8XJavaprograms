package Oct.ex_21102024;

public class Lab003 {
    public static void main(String[] args) {

        String num = "10";

        // int a = num; can't assign value from non primitive to priomitve

        Integer a = Integer.valueOf(num);

        System.out.println(a);

        int a2 = a;
    }
}

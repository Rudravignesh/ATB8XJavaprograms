package Oct.ex_23102024;

public class Lab004_multicatch_with_OR {

    public static void main(String[] args) {

    int b = 0;

        try {
            String ip = args[0];
            int a = Integer.parseInt(ip); // wrapping string value to int a
             b = 100/a;
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException|ArithmeticException| NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }

    }
}

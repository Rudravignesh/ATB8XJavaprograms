package Oct.ex_23102024;

public class Lab003_multicatch {
    public static void main(String[] args) {

        try {
            String ip = args[0];
            int a = Integer.parseInt(ip); // wrapping string value to int a
            int b = 100/a;
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("End");
        }
    }
}

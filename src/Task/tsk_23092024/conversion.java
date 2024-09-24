package Task.tsk_23092024;
import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {

        System.out.println("Conversation Program");

        System.out.println("1. Kilometers to miles");
        System.out.println("2. miles to Kilometer");
        System.out.println("3. celsius to fahrenheit");
        System.out.println("4. fahrenheit to celsius");

        System.out.println("Enter the option below");

        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();  // this will scan user input

        switch (opt){

            case 1:
                System.out.println("enter in km");
                double km = scanner.nextDouble();
                double m = km * 0.621371;
                System.out.println(km+" kilometer converted into "+m+" miles");
                break;
            case 2:
                System.out.println("enter in m");
                double M = scanner.nextDouble();
                double Km = M / 0.621371;
                System.out.println(M+" miles converted into "+ Km +" kilometer");
                break;
            case 3:
                System.out.println("Enter in C'");
                double C = scanner.nextDouble();
                double F = (C * 9/5) + 32;
                System.out.println(C +"celsius is converted into fahrenheit "+ F);
                break;
            case 4:
                System.out.println("Enter in F");
                double f = scanner.nextDouble();
                double c = (f - 32) * 5/9;
                System.out.println(f +" fahrenheit is converted into celsius "+ c);
                break;

            default:
                System.out.println("invalid option, please select properly");
                break;

        }


    }
}

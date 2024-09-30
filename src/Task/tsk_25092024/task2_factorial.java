package Task.tsk_25092024;
import java.util.Scanner;


public class task2_factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the Factorial");

        int num = sc.nextInt();

        long fact = 1;

        for (int i = 1; i <=num ; ++i) {

            fact *= i;

        }
        System.out.println("factorial"+fact);

    }
}

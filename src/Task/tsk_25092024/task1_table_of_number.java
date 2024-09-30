package Task.tsk_25092024;
import java.util.Scanner;

public class task1_table_of_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the wanted table number");

        int num = sc.nextInt();

        for (int i = 1; i <=10 ; i++) {

            System.out.println(num+"*"+i+"="+(num*i));

        }
    }
}

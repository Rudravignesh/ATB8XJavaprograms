package Task.tsk_25092024;
import java.util.Scanner;

public class Task3_prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter upto number's to find prime numbers");

        int range = sc.nextInt();

        for(int i=2;i<=range;i++)
        {
            int count=0;
            for(int num=i;num>=1;num--)
            {

                if(i%num==0)
                {
                    count++;
                }
            }
            if(count==2) {
                System.out.println(i);
            }
        }

    }
}

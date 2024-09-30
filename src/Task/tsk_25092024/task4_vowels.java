package Task.tsk_25092024;
import java.util.Scanner;


public class task4_vowels {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("enter the string");
        int vowels = 0, consonents=0;
        String str = sc.next();

        String str2 = str.toLowerCase();

        for (int i = 0; i <= (str2.length() - 1) ; i++) {
            char ch = str2.charAt(i);


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else{
                consonents++;
            }
        }
        System.out.println("the vowels are"+vowels);
        System.out.println("the consonets are"+consonents);
    }
}

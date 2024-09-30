package Step.ex_25092024;

public class Lab012 {
    public static void main(String[] args) {

        for (int i = 0; i <=20 ; i++) {

            if(i%2==0){

                System.out.println("Even "+i);
                continue;  // this will take back to for loop and skip line 13
            }
            System.out.println(i);

        }
    }
}

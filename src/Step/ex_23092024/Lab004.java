package Step.ex_23092024;

public class Lab004 {
    public static void main(String[] args) {
        //JDK 13 switch statement syntax

        int item = 006;

        switch(item){
            case 002,004,006:
                System.out.println("mechanical");
                break;

                default:
                {
                    System.out.println("no idea");
                    break;
                }

            }
    }
}

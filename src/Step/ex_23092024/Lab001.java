package Step.ex_23092024;

public class Lab001 {
    public static void main(String[] args) {

        // Switch is multi way branch statement
// syntax -- switch(expression){
        //case statment 1:
        //code
        //break;
        //case statement 2:
        //break;
        //defult;

        int day = 5;

        switch (day){

            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fry");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
        }
    }
}

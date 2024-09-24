package Task.tsk_23092024;

public class calculator {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 2;
        String operation = "%";

        switch (operation){

            case "+":
                System.out.println("Addition of given numbers "+(num1+num2));
                break;
            case "-":
                System.out.println("Subtraction of given numbers "+(num1-num2));
                break;
            case "*":
                System.out.println("multiplication of given numbers  "+(num1*num2));
                break;
            case "%":
                System.out.println("madulus of given numbers "+(num1%num2));
                break;

            default:
                System.out.println("please select valid operation");
                break;
        }
    }
}

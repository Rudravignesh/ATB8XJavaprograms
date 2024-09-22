package Task;

public class newtask {
    public static void main(String[] args) {

        int  year = 1900;
        if(year % 4==0 && year %100!=0 || year%400==0)
        {
            System.out.println("This is leap year");
        }
        else {

            System.out.println("This is not leap year");

        }

    }
}

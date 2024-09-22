package Task;

public class task5_Leap_year {

    public static void main(String[] args) {

        int year = 2025;
        boolean leap_year = false;


        if (year % 4 == 0) // checks if year is divisble by 4
        {
            if(year % 100 == 0){ // checks for century year

                 if(year % 400 == 0){ // century year should also divisible by 400
                   leap_year = true;
                  }
            }
            else {
                leap_year = true ;

            }
        }


        if(leap_year){
            System.out.println(year+ "is a leap year");
        }
        else{
            System.out.println(year+ "  not a leap year");
        }
    }
}

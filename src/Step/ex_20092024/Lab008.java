package Step.ex_20092024;

public class Lab008 {
    public static void main(String[] args) {

        // Grade calculator
        //A- 100-90
        //B -80-89
        //C - 70--79
        //D - 60-69
        //F - less than 60

        double grade = 66.6654;

        if(grade >= 90){
            System.out.println("Grade A");
        } else if (grade >=80) {
            System.out.println("Grade B");

        } else if (grade >=70) {

            System.out.println("Grade C");

        } else if (grade >=60) {
            System.out.println("Grade D");
        } else if (grade <= 59) {
            System.out.println(" Fail");
        }
    }
}

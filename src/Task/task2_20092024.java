package Task;

public class task2_20092024 {

    //Ternary Operators to handle multiple conditions.

    public static void main(String[] args) {

        int score = 85;
        String grade = (score >= 90) ? "Grade A" :
                (score >= 80) ? "Grade B" :
                        (score >= 70) ? "Grade C" : "fail";
        System.out.println("Your"+grade);


    }
}

package Step.ex_18092024;

public class Lab002 {
    public static void main(String[] args) {

        long n = 2993l;

        //short s = n;  // narrowing -implicit - JVM not allowed invalid

        short s = (short)n; // narrowing -explicitly -JVM will allow with loss
    }
}

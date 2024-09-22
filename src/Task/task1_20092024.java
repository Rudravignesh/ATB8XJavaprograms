package Task;

public class task1_20092024 {
    public static void main(String[] args) {

        // condition ? expression if true : expression_if_fail

        int a = 10;
        int b = 20;
        int c = 45;

        int max = (c>a && c>b) ? c : b ;
        System.out.println(max);
    }
}

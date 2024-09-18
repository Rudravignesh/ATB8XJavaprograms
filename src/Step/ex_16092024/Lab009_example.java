package Step.ex_16092024;

public class Lab009_example {
    public static void main(String[] args) {

        byte a = 12;
        byte c = 10;
        System.out.println(a+c);

        short s = 10;
        char b = 'A';//65
        int ss = s+b; // In Java, when you perform arithmetic operations on byte variables, the result is automatically promoted to an int data type. This is because Java promotes smaller data types like byte, short, and char to int during arithmetic operations to prevent overflow issues.
        System.out.println(ss);

        char t = 'Z';
        System.out.println(t);

    }
}

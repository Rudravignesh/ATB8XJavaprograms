package Task;

public class Task3_Triangle_Classifiers {

    public static void main(String[] args) {

        //Triangle Classifier ( If)

// Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->

        int a = 40;
        int b = 20;
        int c = 10;

        if (a==b && a==c && c == b){

            System.out.println("all sides are equal");
        }
        else if (a==b || a==c || c == b) {
            System.out.println("exactly two sides are equal");

        }
        else {
            System.out.println("no sides are equal");
        }
    }
}

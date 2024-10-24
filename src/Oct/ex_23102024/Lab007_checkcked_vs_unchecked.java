package Oct.ex_23102024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab007_checkcked_vs_unchecked {
    public static void main(String[] args) {

        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("unchecked exception");
        }


        try {
            FileReader f = new FileReader(new File("C://de.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Checked ");
        }
    }
}
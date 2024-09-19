package Step.ex_18092024;

public class Lab003 {
    public static void main(String[] args) {

        //GST = 18.54%
        int course = 100;
        float gst = 18.54f;
        float total = course+gst; // no loss of data

        int total2 = course+(int)gst;
        System.out.println(total2);// loss of .54 bcz narrowing explicitly jvm will ignore so loss of data is happening
    }
}

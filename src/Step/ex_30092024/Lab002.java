package Step.ex_30092024;

public class Lab002 {
    public static void main(String[] args) {

        //1. without parameter and without return type
        //2. without parameter and with return type
        //3. with parameter and without return type
        //4. with parameter and with return type



//1. without parameter and without return type
        funcitonname();
//2. without parameter and with return type
        String name = funtion2();

        System.out.println(name);

        //3. with parameter and without return type
        function3(name = "Rudra");

        //4. with parameter and with return type

        int result = funtion4(3,6);
        System.out.println(result);
    }

    //1. without parameter and without return type
    public static void funcitonname(){
        System.out.println("Hello");
    }

    //2. without parameter and with return type
    public static String funtion2() {
        System.out.println("Hello");
        return"Rdura";

    }
    //3. with parameter and without return type
    public static void function3(String name){
        System.out.println("the name shared is ->"+name);
    }

    //4. with parameter and with return type

    public static int funtion4(int a, int b){
        System.out.println("fourth funtion type ");
        return a+b;
    }

}

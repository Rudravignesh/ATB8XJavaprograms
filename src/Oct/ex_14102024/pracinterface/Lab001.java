package Oct.ex_14102024.pracinterface;

public class Lab001 {
    public static void main(String[] args) {
p p = new p();
p.f1();
    }

}

class p implements I{

    @Override
    public void f1() {
        System.out.println("P");
    }
}


interface I{

    void f1();
}

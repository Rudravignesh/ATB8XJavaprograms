package Oct.ex_16102024;

abstract class Book {
    protected String name;
    protected String Auther;
    protected double price;


    public Book(String name, String auther, double price) {
        this.name = name;
        Auther = auther;
        this.price = price;
    }

    abstract void getDetails();
}

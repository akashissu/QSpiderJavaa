package classAndObject;

public class productDriver {
    
    public static void main(String[] args) {
        
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();


        p1.name = "pen";
        p1.price = 10.88;
        p1.pid = "11EW";
        p1.printDetails();


        p2.name = "NoteBook";
        p2.price = 100.88;
        p2.pid = "11EWer";
        p2.printDetails();


        p3.name = "Book";
        p3.price = 300.88;
        p3.pid = "11EEEWer";
        p3.printDetails();



    }
}

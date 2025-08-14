package classAndObject;

public class MobileDriver {
    public static void main(String[] args) {
        
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();

        m1.name = "Samsung";
        m1.price = 8999.99;
        m1.ScreenSize = "6.7";
        m1.printDetails();


        m2.name = "Apple";
        m2.price = 49999.99;
        m2.ScreenSize = "5.7";
        m2.printDetails();

        m3.name = "realme";
        m3.price = 4999.99;
        m3.ScreenSize = "7.8";
        m3.printDetails();
       

    }
}

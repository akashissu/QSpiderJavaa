package classAndObject;

public class fruitDriver{
    public static void main(String[] args) {
        fruit f1 = new fruit();
        fruit f2 = new fruit();
        fruit f3 = new fruit();

        
        // f2.printDetails();
        // f3.printDetails();

        f1.name = "Apple";
        f1.price = 300.0;
        f1.quantity = "4kg";
        f1.printDetails();
        
        f2.name = "Mango";
        f2.price = 45;
        f2.quantity = "5kg";
        f2.printDetails();

        f3.name = "papaya";
        f3.price = 55;
        f3.quantity = "10kg";
        f3.printDetails();
    }
}

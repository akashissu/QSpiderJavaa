package classAndObject;

public class OrderDriver {

    public static void main(String[] args) {


       Order o1 = new Order();
       Order o2 = new Order();
       Order o3 = new Order();

       o1.name = "moble";
       o1.price = 29999.99;
       o1.quantity = "5";
       o1.printDetails();


       o2.name = "Laptop";
       o2.price = 49999.99;
       o2.quantity = "5";
       o2.printDetails();


       o3.name = "PlayStation";
       o3.price = 59999.99;
       o3.quantity = "5";
       o3.printDetails();   
    }
    
}

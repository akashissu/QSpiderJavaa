package ObjectReference;

public class AllFileReferDriver {
    public static void main(String[] args) {


        Student s = new Student();
        System.out.println("Name Of the Student is:"+s.name);
        System.out.println("Name Of the Student is:"+s.rollNo);
        System.out.println("Name Of the Student is:"+s.marks);
        System.out.println("=================================");

        Mobile m = new Mobile();
        System.out.println("Name of the Mobile Is:"+m.brand);
        System.out.println("Price Of Mobile Is:"+m.price);
        System.out.println("Colour Of Mobile is"+m.colour);
        System.out.println("=================================");

        Order o = new Order();
        System.out.println("Brand Of the Order Is: "+o.Brand);
        System.out.println("Price Of the Order Is: "+o.price);
        System.out.println("Name Of the Order Is: "+o.Name);
        System.out.println("=================================");

        Vehicle v = new Vehicle();
        System.out.println("Name of the Vehicle is :"+v.name);
        System.out.println("Price Of Vehicle :"+v.price);
        System.out.println("Colour Of Vehicle :"+v.colour);
        
    }
}

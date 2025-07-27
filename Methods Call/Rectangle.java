public class Rectangle {

    public static  double calculateArea(double length, double width){
        return length * width;
    }

    public static double calculateperimeter(double length , double width){
        return (2*(length+width));
    }



public static void main(String[] args){
    double length = 44.67;
    double width = 30.75;

    double area = calculateArea(length, width);
    double perimeter = calculateperimeter(length,width);

    System.out.println("Area Of rectangle : "  +area);
    System.out.println("Perimeter Of rectangle : "  +perimeter);

}
}


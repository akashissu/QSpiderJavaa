public class circle {
    public static double circleArea(double radius){
        return 3.14*(radius*radius);
    }

    public static double circlePerimeter(double radius){
        return 2*3.14*(radius);
    }


    public static void main(String[] args) {
        
        double radius = 45.55;

        double area = circleArea(radius);
        double perimeter = circlePerimeter(radius);

        System.out.println("Area Of Circle is :" +area);
        System.out.println("Perimeter Of Circle" + perimeter);

    }
    
}
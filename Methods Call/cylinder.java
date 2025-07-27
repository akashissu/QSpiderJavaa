public class cylinder {

    public static double calculateAreaOfCylinder(double radius,double height){
       return 2*3.14*radius*height;
    }

    public static double calculateTotalAreaOfCylinder(double radius,double height){
       return 2*3.14*radius*(radius+height);     
    }

    public static double calculateVolumeOfCylinder(double radius,double height){
        return 3.14*radius*radius*height;
    }


     public static void main(String[] args) {
        double radius = 32.33;
        double height = 10.11;

        double area = calculateAreaOfCylinder(radius,height);
        double totalArea = calculateTotalAreaOfCylinder(radius, height);
        double volumeOfCylinder = calculateVolumeOfCylinder(radius, height);

        System.out.println("Area Of Cylinder : " +area);
        System.out.println("Area Of Cylinder : " +totalArea);
        System.out.println("Volume Of Cylinder : " +volumeOfCylinder);

     }   
}

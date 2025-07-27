public class sphere {
    public static double volumeOfSphere(double radius){
        return 4/3*3.14*radius*radius*radius;
    }

    public static double AreaOfSphere(double radius){
        return 4*3.14*radius*radius;
    }


    public static void main(String[] args) {
        double radius = 34.77;


        double volumesphere = volumeOfSphere(radius);
        double areasphere = AreaOfSphere(radius);

        System.out.println("The Volume Of Sphere : " +volumesphere);
        System.out.println("The Area Of Sphere : " +areasphere);
    }
    
}

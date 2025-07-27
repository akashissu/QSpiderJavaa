public class cuboid {
    public static double AreaOfCuboid(double length,double width,double height){
        return 2*((length*width) + (width*height) + (length*height));
    }

    public static double perimeterOfCuboid(double length,double width,double height){
        return 4*((length+width+height));
    }

    public static double volumeOfCuboid(double length,double width,double height){
        return (length*width*height);
    }


public static void main(String[] args){

    double length = 34.01;
    double width = 12.55;
    double height = 15.44;
    
    double areaCuboid = AreaOfCuboid(length,width,height);
    double perimeterCuboid = perimeterOfCuboid(length,width,height);
    double volumeCuboid = volumeOfCuboid(length,width,height);
    
    System.out.println("Area Of Cuboid: " +areaCuboid);
    System.out.println("Perimeter Of Cuboid : " +perimeterCuboid);
    System.out.println("Volume Of Cuboid : " +volumeCuboid);

}

}

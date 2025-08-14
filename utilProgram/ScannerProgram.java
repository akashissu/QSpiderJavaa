package utilProgram;
import java.util.Scanner;

public class ScannerProgram {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Value Of a: ");
    double a = sc.nextDouble();
    System.out.print("Enter The Value of b: ");
    double b = sc.nextDouble();

    double sum = a+b;

    System.out.print("The Sum Of Value Of a + b is :"+sum);

}
}

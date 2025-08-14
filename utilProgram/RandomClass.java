package utilProgram;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args){
        Random r = new Random();
        int min = 300;
        int max = 500;
        int num = min + r.nextInt(max-min);
        System.out.println("The Number Is :"+num);
        System.out.println("The Random No is: "+r.nextInt());

    }
}

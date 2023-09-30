package Week_4;

import java.awt.*;

public class RollSimpleDie {

    public static void main(String[] args){
        SimpleDie sd1 = new SimpleDie();
        SimpleDie sd2 = new SimpleDie();


        System.out.println(sd1);
        System.out.println(sd2);

        System.out.println("sd1.faceValue at creation = " + sd1.getFaceValue());
        System.out.println("sd2.faceValue at creation = " + sd2.getFaceValue());

        sd1.setFaceValue(5);
        sd2.setFaceValue(10);

        sd1.roll();
        sd2.roll();

        int fv1 = sd1.getFaceValue();
        int fv2 = sd2.getFaceValue();

        System.out.println("fv1: "+ fv1);
        System.out.println("fv2: "+ fv2);

    }

}

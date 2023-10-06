package Week_4;

import java.awt.*;

public class RollSimpleDie {

    public static void main(String[] args){
        SimpleDie sd1 = new SimpleDie();
        SimpleDie sd2 = new SimpleDie();

       sd1.roll();
       sd1.setFaceValue(5);

        sd1.setColor("green");

        System.out.println("The color for sd1 is " + sd1.getColor());

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

        if(sd1.equals(sd2)){
            System.out.println("Roll 1's face value is greater.");
        }else if(sd1.compareTo(sd2)==0){
            System.out.println("Roll 1's face value is same as Roll 2.");
        }else{
            System.out.println("Roll 2's face value is greater.");
        }

        int sum = faceValueSum(sd1, sd2);


    }

    private static int faceValueSum(SimpleDie objOne, SimpleDie objTwo){
        return objOne.getFaceValue() + objTwo.getFaceValue();
    }

}

package Week_4;

import java.util.Random;

public class SimpleDie {
    private int faceValue;

    // this is the color of a die
    private String color;
    public final int MAX = 6;  // maximum face value

    public SimpleDie(){
        faceValue = 1;
    }

    // this method return the faceValue
    public int getFaceValue(){
        return faceValue;
    }

    public void setFaceValue(int newValue){
        if(newValue > 7 || newValue < 1){
            System.out.println("ERROR: Out of range (only 1-6 allowed)");
        }else{
            faceValue = newValue;
        }
    }

    // roll method will return a random integer between 1 to 6
    // and use it as the factValue
    public void roll(){
        Random generator = new Random();
        faceValue = generator.nextInt(6);
        faceValue = increment();
    }

    private int increment(){
        faceValue = faceValue+1;
        return faceValue;
    }

    @Override
    public String toString() {
        return "This SimpleDie object has the value: " + faceValue;
    }

    public int compareTo(SimpleDie sd2) {
        if(faceValue>sd2.getFaceValue()) return 1;
        else if (faceValue== sd2.getFaceValue()) return 0;
        else return -1;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        color = newColor;
    }
}

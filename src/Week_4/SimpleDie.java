package Week_4;

import java.util.Random;

public class SimpleDie {
    private int faceValue;

    public SimpleDie(){
        faceValue = 1;
    }

    // this method return the faceValue
    public int getFaceValue(){
        return faceValue;
    }

    public void setFaceValue(int newValue){
            faceValue = newValue;
    }

    // roll method will return a random integer between 1 to 6
    // and use it as the factValue
    public void roll(){
        Random generator = new Random();
        faceValue = generator.nextInt(6)+1;
    }

    @Override
    public String toString() {
        return "This SimpleDie object has the value: " + faceValue;
    }
}

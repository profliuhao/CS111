package Midterm;

public class ECar {

    private int range;

    private String model;

    public ECar(int range, String model) {
        this.range = range;
        this.model = model;
    }


    public int getRange() {
        return this.range;
    }

    public String getModel() {
        return this.model;
    }

    public void setRange(int newRange) {
        this.range = newRange;
    }

    public String toString() {
        return "The model is " + this.model + "\n The range is " + this.range;
    }


    public int compareTo(ECar otherCar) {
        if (this.range > otherCar.getRange()) {
            return 1;
        } else if (this.range < otherCar.getRange()) {
            return -1;
        }else{
            return 0;
        }
    }
}



package Week_7;

public class VolumeCalculator {
    public double calculateVolume(double sideLength) {
        return sideLength * sideLength * sideLength;
    }

    public double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius,2) * height;
    }


}

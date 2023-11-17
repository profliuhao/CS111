package Week_7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VolumeCalculatorTest {

    @Test
    public void testCubeVolume() {
        VolumeCalculator calculator = new VolumeCalculator();
        double sideLength = 5.0;
        double expectedVolume = 125.0;  // 5^3 = 125
        double actualVolume = calculator.calculateVolume(sideLength);
        assertEquals(expectedVolume, actualVolume, 0.01);  // Allowing a small margin of error
    }

    @Test
    public void testCylinderVolume() {
        VolumeCalculator calculator = new VolumeCalculator();
        double radius = 3.0;
        double height = 6.0;
        double expectedVolume = 169.65;  // π * 3^2 * 6
        double actualVolume = calculator.calculateVolume(radius, height);
        assertEquals(expectedVolume, actualVolume, 0.01);
    }

    @Test
    public void testSphereVolume() {
        VolumeCalculator calculator = new VolumeCalculator();
        double radius = 4.0;
        double expectedVolume = 268.08;  // 4/3 * π * 4^3
        double actualVolume = calculator.calculateVolume(radius);
        assertEquals(expectedVolume, actualVolume, 0.01);
    }
}


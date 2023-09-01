import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);

        // Display the calculated area
        System.out.println("The area of the circle is: " + area);

        // Close the scanner to free up resources
        scanner.close();
    }
}

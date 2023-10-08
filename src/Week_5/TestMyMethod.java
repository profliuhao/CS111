package Week_5;

import java.util.Scanner;

public class TestMyMethod {

    public static void main(String[] args) {
        //Create scanner objects
        // fill in here
        Scanner scanner = new Scanner(System.in);

        //Create an object of the class MyMethods.
        // fill in here
        MyMethods mm = new MyMethods();

        //Part 1. get user input for surface area, print results
        int wid, len, heig;

        System.out.print("Enter width: ");
        // fill in here
        wid = scanner.nextInt();

        System.out.print("Enter length: ");
        // fill in here
        len = scanner.nextInt();

        System.out.print("Enter the height: ");
        // fill in here
        heig = scanner.nextInt();

        // calculate the surface area
        // fill in here
        int area = mm.surface(wid, len);
        System.out.println("area = " + area);
        System.out.println();

        //Part 2 get user input for right triangle, print results
        double sd1, hypot;
        System.out.print("Enter side: ");
        // fill in here
        sd1 = scanner.nextDouble();

        System.out.print("Enter hypotenuse: ");
        // fill in here
        hypot = scanner.nextDouble();

        // calculate the other side and print using the rightTriangle method
        // fill in here
        double sd2 = mm.rightTriangle(sd1, hypot);
        System.out.println("The other side is = " + sd2);

        System.out.println();

        //Create two new objects of the Die class.
//        Die dice1 = new Die();
//        Die dice2 = new Die();

        //Create an object of the class PairOfDice.


        //Get user input for color of dice
        System.out.print("Enter color of first die: ");
        // fill in here

        System.out.print("Enter color of second die: ");
        // fill in here

        System.out.println();

        //Get user input for face values
        System.out.print("Enter face value of first dice: ");
        // fill in here
        System.out.print("Enter face value of second dice: ");
        // fill in here

        System.out.println();
    }

}

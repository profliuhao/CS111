package Week_3;//********************************************************************
//  CircleStats.java       Author: Lewis/Loftus
//
//  Demonstrates the formatting of decimal values using the
//  DecimalFormat class.
//********************************************************************

import java.math.RoundingMode;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CircleStats
{
    //-----------------------------------------------------------------
    //  Calculates the area and circumference of a circle given its
    //  radius.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        int radius;
        double area, circumference;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the circle's radius: ");
        radius = scan.nextInt();

        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;

        // Round the output to three decimal places
        DecimalFormat fmt = new DecimalFormat("0.###");
//        fmt.setRoundingMode(RoundingMode.DOWN);


        System.out.println("The circle's area (without formatting): " + area);
        System.out.println("The circle's area: " + fmt.format(area));
        System.out.println("The circle's circumference: "
                + fmt.format(circumference));
    }
}

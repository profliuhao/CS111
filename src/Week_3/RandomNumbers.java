package Week_3;//********************************************************************
//  RandomNumbers.java       Author: Lewis/Loftus
//
//  Demonstrates the creation of pseudo-random numbers using the
//  Random class.
//********************************************************************

import java.util.Random;
public class RandomNumbers
{
    //-----------------------------------------------------------------
    //  Generates random numbers in various ranges.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Random generator = new Random();
        int num1;
        float num2;

        num1 = generator.nextInt();
        System.out.println("A random integer: " + num1);

        num1 = generator.nextInt(10);
        System.out.println("From 0 to 9: " + num1);

        num1 = generator.nextInt(10) + 1;
        System.out.println("From 1 to 10: " + num1);

        num1 = generator.nextInt(15) + 20;
        System.out.println("From 20 to 34: " + num1);

        num1 = generator.nextInt(20) - 10;
        System.out.println("From -10 to 9: " + num1);

        num2 = generator.nextFloat();
        System.out.println("A random float (between 0-1): " + num2);

        num2 = generator.nextFloat() * 6;  // 0.0 to 5.999999
        System.out.println("num2 = " + num2);
        num1 = (int)num2 + 1;
        System.out.println("From 1 to 6: " + num1);



        // Create a Random object with a specific seed (e.g., 123)
        Random random1 = new Random(321);

        // Generate random numbers using random1
        System.out.println("Random numbers with seed 123:");
        for (int i = 0; i < 5; i++) {
            System.out.println(random1.nextInt(100)); // Generate random integer between 0 and 99
        }

        // Create another Random object with the same seed (123)
        Random random2 = new Random(321);

        // Generate random numbers using random2
        System.out.println("\\nRandom numbers with the same seed 123 (should be the same as above):");
        for (int i = 0; i < 5; i++) {
            System.out.println(random2.nextInt(100)); // Generate random integer between 0 and 99
        }
    }
}

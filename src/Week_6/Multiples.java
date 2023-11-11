//********************************************************************
//  Multiples.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a for loop.
//********************************************************************

import java.util.Scanner;

public class Multiples
{
    //-----------------------------------------------------------------
    //  Prints multiples of a user-specified number up to a user-
    //  specified limit.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        int num1, num2, num3;
        num1 = -5;
        num2 = -3;
        num3 = 8;

        if (num1>num2){
            System.out.println("the larger number is " + num1);
        }else{
            System.out.println("the larger number is " + num2);
        }

        int larger =  (num1+3 > num2) ? (num1+5) : (num3-num2);
        System.out.println("the larger number is " + larger);

        for (int i = 0; i < 10; i++ ){
            System.out.println("i = " + i);
        }


        final int PER_LINE = 5;
        int value, limit, mult, count = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive value: ");
        value = scan.nextInt();

        System.out.print("Enter an upper limit: ");
        limit = scan.nextInt();

        System.out.println();
        System.out.println("The multiples of " + value + " between " +
                value + " and " + limit + " (inclusive) are:");

        for (mult = value; mult <= limit; mult += value)
        {
            System.out.print(mult + "\t");

            // Print a specific number of values per line of output
            count++;
            if (count % PER_LINE == 0)
                System.out.println();
        }
    }
}

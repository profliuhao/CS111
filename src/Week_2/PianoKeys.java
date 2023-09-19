package Week_2;//********************************************************************
//  PianoKeys.java       Author: Lewis/Loftus
//
//  Demonstrates the declaration, initialization, and use of an
//  integer variable.
//********************************************************************

public class PianoKeys
{
    //-----------------------------------------------------------------
    //  Prints the number of keys on a piano.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        int keys = 88;
        System.out.println("A piano has " + keys + " keys.");
        keys = 67;
        System.out.println("A piano has " + keys + " keys.");

        int base, max_count;
        base = 5;
        max_count = 89;


        System.out.println(base + max_count);

        final int MAX_LOAD = 250;
        System.out.println("maximum load is " + MAX_LOAD);
//        MAX_LOAD = 350;
//        System.out.println("maximum load is " + MAX_LOAD);


        int result = (int) Math.pow(2, 7);
        System.out.println("result is " + result);

        result = (int) Math.pow(2, 15);
        System.out.println("result is " + result);

        result = (int) Math.pow(2, 31);
        System.out.println("result is " + result);

        double large_result = Math.pow(2, 63);
        System.out.println("result is " + large_result);

        char aChar = '@';
        System.out.println(aChar);

        System.out.println(3%10);
        System.out.println(10%3);
    }
}

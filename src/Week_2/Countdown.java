package Week_2;//********************************************************************
//  Countdown.java       Author: Lewis/Loftus
//
//  Demonstrates the difference between print and println.
//********************************************************************

public class Countdown
{
    //-----------------------------------------------------------------
    //  Prints two lines of output representing a rocket countdown.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        String str = "This is a string literal";
        System.out.println(str);
        System.out.print("Three... ");
        System.out.print("Two... ");
        System.out.print("One... ");
        System.out.print("Zero... ");
        System.out.println("Liftoff!");  // appears on first output line
        System.out.println("Houston, we have a problem.");
    }
}

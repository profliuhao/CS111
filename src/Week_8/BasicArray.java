//********************************************************************
//  BasicArray.java       Author: Lewis/Loftus
//
//  Demonstrates basic array declaration and use.
//********************************************************************

public class BasicArray
{
    //-----------------------------------------------------------------
    //  Creates an array, fills it with various integer values,
    //  modifies one value, then prints them out.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        final int LIMIT = 15, MULTIPLE = 10;

        int[] list = new int[LIMIT];

        //  Initialize the array values
        for (int index = 0; index < LIMIT; index++)
            list[index] = index * MULTIPLE;

        list[5] = 999;  // change one array value
        list[0] = 25;
        list[list.length-1] = 1999;

        //  Print the array values
        for (int value : list)
            System.out.print(value + "  ");

        for (int index = LIMIT-1; index >= 0; index--)
            list[index] = index * MULTIPLE;
    }
}

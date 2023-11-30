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

//        int[] list = new int[LIMIT];
        int[] list = new int[15];

        //  Initialize the array values
        for (int index = 0; index <= list.length-1; index++)
            list[index] = index * MULTIPLE;

        list[5] = 999;  // change one array value
        list[0] = 25;
        list[list.length-1] = 1999;

        //  Print the array values
        for (int value : list)
            System.out.print(value + "  ");

        for (int index = LIMIT-1; index >= 0; index--)
            list[index] = index * MULTIPLE;

        System.out.println();
        for (int index = list.length-1; index>=0; index--){
            System.out.println(list[index]);
        }

        double[] numbers = new double[10];
        numbers[0] = 1.0;
        numbers[1] = 3.0;
        numbers[2] = 2.0;
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);

        double[] numbers2 = {1.0, 3.0, 2.0, 5.0, 10.9};
        for( double num : numbers2){
            System.out.println(num);
        }

        String[] words = new String[5];
        System.out.println("words[0] = " + words[0]);
        words[0] = "Hello";
        words[words.length-1] = "World";
        System.out.println(words[0] + " " + words[words.length-1]);


    }
}

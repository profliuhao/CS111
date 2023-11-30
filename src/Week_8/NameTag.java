
//********************************************************************
//  NameTag.java       Author: Lewis/Loftus
//
//  Demonstrates the use of command line arguments.
//********************************************************************

public class NameTag
{
    //-----------------------------------------------------------------
    //  Prints a simple name tag using a greeting and a name that is
    //  specified by the user.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        System.out.println();
//        System.out.println("     " + args[0]);
//        System.out.println("My name is " + args[1]);

       double result = NameTag.average(3,4,6,55,3,7,9,10);
        System.out.println("result = " + result);

    }
    public static double average(int ... list)
    {
        double result = 0.0;
        if (list.length != 0)
        {
            int sum = 0;
            for (int num : list)
                sum += num;
            result = (double)sum / list.length;
        }
        return result;
    }


    public static double average(int a, int b, int c){
        return (a+b+c)/3.0;
    }

    public static double average(int a, int b, int c, int d, int e, int f, int g){
        return (a+b+c+d+e+f+g)/7.0;
    }

    public static double average(int a, int b, int c, int d, int e){
        return (a+b+c+d+e)/5.0;
    }
}

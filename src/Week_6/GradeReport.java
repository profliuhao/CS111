//********************************************************************
//  GradeReport.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a switch statement.
//********************************************************************

import java.util.Scanner;

public class GradeReport
{
    //-----------------------------------------------------------------
    //  Reads a grade from the user and prints comments accordingly.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        int grade, category;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a numeric number (1 to 15): ");
        int mynumber = scan.nextInt();

        switch (mynumber%10){
            case 1:
                System.out.println("the reminder is 1");
                break;
            case 2:
                System.out.println("the reminder is 2");
                break;
            case 5:
                System.out.println("the reminder is 5");
                break;
            default:
                System.out.println("No match");
        }
        System.out.println("we are done here");

        System.out.print("Enter a numeric grade (0 to 100): ");
        grade = scan.nextInt();

        category = grade / 10;

        System.out.print("That grade is ");

        switch (category)
        {
        case 10:
            System.out.println("a perfect score. Well done.");
            System.out.println("Congratulations!");
            break;
        case 9:
            System.out.println("well above average. Excellent.");
            System.out.println("almost perfect!");
            break;
        case 8:
            System.out.println("above average. Nice job.");
            break;
        case 7:
            System.out.println("average.");
            break;
        case 6:
            System.out.println("below average. You should see the");
            System.out.println("instructor to clarify the material "
                              + "presented in class.");
            break;
        default:
            System.out.println("not passing.");
        }
    }
}

package Midterm;

import java.util.Random;
import java.util.Scanner;

public class MidtermAnswer {

    public static void main(String[] args) {

        double z = 55.0/10;
        System.out.println(z);

        Scanner scan = new Scanner(System.in);
        String astr = new String("Hello World!");

        String s1 = "mid_1".toUpperCase()+"_111";
        String s2 = new String("MID_1_111");
        System.out.println(s1);
        System.out.println(s2);


        int a=1,b=0,c=1;
        if (b == 0)
            if (a == 0)
                c += 2;
        else
            c += 3;
        System.out.println("c: "+c);


        int count = 10, val=2; while (count > 0){
            System.out.println("Welcome to Java"); count-=val;
        }

        Random gen = new Random();
        int test1 = gen.nextInt()*10-5;
        System.out.println("test1 = " + test1);

        int test2 = gen.nextInt(10)-5;
        System.out.println("test1 = " + test2);



    }

}

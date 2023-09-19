package Week_2;

public class Week2Demo {

    public static void main(String[] args) {


        System.out.println(3%10);
        System.out.println(10/3);
        System.out.println(14/3.0);

        char ac = '1';
        System.out.println("ac = " + ac);
        char ab = '|';
        System.out.println("ab = " + ab);
        
        boolean done = true;
//        System.out.println("done = " + done);
        if (!done)
            System.out.println("done = " + done);

        
        
        int count = 5;
        int result;
        result = count++;
        System.out.println(count);
        System.out.println(result);

        count = 5;
        result = ++count;
        System.out.println(count);
        System.out.println(result);

        count = 5;
        result = 6;
        count %= result;
//        count = count / result;
        System.out.println("count = " + count);
        System.out.println("result = " + result);

    }

}

package Week_6;

public class Module6 {
    public static void main(String[] args) {


        for ( int i =0; i < 10 ; i++ ){
            System.out.println("i = " + i);
        }
        System.out.println("We are done!");

        final int MAX_ROWS = 10;

        for (int row = 1; row <= MAX_ROWS; row++)
        {
            for (int star = 1; star <= row; star++){
                System.out.print("*");
            }

            System.out.println();
        }



    }
}

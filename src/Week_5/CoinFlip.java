//********************************************************************
//  CoinFlip.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an if-else statement.
//********************************************************************
package Week_5;
public class CoinFlip
{
    //-----------------------------------------------------------------
    //  Creates a Coin object, flips it, and prints the results.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Coin myCoin = new Coin();

        Coin myCoin2 = new Coin();

//        if (myCoin == myCoin2){
//            System.out.println("Same coin!");
//        }

        if(myCoin.equals(myCoin2)){
            System.out.println("Their face value are same!");
        }


//        myCoin.flip();
//
//        System.out.println(myCoin);
//
//        if (myCoin.isHeads())
//            System.out.println("You win.");
//        else
//            System.out.println("Better luck next time.");
//
//
//        Coin myCoin2 = myCoin;
//
//        if (myCoin == myCoin2){
//            System.out.println("Same!");
//        }
//
//        Coin myCoin3 = new Coin();
//        if (myCoin == myCoin3){
//            System.out.println("Same!");
//        }else{
//            System.out.println("Not Same!");
//        }


    }
}

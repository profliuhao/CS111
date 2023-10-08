package Week_5;

public class MyMethods
{ 

   //-----------------------------------------------------------------
   //  Write the surface method.
   //-----------------------------------------------------------------
    public int surface(int width, int length){
        int result = 2*(width * length);
        return result;
    }

   //-----------------------------------------------------------------
   //  write the rightTriangle method
   //-----------------------------------------------------------------
    public double rightTriangle(double sideA, double sideHyp){
        double result = sideHyp*sideHyp - sideA* sideA;

        if (result > 20){
            System.out.println("The difference is huge!");
        }else {
            System.out.println("The difference is small!");
        }

        return result;
    }
     
   //-----------------------------------------------------------------
   //  write the comboDie methods.
   //-----------------------------------------------------------------
//    public Die comboDie(Die die1, Die die2){
//        Die newDie = new Die();
//        newDie.setColor(die1.getColor()+die2.getColor());
//
//        return newDie;
//    }
     
}
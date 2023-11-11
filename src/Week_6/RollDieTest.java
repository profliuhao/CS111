package Week_6;
import Week_4.Die;

public class RollDieTest {

    public static void main(String[] args) {

        Die die = new Die();
        int count = 0;
        for (int num=1; num <= 100; num++){
            if (die.roll() == 3){
                count++;
            }
        }
        System.out.println(count);

        for( ; ; ){
            System.out.println("Here");
        }

    }
}

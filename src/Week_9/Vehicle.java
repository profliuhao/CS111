package Week_9;

public class Vehicle {

    protected int speed = 0;

    public Vehicle(int intSpeed){

        speed = intSpeed;
    }
    public void displaySpeed(){
        System.out.println("The current speed is "+ speed);
    }

    public void accSpeed(int num){
        speed += num;
    }

    public int getSpeed(){
        return speed;
    }

}

package Week_10;

import Week_9.Car;
import Week_9.Vehicle;

public class CarDemo2 {

    public static void main(String[] args) {

        Vehicle v1;
        v1 = new Car(5, "Toyota", "Camery", 2020);
        v1.displaySpeed();
        v1.accSpeed(5);  // call the override version, increase the speed twice
        v1.displaySpeed();
        v1 = new Vehicle(20);
        v1.accSpeed(5);  // call the parent version, increase the speed once
        v1.displaySpeed();
        System.out.println("=================================");

        Vehicle v2;
        v2 = new Car(20, "Toyota", "Camery", 2022);
//         v2.decreaseSpeed();  // error
        ((Car) v2).decreaseSpeed(5);  // no error -- cast the object type from Vehicle to Car


        System.out.println("=================================");
        Vehicle[] vlist = new Vehicle[3];
        vlist[0] = v1;
        vlist[1] = new Vehicle(10);
        vlist[2] = new Car(100, "Tesla", "model 3", 2023);


        int maxSpeed =0;
        for(Vehicle veh: vlist){
            if (veh.getSpeed() > maxSpeed){
                maxSpeed = veh.getSpeed();
            }
        }
        System.out.println("maxSpeed = " + maxSpeed);


    }
}

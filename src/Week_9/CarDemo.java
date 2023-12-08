package Week_9;

public class CarDemo {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(10);
        v1.accSpeed(5);
        v1.displaySpeed();

        Car car1 = new Car(10, "Toyot", "S", 2020);
        car1.accSpeed(5);
        car1.displaySpeed();


        car1.setBrand("Toyota");
        System.out.println("car1.getBrand() = " + car1.getBrand());

        car1.displaySpeed(); // method in parent class
        car1.accSpeed(5);  // method in parent class
        car1.displaySpeed(); // method in parent class
        car1.decreaseSpeed(3); // method in child class
        car1.displaySpeed();

    }
}

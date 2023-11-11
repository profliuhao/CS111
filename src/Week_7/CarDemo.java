package Week_7;

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println("Car is running.");
    }
}

class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}


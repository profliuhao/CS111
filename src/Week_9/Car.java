package Week_9;

public class Car extends Vehicle{

    private String brand = "";
    private String model = "";
    private int year = 2000;

    public Car(int intSpeed, String brand, String model, int year) {
        super(intSpeed);  // call parent's constructor
        this.brand = brand;
        this.model = model;
        this.year = year;
//        super(intSpeed);
    }

    public void decreaseSpeed(int num){
        System.out.println(super.speed);
        this.speed -= num;
        super.displaySpeed();
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    @Override
    public void accSpeed(int num) {
        super.accSpeed(num);
        speed += num;
    }
}

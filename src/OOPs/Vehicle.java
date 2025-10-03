package OOPs;


//Base Class
public class Vehicle {

    String name;
    int speed;
    int wheels;
    String color;

    public Vehicle(){

    }
    public Vehicle(String name, int speed, int wheels, String color){
        this.name=name;
        this.wheels=wheels;
        this.color=color;
        this.speed=speed;

    }

    void startVehicle(){
        System.out.println("Vehicle has Started!");

    }

    void stopVehicle(){
        System.out.println("Vehicle has Stopped!");
    }

}


//Child class
class Car extends Vehicle{

    private String brand;

    public Car(String brand){
        this.brand=brand;
    }

    String getBrand(){
        return this.brand;
    }

    public static void main(String[] args) {

        Car myCar=new Car("RRR");

        myCar.startVehicle();
        myCar.stopVehicle();
        System.out.println(myCar.getBrand());


    }


}





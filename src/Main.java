class Vehicle {
    String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    public void display() {
        System.out.println("Vehicle brand: " + this.brand);
    }
}

class Car extends Vehicle {
    String model;

    public Car(String brand, String model){
        super(brand);
        this.model = model;
    }
}

class Train extends Vehicle {
    String name;

    public Train(String brand, String name){
        super(brand);
        this.name = name;
    }

    public void display(){
        System.out.println("Vehicle brand: " + super.brand + " name:" + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("kia","kia model");
        Train train = new Train("코레일","1T1222");

        car.display();
        train.display();
    }
}

//      Vehicle car = new Car("kia","kia model");
//        Car train = new Train("코레일","1T1222");
//        Vehicle[] vehicles = {car, train};
//Vehicle[] vehicles = {car, train};
//        Car car = new Car("kia","kia model");
//        Train train = new Train("코레일","1T1222");
//
//        car = new Train("a", "1");
//
//        Vehicle[] vehicles = {car, train};
//
//        car.display();
//        train.display()
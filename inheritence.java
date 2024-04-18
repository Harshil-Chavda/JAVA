// Parent class
class Vehicle {
    void drive() {
        System.out.println("Vehicle is being driven...");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    void start() {
        System.out.println("Car engine started...");
    }
}

// Grandchild class inheriting from Car
class SportsCar extends Car {
    void accelerate() {
        System.out.println("SportsCar is accelerating...");
    }
}

// inheritence class
public class inheritence {
    public static void inheritence(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.drive(); // Call method from Vehicle class
        sportsCar.start(); // Call method from Car class
        sportsCar.accelerate(); // Call method from SportsCar class
    }
}

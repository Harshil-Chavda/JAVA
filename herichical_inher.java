class Car {
    String brand;
    Car(String brand) {
        this.brand = brand;
    }
    void display() {
        System.out.println("This is a " + brand + " car");
    }
}
class luxury extends Car {
    luxury(String brand) {
        super(brand);
    }
    void display() {
        System.out.println("This is a " + brand + " luxury");
    }
}
class SUV extends Car {
    SUV(String brand) {
        super(brand);
    }
    void display() {
        System.out.println("This is a " + brand + " SUV");
    }
}
class herichical_inher {
    public static void main(String[] args) {
        luxury luxury = new luxury("Rolls Royce");
        SUV suv = new SUV("Jeep");
        luxury.display();
        suv.display();
    }
}

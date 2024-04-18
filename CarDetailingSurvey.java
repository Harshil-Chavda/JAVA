import java.util.Scanner;

// Define a class to represent a Car
class Car {
    private String make;
    private String model;
    private int year;
    private int exteriorRating;
    private int interiorRating;
    private int performanceRating;
    private int comfortRating;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter and setter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getExteriorRating() {
        return exteriorRating;
    }

    public void setExteriorRating(int exteriorRating) {
        this.exteriorRating = exteriorRating;
    }

    public int getInteriorRating() {
        return interiorRating;
    }

    public void setInteriorRating(int interiorRating) {
        this.interiorRating = interiorRating;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    public int getComfortRating() {
        return comfortRating;
    }

    public void setComfortRating(int comfortRating) {
        this.comfortRating = comfortRating;
    }
}

// Define a class to manage the car survey
class CarSurvey {
    private static final int MAX_CARS = 10;
    private Car[] cars;
    private int count;

    // Constructor
    public CarSurvey(int maxCars) {
        cars = new Car[maxCars];
        count = 0;
    }

    // Add a car to the survey
    public void addCar(Car car) {
        if (count < cars.length) {
            cars[count++] = car;
        } else {
            System.out.println("Survey is full. Cannot add more cars.");
        }
    }

    // Rate different aspects of a car
    public void rateCar(int index, int exteriorRating, int interiorRating, int performanceRating, int comfortRating) {
        if (index >= 0 && index < count) {
            cars[index].setExteriorRating(exteriorRating);
            cars[index].setInteriorRating(interiorRating);
            cars[index].setPerformanceRating(performanceRating);
            cars[index].setComfortRating(comfortRating);
        } else {
            System.out.println("Invalid car index.");
        }
    }

    // Display survey results
    public void displayResults() {
        System.out.println("Survey Results:");
        for (int i = 0; i < count; i++) {
            Car car = cars[i];
            System.out.println("Car #" + (i + 1) + ": " + car.getMake() + " " + car.getModel() + " (" + car.getYear() + ")");
            System.out.println("Exterior Rating: " + car.getExteriorRating());
            System.out.println("Interior Rating: " + car.getInteriorRating());
            System.out.println("Performance Rating: " + car.getPerformanceRating());
            System.out.println("Comfort Rating: " + car.getComfortRating());
            System.out.println();
        }
    }
}

// Main class to run the program
public class CarDetailingSurvey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of cars for the survey
        System.out.print("Enter the number of cars for the survey: ");
        int numCars = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        CarSurvey survey = new CarSurvey(numCars);

        // Prompt the user to enter car details and perform survey
        for (int i = 0; i < numCars; i++) {
            System.out.println("Enter details for Car #" + (i + 1));
            System.out.print("Make: ");
            String make = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            // Create a car object with the entered details
            Car car = new Car(make, model, year);
            survey.addCar(car);
            
            System.out.println("Enter ratings for Car #" + (i + 1) + " (1 to 5 stars for each category)");
            System.out.print("Exterior Rating: ");
            int exteriorRating = scanner.nextInt();
            System.out.print("Interior Rating: ");
            int interiorRating = scanner.nextInt();
            System.out.print("Performance Rating: ");
            int performanceRating = scanner.nextInt();
            System.out.print("Comfort Rating: ");
            int comfortRating = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            survey.rateCar(i, exteriorRating, interiorRating, performanceRating, comfortRating);
        }

        // Display survey results
        survey.displayResults();

        scanner.close();
    }
}

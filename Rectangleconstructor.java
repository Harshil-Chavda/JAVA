public class Rectangleconstructor {
    private double h;
    private double w;

    // Constructor
    public Rectangleconstructor(double h, double w) {
        this.h = h;
        this.w = w;
    }

    // Getter methods
    public double geth() {
        return h;
    }

    public double getw() {
        return w;
    }

    public static void main(String[] args) {
        // Creating an instance of Rectangleconstructor
        Rectangleconstructor rectangleconstructor = new Rectangleconstructor(5.0, 10.0);

        // Printing h and w of the rectangleconstructor
        System.out.println("h: " + rectangleconstructor.geth());
        System.out.println("w: " + rectangleconstructor.getw());
    }
}

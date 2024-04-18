class Shape {
    public float area(float radius) {
        return (float) (Math.PI * radius * radius);
    }

    public float area(float length, float width) {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        
        System.out.println("Area of circle with radius 5: " + shape.area(5));
        System.out.println("Area of rectangle with length 4 and width 6: " + shape.area(4, 6));
    }
}

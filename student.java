public class student {
    private int eno;
    private String name;

    // Constructor
    public student(int eno, String name) {
        this.eno = eno;
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Creating three objects of student class
        student s1 = new student(1, "Alice");
        student s2 = new student(2, "Bob");
        student s3 = new student(3, "Charlie");

        // Displaying each student's name
        System.out.println("student 1's name: " + s1.getName());
        System.out.println("student 2's name: " + s2.getName());
        System.out.println("student 3's name: " + s3.getName());
    }
}

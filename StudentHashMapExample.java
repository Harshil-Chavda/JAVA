import java.util.HashMap;

class StudentHashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap to store students' data
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add students' data to the HashMap
        studentMap.put(101, "John Doe");
        studentMap.put(102, "Jane Smith");
        studentMap.put(103, "Alice Johnson");
        studentMap.put(104, "Bob Brown");
        studentMap.put(105, "Emily Wilson");

        // Retrieve and display a student's name using enrollment number
        int enrollmentNumberToFind = 103; // Change this to the enrollment number you want to find
        String studentName = studentMap.get(enrollmentNumberToFind);
        if (studentName != null) {
            System.out.println("Student with enrollment number " + enrollmentNumberToFind + " is " + studentName);
        } else {
            System.out.println("Student with enrollment number " + enrollmentNumberToFind + " not found.");
        }
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Final variable
        final int x = 10;
        // Attempting to reassign a final variable will result in a compilation error
        // x = 20; // Error: cannot assign a value to final variable 'x'

        // Final method
        Parent parent = new Parent();
        parent.display();

        // Final class
        FinalClass finalClassObj = new FinalClass();
    }
}

class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}

final class FinalClass {
    // A final class cannot be extended
}


// output
/* This program demonstrates the usage of the "final" keyword in Java.
   The "final" keyword can be used   with variables, methods and classes. */
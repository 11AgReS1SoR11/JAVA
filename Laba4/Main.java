public class Main {

    public static void main(String[] args) {
        // Create two objects
        SomeClass object_first = new SomeClass(5);
        SomeClass object_second = new SomeClass(10);

        // Display values before swapping
        System.out.println("Before swapping:");
        System.out.println("first: " + object_first.getValue());
        System.out.println("second: " + object_second.getValue());

        // Swap values
        swapValues(object_first, object_second);

        // Display values after swapping
        System.out.println("\nAfter swapping:");
        System.out.println("first: " + object_first.getValue());
        System.out.println("second: " + object_second.getValue());
    }

    // Method to swap values between two objects of SomeClass
    private static void swapValues(SomeClass a, SomeClass b) {
        int temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }
}

class SomeClass {
    private int value;

    // Constructor
    public SomeClass(int value) {
        this.value = value;
    }

    // Getter and setter methods
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
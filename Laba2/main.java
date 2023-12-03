import java.util.Scanner;

public class StringAndOperatorsDemo {
    public static void main(String[] args) {
        // Program demonstrating logical and bitwise operators
        operatorsDemo();

        // Program showing which types can participate in a switch
        switchDemo();

        // Program for working with String objects
        stringMethodsDemo();
    }

    private static void operatorsDemo() {
        // Logical operators
        boolean a = true;
        boolean b = false;
        System.out.println("Logical AND: true && false = " + (a && b));
        System.out.println("Logical OR: true || false = " + (a || b));
        System.out.println("Logical NOT: !true = " + (!a));

        // Ternary operator
        int x = 5;
        int y = 10;
        int result = (x < y) ? x : y;
        System.out.println("Ternary operator: (5 < 10) ? 5 : 10 = " + result);

        // Bitwise logical operators
        int num1 = 5; // 0101
        int num2 = 3; // 0011
        System.out.println("Bitwise AND: 0101 & 0011 = " + (num1 & num2)); // 0001
        System.out.println("Bitwise OR: 0101 | 0011 = " + (num1 | num2)); // 0111
        System.out.println("Bitwise XOR: 0101 ^ 0011 = " + (num1 ^ num2)); // 0110
        System.out.println("Bitwise NOT: 0101 ~ 0011 = " + (~num1)); // 11111111111111111111111111111010

        // Shift operators
        int value = 8; // 1000
        System.out.println("Right shift by 1: 8 >> 1 = " + (value >> 1)); // 0100
        System.out.println("Left shift by 1: 8 << 1 = " + (value << 1)); // 10000
    }

    private static void switchDemo() {
        System.out.println("Example of using switch with different types:");

        String type = "Lalala";
        switch (type) {
            case "Lalala":
                System.out.println("This is 'Lalala'");
                break;
            case "lololo":
                System.out.println("This is 'lololo'");
                break;
            case "aaa":
                System.out.println("This is 'aaa'");
                break;
            default:
                System.out.println("some string");
        }

        int type2 = 0;
        switch (type2) {
            case 0:
                System.out.println("This is 0");
                break;
            case 1:
                System.out.println("This is 1");
                break;
            case 2:
                System.out.println("This is 2");
                break;
            default:
                System.out.println("This is > 2");
        }

        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("Letter A");
                break;
            case 'B':
                System.out.println("Letter B");
                break;
            case 'C':
                System.out.println("Letter C");
                break;
            default:
                System.out.println("Other letter");
        }

        byte b = 2;
        switch (b) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }

        short s = 500;
        switch (s) {
            case 100:
                System.out.println("One hundred");
                break;
            case 500:
                System.out.println("Five hundred");
                break;
            case 1000:
                System.out.println("One thousand");
                break;
            default:
                System.out.println("Other");
        }

        enum Color {
            RED, GREEN, BLUE
        }

        Color color = Color.RED;
        switch (color) {
            case RED:
                System.out.println("The color is red");
                break;
            case GREEN:
                System.out.println("The color is green");
                break;
            case BLUE:
                System.out.println("The color is blue");
                break;
            default:
                System.out.println("Other");
        }
    }

    private static void stringMethodsDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter several words separated by spaces:");

        while (scanner.hasNext()) 
        {
            String word = scanner.next();

            // Examples of methods for working with String objects
            System.out.println("Word length: " + word.length());
            System.out.println("Uppercase letters: " + word.toUpperCase());
            System.out.println("Lowercase letters: " + word.toLowerCase());
            System.out.println("Reversed string: " + new StringBuilder(word).reverse().toString());
            System.out.println("Substring from index 1 to 3: " + word.substring(1, 4));
            System.out.println("Concatenation with 'New': " + word.concat("New"));
            System.out.println("Replace 'e' with 'X': " + word.replace('e', 'X'));
            System.out.println("Contains 'abc': " + word.contains("abc"));
            System.out.println("Is empty: " + word.isEmpty());
            System.out.println("Trimmed string: " + word.trim());
            System.out.println("Character at index 2: " + word.charAt(2));

            System.out.println("Enter the next word or 'exit' to finish:");
            if (word.toLowerCase().equals("exit")) {
                break;
            }
        }
    }
}

public class CommandLineReader {
    public static void main(String[] args) {
        System.out.println("Command Line Arguments:");
        
        // Display each command line argument
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
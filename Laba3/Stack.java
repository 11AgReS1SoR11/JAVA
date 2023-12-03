public class StackArray {
    private int top;
    private int[] stackArray;

    public StackArray(int initialSize) {
        stackArray = new int[initialSize];
        top = -1;
    }

    public void push(int value) {
        if (top == stackArray.length - 1) {
            int[] newStackArray = new int[stackArray.length * 2];
            for (int i = 0; i < stackArray.length; i++) {
                newStackArray[i] = stackArray[i];
            }
            stackArray = newStackArray;
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }

    public void pop() {
        if (top >= 0) {
            System.out.println("Popped: " + stackArray[top--]);
        } else {
            System.out.println("Stack Underflow");
        }
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.display();

        stack.pop();
        stack.pop();
        stack.display();
    }
}

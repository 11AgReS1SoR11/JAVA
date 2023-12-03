import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInfo {

    public static void printClassInfo(Object obj) {
        Class<?> clazz = obj.getClass();

        // Print class name
        System.out.println("Class Name: " + clazz.getName());

        // Print fields
        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("  " + field.getType().getSimpleName() + " " + field.getName());
        }

        // Print methods
        System.out.println("Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("  " + method.getReturnType().getSimpleName() + " " + method.getName());
        }
    }

    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        printClassInfo(obj);

        AnotherClass anotherObj = new AnotherClass();
        printClassInfo(anotherObj);
    }
}

class SomeClass {
    private int number;
    private String text;

    public void execute() {
        System.out.println("number = " + number + "; text = " + text);
    }
}

class AnotherClass {
    private double value;
    private boolean flag;

    public void performAction() {
        System.out.println("value = " + value + "; flag = " + flag);
    }
}

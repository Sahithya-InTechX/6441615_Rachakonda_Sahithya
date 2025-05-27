public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 9.78;
        int intValue = (int) doubleValue; // Explicit casting

        int intNum = 10;
        double doubleNum = intNum; // Implicit casting

        System.out.println("Original double: " + doubleValue);
        System.out.println("Casted to int: " + intValue);
        System.out.println("Original int: " + intNum);
        System.out.println("Casted to double: " + doubleNum);
    }
}

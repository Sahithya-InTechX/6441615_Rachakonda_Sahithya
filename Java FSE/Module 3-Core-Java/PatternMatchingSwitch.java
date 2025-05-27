public class PatternMatchingSwitch {
    public static void checkType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer with value: " + i);
            case String s -> System.out.println("String with value: " + s);
            case Double d -> System.out.println("Double with value: " + d);
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        checkType(100);
        checkType("Hello");
        checkType(15.5);
        checkType(true);
    }
}

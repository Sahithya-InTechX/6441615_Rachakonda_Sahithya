import java.lang.reflect.Method;

public class ReflectionExample {
    public void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectionExample");
        Method[] methods = clazz.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }

        Object obj = clazz.getDeclaredConstructor().newInstance();
        Method helloMethod = clazz.getMethod("hello", String.class);
        helloMethod.invoke(obj, "Sahithya");
    }
}

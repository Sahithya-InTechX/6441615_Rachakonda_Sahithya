public class HelloWorld38 {
    public static void main(String[] args) {
        greet("Sahithya");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}


to compile:
javac HelloWorld.java

to run decompiled code:
java -jar cfr.jar HelloWorld.class

expected Decompiled output:
public class HelloWorld38 {
    public static void main(String[] args) {
        greet("Sahithya");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}


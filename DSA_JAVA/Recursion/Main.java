package Recursion;

public class Main {

    public static void methodThree() {
        System.out.println("Method Three");
    }

    public static void methodTwo() {
        methodThree();
        System.out.println("Method Two");

    }

    public static void methodOne() {
        methodTwo();
        System.out.println("Method One");
    }

    public static void main(String[] args) {
        Main.methodOne();
    }
}

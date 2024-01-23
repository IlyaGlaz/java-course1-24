package lesson4;

public class StackRunner {
    public static void main(String[] args) {
        func1();
    }

    static void func1() {
        func2();
    }

    static void func2() {
        func3();
    }

    static void func3() {
        func4();
    }

    static void func4() {
        func5();
    }

    static void func5() {
        System.out.println("At the and");
    }
}

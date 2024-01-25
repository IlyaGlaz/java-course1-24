package lesson4;

public class StackRunner {
    public static void main(String[] args) {
        System.out.println("Start");
        func1();

        System.out.println("Program finish");
    }

    static void func1() {
        int num = 10;
        System.out.println("In func1");
        func2(num);
    }

    static void func2(int number) {
        if (number > 5) {
            func3(number);
        } else {
            func5();
        }
    }

    static void func3(int number) {
        System.out.println("In func3");
        func4(number);
    }

    static void func4(int number) {
        System.out.println("In func4");
        func5();
    }

    static void func5() {
        System.out.println("In func5");
    }
}

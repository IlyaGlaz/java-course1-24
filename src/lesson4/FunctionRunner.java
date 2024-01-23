package lesson4;

public class FunctionRunner {

    public static void main(String[] args) {
        System.out.println();
        int number = 22;

        var result = sumOfTwoNumbers(2, 2);

        System.out.println(result);
    }

    static int sumOfTwoNumbers(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println(sum);
        return sum;
    }
}

package lesson4;

public class FunctionRunner {
    public static void main(String[] args) {
//        System.out.println();
//        int number = 22;
//
//        var result = sumOfTwoNumbers(2, 2);

        int[] array = {1, 2, 3, 4};
        int[] array2 = new int[10];

        //
        int sum = sumOfArray(new int[] {22, 44, 22, 44});

        System.out.println(sum);

        System.out.println(sumOfArray(array));

//        System.out.println(result);
    }

    static int sumOfTwoNumbers(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println(sum);
        return sum;
    }

    static int sumOfArray(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    static int maxValue(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    static int minValue(int number1, int number2) {
        return number1 < number2
                ? number1
                : number2;
    }
}

package lesson3;

public class ArraysRunner {
    public static void main(String[] args) {
//        int[] numbers = {22, 44, 266, 44, 0, 1};
//        System.out.println(numbers.length);
//
//        System.out.println(numbers[0]);
//        numbers[0] = 111;
//        System.out.println(numbers[0]);
//
//        System.out.println(numbers[numbers.length - 1]);

        int[] numbers2 = new int[10];

        for(int i = 0; i < numbers2.length; i++ ) {

            numbers2[i] = i;

        }

        for (int value : numbers2) {
            System.out.println(value);
        }
    }
}

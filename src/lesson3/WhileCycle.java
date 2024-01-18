package lesson3;

public class WhileCycle {
    public static void main(String[] args) {
        int number = 0;

        while (number <= 1000) {
            System.out.println(number);
             // number = number -1; number -= 1
        }

//        int result;
//        while (number <= 100) {
//            result = number * number;
//            System.out.println(result);
//            number++; // number = number -1; number -= 1
//        }

        while(number <= 50_000) {

            System.out.println(number);
            number++;

        }

//        do {
//            System.out.println(number);
//            number--; // number = number -1; number -= 1
//        } while (number > 0);
    }
}

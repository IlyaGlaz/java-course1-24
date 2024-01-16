package lesson2;

public class Logic {
    public static void main(String[] args) {
        // < > >= <= == !=
//        boolean someBoolean = false;
//        boolean result = 10 > 0;
//        System.out.println(result);

        // && || !
//        0 < result <= 100;
        int number = 50;     // true                        // false
        boolean result2 = (0 < number || number <= 100) && !(number != 50);
        System.out.println(result2);

//        boolean result3 = true;
//        System.out.println(!result3);
    }
}

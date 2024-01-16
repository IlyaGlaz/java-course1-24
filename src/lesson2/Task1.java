package lesson2;

/**
 * Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
 */
public class Task1 {
    public static void main(String[] args) {
       // byte, short, int, char, String
        int number = 6;

//        switch (number) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//            case 6:
//                System.out.println("Summer");
//                break;
//            default:
//                System.out.println("Not a month");
//        }

        int number2 = 2 + 1;

        String month = switch (number) {
            case 12, 1, 2 -> "Winter";
            case 6, 7, 8 -> "Summer";
            default -> "Other month";
        };

        System.out.println(month + month + month);
    }
}

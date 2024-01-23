package lesson4;

public class ArraysShow {
    public static void main(String[] args) {
//        int[][] numbers = {
//                {22, 22, 44},
//                {44, 22, 44},
//                {22, 22, 44},
//                {22, 22, 44},
//                {22, 22, 44},
//        };
//
//        int[][] numbers2 = new int[5][3];

//        int[] numbers = {22, 44, 125, 0, 70};
//
//        for (int v : numbers) {
//            System.out.println(v);
//        }

//        int[] numbers2 = new int[100_000];
//
//        for (int i = 0; i < numbers2.length; i++) {
//            numbers2[i] = i;
//        }

        //

        int[] numbers3 = {22, 44, 10, 0, 70};

        boolean isUnique = true;
        for (int i = 0; i < numbers3.length; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                System.out.println(numbers3[i] + " равно ли " + numbers3[j]);
                if (numbers3[i] == numbers3[j]) {
                    System.out.println("Да равно");
                    isUnique = false;
                    break;
                }
                System.out.println("Нет");
            }
        }
        System.out.println("Коллекция уникальна " + isUnique);
    }
}

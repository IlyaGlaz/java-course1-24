package lesson10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishRunner {
    public static void main(String[] args) {
        List<Dish> dishes = Arrays.asList(
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 400, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

        dishes.stream()
                .filter(dish -> dish.getCalories() > 100)
                .map(Dish::getCalories)
                .collect(Collectors.toSet());
//                          Dish::getName

//        String collect = Stream.of(203, 400, 40, 22, 225, 24, 23, 23424, 233)
//                .map(num -> num.toString())
//                .collect(Collectors.joining("hello"));
//
//        System.out.println(collect);

        long count = Stream.of(234, 24, 24, 234, 234, 324)
                .count();

        System.out.println(count);
    }

    static boolean someMothod(Dish dish) {
        return dish.getCalories() > 100;
    }
}

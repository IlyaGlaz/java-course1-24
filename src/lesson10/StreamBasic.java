package lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamBasic {

    public static void main(String... args) {
     /*   // Java 7
        getLowCaloricDishesNamesInJava7(Dish.menu).forEach(System.out::println);

        System.out.println("---");*/

        // Java 8
//        getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);

        getLowCaloricDishesNamesInJava8(Dish.menu);
    }

    public static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes) {
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish d : dishes) {
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }

        List<String> lowCaloricDishesName = new ArrayList<>();
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish d1, Dish d2) {
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });

        for (Dish d : lowCaloricDishes) {
            lowCaloricDishesName.add(d.getName());
        }
        return lowCaloricDishesName;
    }

    public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
        List<String> collect = dishes.stream()
                .filter((Dish dish) -> {
                    return dish.getCalories() < 400;
                })
                .sorted()
                .map((Dish dish) -> {
                    return dish.getName();
                })
                .collect(toList());

        return collect;
    }
}

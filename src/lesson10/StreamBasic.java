package lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

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
        Function<Dish, String> func = (Dish dish) -> dish.getName();

        dishes.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted()
                .map(func)
                .forEach(str -> System.out.println(str));

        return Collections.emptyList();
    }
}

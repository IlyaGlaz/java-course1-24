package lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToStream {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Moscow");
        cities.add("oooooooooooo");
        cities.add("Tokyo");
        cities.add("Peris");
        cities.add("Rekyavik");

        String str1 = "Hello";

        List<String> collect = cities.stream()
                .filter(str -> str.length() > 5)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}

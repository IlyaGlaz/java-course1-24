package lesson7;

import java.util.ArrayList;
import java.util.List;

public class AnimalListRunner {
    public static void main(String[] args) {
        Animal dog = new Dog(10, 40);
        Animal dog1 = new Dog(22, 77);
        Animal dog2= new Dog(100, 40);

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(dog1);
        animals.add(dog2);

        Animal dog4 = new Dog(102, 40);
        animals.set(0, dog4);
        System.out.println();

        List<Animal> resultAnimals = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.getHeight() > 50) {
                animals.remove(animal);
            }
        }

    }
}

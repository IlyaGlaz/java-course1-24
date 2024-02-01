package lesson6;

import java.util.Objects;

public class AnimalFirst {
    private String name;
    private int height;
    private int weight;
    int count2;
    static int count;

    public AnimalFirst() {
        count++;
        count2++;
    }

    AnimalFirst(int height) {
        this.height = height;
    }

    AnimalFirst(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public static void goWalk() {
        System.out.println(count);
        System.out.println("i go");
    }

    void makeSound() {
        System.out.println(count);
        System.out.println("Gav - Gav");
        weight = 100;
    }

    void makeSound(boolean i) {
        System.out.println();
    }

    void makeSound(boolean i, boolean j) {
        System.out.println("Gav - Gav");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 30) {
            this.height = height;
        } else {
            System.out.println("Ошибка");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalFirst animal = (AnimalFirst) o;
        return height == animal.height
                && weight == animal.weight
                && count2 == animal.count2
                && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, count2);
    }
}
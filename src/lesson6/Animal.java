package lesson6;

import lesson5.Person;

public class Animal {
    private String name;
    private int height;
    private int weight;

    public Animal() {

    }

    Animal(int height) {
        this.height = height;
    }

    Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    void makeSound() {
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
}
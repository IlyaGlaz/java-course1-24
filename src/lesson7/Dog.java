package lesson7;

public class Dog extends Animal {

    public Dog(int height, int weight) {
        super(height, weight);
    }

    @Override
    void makeSound() {
        System.out.println("gav gav");
    }

    void playWithPakla() {
        System.out.println("I play");
    }
}

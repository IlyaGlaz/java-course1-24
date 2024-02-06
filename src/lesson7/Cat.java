package lesson7;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int height, int weight) {
        super(height, weight);
        System.out.println("Cat contr");
    }

    @Override
    void makeSound() {
        System.out.println("Maw-maw-maw");
    }

    void playWithMe() {
        System.out.println("Go play");
    }

    @Override
    public String toString() {
        return "Cat{" +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

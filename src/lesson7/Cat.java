package lesson7;

public class Cat extends AnimalSecond {
    String color;

    public Cat() {
    }

    public Cat(int height, int weight, String color) {
        super(height, weight);
        this.color = color;
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
                "color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

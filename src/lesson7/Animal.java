package lesson7;

public abstract class Animal {
    int height;
    int weight;

    Animal() {

    }

    public Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
        System.out.println("Animal constr");
    }

    abstract void makeSound();

    void goHunt() {
        System.out.printf("Hunt");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal that = (Animal) o;
        return height == that.height
                && weight == that.weight;
    }

    @Override
    public String toString() {
        return "AnimalSecond{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

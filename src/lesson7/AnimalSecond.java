package lesson7;

public class AnimalSecond {
    int height;
    int weight;

    AnimalSecond() {

    }

    public AnimalSecond(int height, int weight) {
        this.height = height;
        this.weight = weight;
        System.out.println("Animal constr");
    }

    void makeSound() {
        System.out.println("Some noize");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalSecond that = (AnimalSecond) o;
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
}

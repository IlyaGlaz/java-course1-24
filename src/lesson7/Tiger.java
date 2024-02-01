package lesson7;

public class Tiger extends Cat {

    public Tiger() {
    }

    public Tiger(int height, int weight, String color) {
        super(height, weight, color);
        System.out.println("Tiger constr");
    }

    @Override
    void makeSound() {
        System.out.println("Rrrrrr");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

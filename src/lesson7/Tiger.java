package lesson7;

public class Tiger extends Cat implements Preditator, Flyable {
    Color color;

    public Tiger() {
    }

    public Tiger(int height, int weight) {
        super(height, weight);
        System.out.println("Tiger constr");
    }

    public Tiger(Color color) {
        this.color = color;
    }

    @Override
    void makeSound() {
        System.out.println("Rrrrrr");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "color=" + color +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void hunt() {
        System.out.println("go for Hunt");
    }

    @Override
    public void runFast() {
        System.out.println("Run fast");
    }

    @Override
    public void fly() {

    }
}

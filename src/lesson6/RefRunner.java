package lesson6;

public class RefRunner {
    public static void main(String[] args) {
        AnimalFirst animal = new AnimalFirst(22, 22);
        AnimalFirst animal2 = animal;
        animal = null;

        System.out.println(animal2);

        int number = 44;
        int number2 = number;

        number = 66;
        System.out.println(number2);

        AnimalFirst animal1 = null;
    }
}

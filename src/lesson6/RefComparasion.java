package lesson6;

public class RefComparasion {
    public static void main(String[] args) {
        int number = 4;
        int number2 = 4;

        System.out.println(number == number2);

        System.out.println("-----------");

        AnimalFirst animal = new AnimalFirst(15, 20);
        AnimalFirst anima2 = new AnimalFirst(15, 20);

        System.out.println(animal.equals(anima2));
    }
}

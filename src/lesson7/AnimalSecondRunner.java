package lesson7;

public class AnimalSecondRunner {
    public static void main(String[] args) {
//        AnimalSecond animal = new AnimalSecond(44, 22);
//        AnimalSecond animal1 = new AnimalSecond(20, 22);
//
//        System.out.println(compareWeight(animal, animal1));

//        System.out.println(animal);
//        System.out.println(animal.equals(animal1));
//
//        Cat cat = new Cat(33, 44, "Black");
//        Cat cat1 = new Cat(33, 44, "Black");
//        System.out.println(compareWeight(cat, cat1));
//        System.out.println(cat);
//
//        cat.makeSound();
//        cat.playWithMe();

//        Tiger tiger = new Tiger(44, 10, "Yellow");
//        Tiger tiger1 = new Tiger(44, 10, "Yellow");
//        System.out.println(compareWeight(tiger, tiger1));
//        tiger.playWithMe();
//        tiger.makeSound();

        AnimalSecond animalSecond1 = new AnimalSecond(120, 15);
        AnimalSecond animalSecond2 = new Cat(55, 20, "Yellow");
        AnimalSecond animalSecond3 = new Tiger(22, 44, "Black");

        animalSecond1.makeSound();
        animalSecond2.makeSound();
        animalSecond3.makeSound();
    }

    public static boolean compareWeight(Cat animal, Cat animal1) {
        return animal.weight == animal1.weight;
    }
}

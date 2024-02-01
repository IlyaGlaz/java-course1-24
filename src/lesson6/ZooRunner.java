package lesson6;

public class ZooRunner {
    public static void main(String[] args) {
//        Animal[] animals = {new Animal(22, 22), new Animal(44, 22), new Animal(23, 23)};
//
//        Zoo zoo = new Zoo(animals);
//        zoo.calculateFood();
//        zoo.inviteAnimal(new Animal(22, 44));

        AnimalFirst animal = new AnimalFirst(15, 40);
        AnimalFirst animal6 = new AnimalFirst(24, 40);
        AnimalFirst animal1 = animal;
        animal1 = new AnimalFirst(23, 55);

        animal.setHeight(25);

        System.out.println(animal1.getHeight());

        AnimalFirst.goWalk();

        AnimalFirst animal2 = new AnimalFirst();
        AnimalFirst animal3 = new AnimalFirst();
        AnimalFirst animal4 = new AnimalFirst();
        AnimalFirst animal5 = new AnimalFirst();

//        AnimalUtils.compareWeight(animal3, animal4);

        System.out.println(AnimalFirst.count);
        System.out.println(animal2.count2);

        Math.pow(22, 2.2);

//        System.out.println(animal.getName());
//
//        animal.setName("Sharik");
//
//        System.out.println(animal.getName());
    }
}

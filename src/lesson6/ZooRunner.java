package lesson6;

public class ZooRunner {
    public static void main(String[] args) {
//        Animal[] animals = {new Animal(22, 22), new Animal(44, 22), new Animal(23, 23)};
//
//        Zoo zoo = new Zoo(animals);
//        zoo.calculateFood();
//        zoo.inviteAnimal(new Animal(22, 44));

        Animal animal = new Animal(15, 40);
        Animal animal1 = animal;
        animal1 = new Animal(23, 55);

        animal.setHeight(25);

        System.out.println(animal1.getHeight());

//        System.out.println(animal.getName());
//
//        animal.setName("Sharik");
//
//        System.out.println(animal.getName());
    }
}

package lesson7;

public class Animal2Runner {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Tiger(), new Cat(), new Dog()};

        for(Animal oneAnimal : animals) {
            oneAnimal.makeSound();
        }

        Person person = new Person();
        Cat cat = new Cat();
        person.setPet(cat);

        Preditator[] preZoo = {new Tiger(), new Tiger(), new Tiger()};

        for(Preditator pred : preZoo) {
            pred.hunt();
        }

        System.out.println(person);
    }

    public static Animal getAnimal(Animal animal) {
        return new Cat();
    }
}

package lesson6;

public class Zoo {
    Animal[] animals;

    Zoo(Animal[] animals) {
        this.animals = animals;
    }

    void inviteAnimal(Animal animal) {
        System.out.println(animals.length);
    }

    void calculateFood() {
        int totalFoodWeight = 0;

        for (Animal animal : animals) {
            totalFoodWeight = totalFoodWeight + animal.getWeight();
        }

        System.out.println(totalFoodWeight);
    }
}

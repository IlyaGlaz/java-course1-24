package lesson6;

public class Zoo {
    AnimalFirst[] animals;

    Zoo(AnimalFirst[] animals) {
        this.animals = animals;
    }

    void inviteAnimal(AnimalFirst animal) {
        System.out.println(animals.length);
    }

    void calculateFood() {
        int totalFoodWeight = 0;

        for (AnimalFirst animal : animals) {
            totalFoodWeight = totalFoodWeight + animal.getWeight();
        }

        System.out.println(totalFoodWeight);
    }
}

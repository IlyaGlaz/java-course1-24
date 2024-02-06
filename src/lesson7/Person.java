package lesson7;

public class Person {
    Animal pet = null;

    public void setPet(Animal pet) {
        this.pet = pet;
    }



    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                '}';
    }
}

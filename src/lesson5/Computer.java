package lesson5;

public class Computer {

    int ssd = 0;
    int ram = 0;

    Computer() {

    }

    Computer(int newSsd, int newRam) {
       ssd = newSsd;
       ram = newRam;
    }

    void load() {
        System.out.println("Идет загрузка");
    }

    void printState() {
        System.out.println("Ssd " + ssd);
        System.out.println("Ram " + ram);
    }
}

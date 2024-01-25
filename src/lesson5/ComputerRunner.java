package lesson5;

import java.util.ConcurrentModificationException;

public class ComputerRunner {

    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person.age);
//        System.out.println(person.name);
//
//        int number = 22;

        Computer computer = new Computer(1500, 32);

        computer.load();
        computer.printState();

        Computer computer1 = new Computer(750, 16);

        computer1.printState();

    }
}

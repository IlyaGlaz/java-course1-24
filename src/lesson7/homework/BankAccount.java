package lesson7.homework;

public class BankAccount {
    double amount;

    public double getAmount() {
        //TODO: реализуйте метод и удалите todo
        // верните значение количества денег не счету
        return 0;
    }

    public void put(double amountToPut) {
        amount += amountToPut;
    }

    public void take(double amountToTake) {
        amount -= amountToTake;
    }
}

package lesson7.homework;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    LocalDate lastIncome;

    @Override
    public void take(double amountToTake) {
        // ваш код
    }
}

/**
 * LocalDate.now() - получить дату в данный момент времени
 *
 * Чтобы получить количество месяцев(которое может быть негативным, если в этом промежутке нет полного месяца)
 * между датой последнего пополнения и датой когда клиент хочет снять деньги
 * можно воспользоваться такой конструкцией:
 *
 * Period between = Period.between(lastIncome, LocalDate.now());
 * between.getMonths()); - получить количество месяцев в этом промежутке
 *
 */

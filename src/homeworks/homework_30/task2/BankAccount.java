package homeworks.homework_30.task2;

public abstract class BankAccount implements PaymentSystem {

    protected double eur;
    protected String typeMoney = "€";
    protected String accountNumber;


    @Override
    public void withdrawMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Некорректная операция!");
            return;
        }
        if (amount > eur) {
            System.out.println("Недостаточно средств! Пополните баланс.");
            return;
        }
        eur -= amount;
        System.out.printf("Счёт: %s.\nСнято: %.2f%s. Остаток: %.2f%s\n", accountNumber, amount, typeMoney, eur, typeMoney);
        System.out.println("=============================");
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount <= 0) {
            System.out.println("Некорректная операция");
            return;
        }
        eur += amount;
        System.out.printf("Счёт %s пополнен: +%.2f%s. Баланс: %.2f%s\n", accountNumber, amount, typeMoney, eur, typeMoney);
        System.out.println("=============================");
    }

    @Override
    public void checkBalance() {
        System.out.printf("Счёт: %s. Баланс: %.2f%s\n", accountNumber, eur, typeMoney);
    }

    @Override
    public void transferMoney(PaymentSystem account, double sum) {
        if (eur < sum) {
            System.out.println("Недостаточно средств!");
            return;
        }
        if (sum <= 0) {
            System.out.println("Некорректный ввод!");
            return;
        }

        withdrawMoney(sum);
        double curse = 1;

        if (account.getTypeMoney().equals("$")) {
            curse = 1.08;
        }
        account.depositTransfer(sum * curse);
        System.out.printf("Перевод со счёта %s на Счёт %s. Сумма: %.2f. Курс: 1 : %.2f\n", accountNumber, account.getAccountNumber(), sum, curse);
        System.out.println("===========================");

    }

    @Override
    public String getTypeMoney() {
        return typeMoney;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
}

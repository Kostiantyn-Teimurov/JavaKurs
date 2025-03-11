package homeworks.homework_30.task2;

public abstract class Accounts implements PaymentSystem {

    private double balance;
    protected String currency;
    protected String accountNumber;


    public Accounts(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Некорректная операция!");
            return;
        }
        if (amount > balance) {
            System.out.println("Недостаточно средств! Пополните баланс.");
            return;
        }
        balance -= amount;
        System.out.printf("Счёт: %s.\nСнято: %.2f%s. Остаток: %.2f%s\n", accountNumber, amount, currency, balance, currency);
        System.out.println("=============================");
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount <= 0) {
            System.out.println("Некорректная операция");
            return;
        }
        balance += amount;
        System.out.printf("Счёт %s пополнен: +%.2f%s. Баланс: %.2f%s\n", accountNumber, amount, currency, balance, currency);
        System.out.println("=============================");
    }

    @Override
    public void checkBalance() {
        System.out.printf("Счёт: %s. Баланс: %.2f%s\n", accountNumber, balance, currency);
    }


//    @Override
//    public void transferMoney(PaymentSystem account, double sum) {
//        if (balance < sum) {
//            System.out.println("Недостаточно средств!");
//            return;
//        }
//        if (sum <= 0) {
//            System.out.println("Некорректный ввод!");
//            return;
//        }
//
//        withdrawMoney(sum);
//        double curse = 1;
//
//        if (account.getCurrency().equals("$")) {
//            curse = 1.08;
//        }
//        account.depositTransfer(sum * curse);
//        System.out.printf("Перевод со счёта %s на Счёт %s. Сумма: %.2f. Курс: 1 : %.2f\n", accountNumber, account.getAccountNumber(), sum, curse);
//        System.out.println("===========================");
//
//    }


//    abstract public double getCourseToEuro();

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

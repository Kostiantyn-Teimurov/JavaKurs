package homeworks.homework_30.task2;

public class ElectronicWallet extends Accounts {

    public ElectronicWallet(String accountNumber) {
        super(accountNumber);
        currency = "$";
        this.accountNumber = accountNumber;
    }

    @Override
    public void transferMoney(PaymentSystem account, double sum) {

    }

    @Override
    public double getCourseToEuro() {
        return 0.92;
    }
}
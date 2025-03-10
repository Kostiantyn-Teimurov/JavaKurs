package homeworks.homework_30.task2;

public interface PaymentSystem {

    void withdrawMoney(double amount);

    void depositTransfer(double amount);

    void checkBalance();

    void transferMoney(PaymentSystem account, double sum);

    String getTypeMoney();

    String getAccountNumber();
}

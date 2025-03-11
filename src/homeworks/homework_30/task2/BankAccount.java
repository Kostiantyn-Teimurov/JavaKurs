package homeworks.homework_30.task2;

public class BankAccount extends Accounts {

    public BankAccount(String accountNumber) {
        super(accountNumber);
        currency = "€";
        this.accountNumber = accountNumber;
    }

    // Вывод денег - сумма которую переводим - всегда в валюте нашего счета.
    // Проверяем валюту счета получателя. Высчитываем курс пересчета
    // отправляем получателю сумму к валюте счета получателя.

    @Override
    public void transferMoney(PaymentSystem account, double amountEur) {
        if (amountEur > getBalance()) {
            System.out.printf("Недостаточно средств! Transfer %.2f | balance: %.2f\n", amountEur, getBalance());
            return;
        }

        if (account.getCurrency().equals("€")) {
            // Перевод на евровый счет (конвертация не нужна)
            withdrawMoney(amountEur);
            account.depositTransfer(amountEur);
            System.out.printf("Успех! Перевод (%s -> %s) %.2f EUR завершен\n", accountNumber, account.getAccountNumber(), amountEur);
            return;
        }

        if (account.getCurrency().equals("$")) {
            // Конвертировать евро в доллары

            double amountDollars = amountEur / account.getCourseToEuro();

            withdrawMoney(amountEur);
            account.depositTransfer(amountDollars);

            System.out.printf("Успех! Перевод (%s -> %s) %.2f EUR -> %.2f завершен\n",
                    accountNumber, account.getAccountNumber(), amountEur, amountDollars);
        }
    }

    @Override
    public double getCourseToEuro() {
        return 1;
    }

}
package homeworks.homework_30.task2;

public class App {
    public static void main(String[] args) {

        PaymentSystem account001 = new AccountEuro1();
        PaymentSystem account002 = new AccountEuro2();
        PaymentSystem account003 = new AccountDollars1();
        PaymentSystem account004 = new AccountDollars2();

        account001.checkBalance();
        account003.checkBalance();

        account001.withdrawMoney(100);
        account003.withdrawMoney(0);

        account001.depositTransfer(100);
        account003.depositTransfer(-32);

        account001.withdrawMoney(40);
        account003.withdrawMoney(24);

        account003.depositTransfer(246357);

        account001.checkBalance();
        account003.checkBalance();


        System.out.println("\n\n!!!!!!!!!!!!!            ПЕРЕВОДЫ      !!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n");

        account003.transferMoney(account001, 100);
        account003.transferMoney(account004, 0);
        account003.transferMoney(account004, -3);
        account003.transferMoney(account004, 10000000);
        account003.transferMoney(account004, 10);

        account002.transferMoney(account003, 45);
        account002.depositTransfer(50235);
        account002.transferMoney(account003, 346);

    }
}

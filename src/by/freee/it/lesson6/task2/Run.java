package by.freee.it.lesson6.task2;

public class Run {
    public static void main(String[] args) {
        Account account = new Account(1,"John Johnson");
        account.topUpAccount(340.50);
        account.withdrawMoneyFromAccount(122);
        account.payForPurchase(17);
        account.payForPurchase(12);
        System.out.println();
        System.out.println(account.toString());

    }
}

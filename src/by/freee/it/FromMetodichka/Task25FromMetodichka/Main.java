package by.freee.it.FromMetodichka.Task25FromMetodichka;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(50,10,15);
        atm.addMoney(50,300);
        System.out.println(atm.withdrawMoney(3220));
    }
}

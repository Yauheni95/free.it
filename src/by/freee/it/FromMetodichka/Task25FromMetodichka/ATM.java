package by.freee.it.FromMetodichka.Task25FromMetodichka;

public class ATM {
    private int bill20;
    private int bill50;
    private int bill100;
    static int sum;

    public ATM(int bill20, int bill50, int bill100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
        sum = this.bill20 * 20 + this.bill50 * 50 + this.bill100 * 100;
    }


    public void addMoney(int billsValue, int money) {
        if (billsValue == 20)
            this.bill20 += money / billsValue;
        if (billsValue == 50)
            this.bill50 += money / billsValue;
        if (billsValue == 100)
            this.bill100 += money / billsValue;
        sum += money;
    }

    public boolean withdrawMoney(int money) {
        boolean flag = true;
        if (money > sum)
            flag = false;
        else {
            sum -= money;
            int bill100number = 0;
            int bill50number = 0;
            int bill20number;
            if (money / 100 > 0 && bill100 > 0) {
                if (money / 100 > bill100) {
                    bill100number = bill100;
                    bill100 = 0;
                } else {
                    bill100number = money / 100;
                    bill100 -= bill100number;
                }
                money -= bill100number * 100;
            }
            if (money / 50 > 0 && bill50 > 0 && money % 50 % 20 == 0) {
                if (money / 50 > bill50) {
                    bill50number = bill50;
                    bill50 = 0;
                } else {
                    bill50number = money / 50;
                    bill50 -= bill50number;
                }
                money -= bill50number * 50;
            }
            if (money / 20 <= bill20 && money % 20 == 0) {
                bill20number = money / 20;
                bill20 -= bill20number;
                System.out.println("Issued " + bill100number + " bills of $ 100");
                System.out.println("Issued " + bill50number + " bills of $ 50");
                System.out.println("Issued " + bill20number + " bills of $ 20");
                System.out.println("Remaining cash at ATM is " + sum + " $");
            } else
                flag = false;
        }
        return flag;
    }

}

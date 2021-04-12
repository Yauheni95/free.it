package by.freee.it.lesson6.task2;

public class Account {
    /*
    Создать класс Account с внутренним классом, с помощью объектов которого можно хранить информацию
    обо всех операциях со счетом (снятие, платежи, поступления).
    */
    private final int id;
    private final String login;
    private Information information;
    private double sumMoney;


    public Account(int id, String login) {
        this.id = id;
        this.login = login;
        this.information = new Information();
    }

    public boolean topUpAccount(double sum) {
        this.sumMoney += sum;
        this.information.setReceiptsNumber(this.information.getReceiptsNumber() + 1);
        this.information.setReceiptsSum(this.information.getReceiptsSum() + sum);
        return true;
    }

    public boolean withdrawMoneyFromAccount(double sum) {
        if (this.sumMoney < sum)
            return false;
        else {
            this.sumMoney -= sum;
            this.information.setWithdrawNumber(this.information.getWithdrawNumber() + 1);
            this.information.setWithdrawSum(this.information.getWithdrawSum() + sum);
            return true;
        }
    }

    public boolean payForPurchase(double sum) {
        if (this.sumMoney < sum)
            return false;
        else {
            this.sumMoney -= sum;
            this.information.setPaysNumber(this.information.getPaysNumber() + 1);
            this.information.setPaysSum(this.information.getPaysSum() + sum);
            return true;
        }
    }

    public class Information {
        private double paysSum;
        private int paysNumber;
        private double receiptsSum;
        private int receiptsNumber;
        private double withdrawSum;
        private int withdrawNumber;

        public double getPaysSum() {
            return paysSum;
        }

        public void setPaysSum(double paysSum) {
            this.paysSum = paysSum;
        }

        public int getPaysNumber() {
            return paysNumber;
        }

        public void setPaysNumber(int paysNumber) {
            this.paysNumber = paysNumber;
        }

        public double getReceiptsSum() {
            return receiptsSum;
        }

        public void setReceiptsSum(double receiptsSum) {
            this.receiptsSum = receiptsSum;
        }

        public int getReceiptsNumber() {
            return receiptsNumber;
        }

        public void setReceiptsNumber(int receiptsNumber) {
            this.receiptsNumber = receiptsNumber;
        }

        public double getWithdrawSum() {
            return withdrawSum;
        }

        public void setWithdrawSum(double withdrawSum) {
            this.withdrawSum = withdrawSum;
        }

        public int getWithdrawNumber() {
            return withdrawNumber;
        }

        public void setWithdrawNumber(int withdrawNumber) {
            this.withdrawNumber = withdrawNumber;
        }

        public String MonetaryTransactionsInfo() {
            return "Всего потрачено средств: " + (this.paysSum + this.withdrawSum) + "\nПоступило на счет: " + this.receiptsSum +
                    "\nПроизведено операций по полнению счета: " + this.receiptsNumber + "\nПроизведено операций по снятию средств со счета: " + this.withdrawNumber +
                    "\nПроизведено платежных операций: " + this.paysNumber;
        }
    }

    @Override
    public String toString() {
        return "Account info:\n" +
                "id: " + id +
                ", логин: " + login +
                ", остаток на счете: " + sumMoney +
                "\n" + this.information.MonetaryTransactionsInfo();
    }
}

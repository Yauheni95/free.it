package by.freee.it.lesson6.robot.hands;

public class ToshibaHand implements  IHand{
    int price;

    public ToshibaHand() {
    }
    public ToshibaHand(int price) {
        this.price=price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

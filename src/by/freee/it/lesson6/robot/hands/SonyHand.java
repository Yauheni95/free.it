package by.freee.it.lesson6.robot.hands;

public class SonyHand implements IHand {
    int price;

    public SonyHand() {
    }
    public SonyHand(int price) {
        this.price=price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

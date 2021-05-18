package by.freee.it.lesson7.robot.hands;

public class SamsungHand implements IHand{
    int price;

    public SamsungHand() {
    }
    public SamsungHand(int price) {
        this.price=price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

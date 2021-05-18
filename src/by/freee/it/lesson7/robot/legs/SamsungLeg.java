package by.freee.it.lesson7.robot.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Ноги Toshiba делают шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

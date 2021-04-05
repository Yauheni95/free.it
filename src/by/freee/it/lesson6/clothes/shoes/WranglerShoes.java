package by.freee.it.lesson6.clothes.shoes;

public class WranglerShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надевает обвувь Wrangler");

    }

    @Override
    public void putOff() {
        System.out.println("Снимает обувь Wrangler");

    }
}

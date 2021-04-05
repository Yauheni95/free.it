package by.freee.it.lesson6.clothes.jacket;

public class WranglerJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надевает шляпу Wrangler");

    }

    @Override
    public void putOff() {
        System.out.println("Снимает шляпу Wrangler");

    }
}

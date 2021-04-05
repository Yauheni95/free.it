package by.freee.it.lesson6.clothes.shoes;

public class BershkaShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надевает обувь Wrangler");

    }

    @Override
    public void putOff() {
        System.out.println("Снимает обувь Wrangler");

    }
}

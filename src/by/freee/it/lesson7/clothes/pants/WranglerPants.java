package by.freee.it.lesson7.clothes.pants;

public class WranglerPants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Надевает штаны Wrangler");

    }

    @Override
    public void putOff() {
        System.out.println("Снимает штаны Wrangler");

    }
}

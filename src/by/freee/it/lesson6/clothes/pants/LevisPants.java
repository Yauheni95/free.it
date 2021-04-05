package by.freee.it.lesson6.clothes.pants;

public class LevisPants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Надевает штаны Levis");

    }

    @Override
    public void putOff() {
        System.out.println("Снимает штаны Levis");

    }
}

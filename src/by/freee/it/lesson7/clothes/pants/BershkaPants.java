package by.freee.it.lesson7.clothes.pants;

public class BershkaPants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Надевает штаны Bershka");
    }

    @Override
    public void putOff() {
        System.out.println("Снимает штаны Bershka");
    }
}

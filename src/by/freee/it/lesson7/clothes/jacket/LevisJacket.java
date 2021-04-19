package by.freee.it.lesson7.clothes.jacket;



public class LevisJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надевает шляпу Levis");
    }

    @Override
    public void putOff() {
        System.out.println("Снимает шляпу Levis");
    }
}

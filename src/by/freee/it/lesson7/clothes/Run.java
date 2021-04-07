package by.freee.it.lesson7.clothes;

import by.freee.it.lesson7.clothes.jacket.*;
import by.freee.it.lesson7.clothes.pants.*;
import by.freee.it.lesson7.clothes.shoes.*;


public class Run {
    public static void main(String[] args) {
        Person one = new Person("John",new LevisJacket(),new WranglerPants(),new BershkaShoes());
        Person two = new Person("Bill",new BershkaJacket(), new LevisPants(),new WranglerShoes());
        Person three = new Person("Kevin",new WranglerJacket(),new BershkaPants(),new LevisShoes());

        one.putOnAll();
        System.out.println();
        one.putOffAll();
        System.out.println();
        two.putOnAll();
        System.out.println();
        two.putOffAll();
        System.out.println();
        three.putOnAll();
        System.out.println();
        three.putOffAll();

    }
}

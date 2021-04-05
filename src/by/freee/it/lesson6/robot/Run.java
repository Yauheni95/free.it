package by.freee.it.lesson6.robot;

import by.freee.it.lesson6.robot.hands.SamsungHand;
import by.freee.it.lesson6.robot.hands.ToshibaHand;
import by.freee.it.lesson6.robot.heads.SamsungHead;
import by.freee.it.lesson6.robot.heads.SonyHead;
import by.freee.it.lesson6.robot.heads.ToshibaHead;
import by.freee.it.lesson6.robot.legs.SamsungLeg;
import by.freee.it.lesson6.robot.legs.SonyLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot robocop = new Robot(new SonyHead(25), new SamsungHand(15), new SamsungLeg(22));
        Robot terminator = new Robot(new SamsungHead(20), new ToshibaHand(12), new SonyLeg(20));
        Robot valley = new Robot(new ToshibaHead(13), new SamsungHand(15), new SonyLeg(18));

        robocop.action();
        System.out.println();
        terminator.action();
        System.out.println();
        valley.action();
        System.out.println();

        int max_price = Math.max((Math.max(robocop.getPrice(), terminator.getPrice())), valley.getPrice());
        if (robocop.getPrice() == max_price)
            System.out.println("Самый дорогой робот - robocop, цена = " + robocop.getPrice());
        if (terminator.getPrice() == max_price)
            System.out.println("Самый дорогой робот - terminator, цена = " + terminator.getPrice());
        if (valley.getPrice() == max_price)
            System.out.println("Самый дорогой робот - valley, цена = " + valley.getPrice());


    }
}

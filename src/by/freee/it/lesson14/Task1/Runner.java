package by.freee.it.lesson14.Task1;

/*
1. Порт. Корабли заходят в порт для разгрузки/загрузки контейнеров. Число
контейнеров, находящихся в текущий момент в порту и на корабле, должно
быть неотрицательным и непревышающим заданную грузоподъемность суд-
на и вместимость порта. В порту работает несколько причалов. У одного
причала может стоять один корабль. Корабль может загружаться у причала,
разгружаться или выполнять оба действия.
 */

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Port port = new Port(100);
        Ship ship1 = new Ship(1, 24);
        Ship ship2 = new Ship(2, 31);
        Ship ship3 = new Ship(3, 31);
        Ship ship4 = new Ship(4, 22);
        Ship ship5 = new Ship(5, 16);
        Ship ship6 = new Ship(6, 19);
        ship1.addRandomContainer();
        ship1.addRandomContainer();
        ship1.addRandomContainer();
        ship1.addRandomContainer();
        ship1.addRandomContainer();
        ship2.addRandomContainer();
        ship2.addRandomContainer();
        ship2.addRandomContainer();
        ship2.addRandomContainer();
        ship2.addRandomContainer();
        ship3.addRandomContainer();
        ship3.addRandomContainer();
        ship3.addRandomContainer();
        ship3.addRandomContainer();
        ship6.addRandomContainer();
        ship6.addRandomContainer();
        ship6.addRandomContainer();
        ship6.addRandomContainer();
        ship6.addRandomContainer();
        new Thread(new ShipUnLoader(ship1,port)).start();
        new Thread(new ShipUnLoader(ship2,port)).start();
        new Thread(new ShipLoader(ship3,port)).start();
        new Thread(new ShipLoader(ship4,port)).start();
        new Thread(new ShipLoader(ship5,port)).start();
        new Thread(new ShipUnLoader(ship6,port)).start();
        Thread.sleep(1000);
        System.out.println("В порту находится "+port.getContainers().size()+ " контейнеров.");
    }
}

package by.freee.it.lesson14.Task1;

public class ShipUnLoader implements Runnable {
    private Ship ship;
    private Port port;

    public ShipUnLoader(Ship ship, Port port) {
        this.ship = ship;
        this.port = port;
    }

    @Override
    public void run() {
        int index = ship.getContainers().size() - 1;
        if (index == 0) {
            System.out.println(ship.getId() + "пуст");
        } else {
            try {
                port.getPiers().acquire();
                while (index >= 0 || port.getContainers().size() == port.getCapacity()) {
                    port.getContainers().add(ship.getContainers().remove(index));
                    System.out.println("С корабля № " + ship.getId() + " сняли контейнер,всего осталось " + (index) + " контейнеров");
                    index--;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            port.getPiers().release();
        }
    }
}

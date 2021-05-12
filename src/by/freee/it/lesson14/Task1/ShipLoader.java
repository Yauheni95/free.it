package by.freee.it.lesson14.Task1;

public class ShipLoader implements Runnable {
    private final Ship ship;
    private final Port port;

    public ShipLoader(Ship ship, Port port) {
        this.ship = ship;
        this.port = port;
    }

    @Override
    public void run() {
        if (ship.getWeight() == ship.getLiftingCapacity()) {
            System.out.println("корабль № " + ship.getId() + "полон");
        } else {
            try {
                port.getPiers().acquire();

                while (ship.getLiftingCapacity() - ship.getWeight() > 10 && port.getContainers().size() > 0) {
                    for (int i = 0; i < port.getContainers().size(); i++) {
                        if (port.getContainers().size() <= 0 || port.getContainers().get(i).getWeight() >= ship.getLiftingCapacity() - ship.getWeight()) {
                            continue;
                        }
                        ship.addContainer(port.getContainers().remove(i).getWeight());
                        System.out.println("На корабль № " + ship.getId() + " добавлен контейнер,можно еще загрузить " + (ship.getLiftingCapacity() - ship.getWeight()) + " тонн");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            port.getPiers().release();
        }
    }
}

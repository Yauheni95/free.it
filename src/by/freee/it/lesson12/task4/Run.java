package by.freee.it.lesson12.task4;

import java.io.*;

/*
4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс
 */

public class Run {
    public static void main(String[] args) {
        File file = new File("src//by//freee//it//lesson12//task4//example.bin");
        Car car = new Car("Audi", 255, 8950);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(car);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Car car1 = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            car1 = (Car) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(car1);
    }
}

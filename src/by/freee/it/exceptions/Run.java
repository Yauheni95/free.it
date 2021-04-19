package by.freee.it.exceptions;

public class Run {
    public static void main(String[] args) {
        Car car = new Car("Audi",13000,255);
        Car car1 = new Car("BMW",15000,275);
        Car car2 = new Car("Volvo",9000,215);
        try {
            car.start();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            car1.start();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        try {
            car2.start();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

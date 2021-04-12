package by.freee.it.lesson6.task4;

public class Computer {
    /*
    Создать класс Computer с внутренним классом, с помощью объектов которого
    можно хранить информацию об операционной системе, процессоре и оперативной памяти.
     */

    private String brand;
    private double price;
    private SystemParameters parameters;

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSystemParameters (String os, double processor, int ram){
        parameters=new SystemParameters();
        this.parameters.setOperationSystem(os);
        this.parameters.setProcessor(processor);
        this.parameters.setRam(ram);
    }

    @Override
    public String toString() {
        return "Computer " + brand +
                "\nSystemInfo: " + parameters.toString() ;
    }


    public  class SystemParameters {
       private String operationSystem;
       private double processor;
       private int ram;


        public String getOperationSystem() {
            return operationSystem;
        }

        public void setOperationSystem(String operationSystem) {
            this.operationSystem = operationSystem;
        }

        public double getProcessor() {
            return processor;
        }

        public void setProcessor(double processor) {
            this.processor = processor;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        @Override
        public String toString() {
            return  "Operation System - " + operationSystem +
                    ", Processor = " + processor + "GHz"+
                    ", RAM = " + ram + "GB.";
        }

        }


}


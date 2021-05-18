package by.freee.it.lesson13;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\37529\\IdeaProjects\\free.it\\src\\by\\freee\\it\\lesson13\\example.xml");
        File schema = new File("C:\\Users\\37529\\IdeaProjects\\free.it\\src\\by\\freee\\it\\lesson13\\schema.xsd");
        Computer computer = new Computer();
        computer.setName("ASUS");
        computer.setOrigin("China");
        computer.setPrice(1320.90);
        computer.setType(Computer.Type.Laptop);
        computer.setPeripherality(Computer.Peripherality.Peripheral);
        computer.setEnergyConsumption(220);
        computer.setPort(Computer.Port.USB);
        computer.setCooler(Computer.Cooler.YES);
        computer.setCriticality(Computer.Criticality.Critical);
        Computer computer1 = new Computer(1,"ACER", "Taiwan", 988, Computer.Type.Desktop, Computer.Peripherality.NonPeripheral, 160, Computer.Cooler.NO, Computer.Port.LPT, Computer.Criticality.NonCritical);
        Computer computer2 = new Computer(2,"SAMSUNG", "Japan", 1550, Computer.Type.Netbook, Computer.Peripherality.Peripheral, 220, Computer.Cooler.YES, Computer.Port.COM, Computer.Criticality.NonCritical);
        List<Computer> list = new ArrayList<>();
        Devices devices = new Devices();
        list.add(computer);
        list.add(computer1);
        devices.setDevices(list);
        JAXBWorker.writeListToXML(devices, file);
        System.out.println(JAXBWorker.validateXMLSchema(schema, file));
        Devices devices1 = JAXBWorker.fromXMLToObject(file);
        System.out.println(devices1.getDevices().get(0));
    }
}

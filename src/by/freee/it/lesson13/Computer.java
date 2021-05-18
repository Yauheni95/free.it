package by.freee.it.lesson13;


import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "Computer")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({Devices.class})
@XmlType(propOrder = {"id", "name", "origin", "price", "type", "peripherality", "energyConsumption", "port", "cooler", "criticality"})
public class Computer {
    @XmlAttribute
    private int id;
    private String name;
    private String origin;
    private double price;
    private Type type;
    private Peripherality peripherality;
    private int energyConsumption;
    private Cooler cooler;
    private Port port;
    private Criticality criticality;

    public Computer() {
    }

    public Computer(int id, String name, String origin, double price, Type type, Peripherality peripherality, int energyConsumption, Cooler cooler, Port port, Criticality criticality) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.type = type;
        this.peripherality = peripherality;
        this.energyConsumption = energyConsumption;
        this.cooler = cooler;
        this.port = port;
        this.criticality = criticality;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Peripherality getPeripherality() {
        return peripherality;
    }

    public void setPeripherality(Peripherality peripherality) {
        this.peripherality = peripherality;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Cooler getCooler() {
        return cooler;
    }

    public void setCooler(Cooler cooler) {
        this.cooler = cooler;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public Criticality getCriticality() {
        return criticality;
    }

    public void setCriticality(Criticality criticality) {
        this.criticality = criticality;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", peripherality=" + peripherality +
                ", energyConsumption=" + energyConsumption +
                ", cooler=" + cooler +
                ", port=" + port +
                ", criticality=" + criticality +
                '}';
    }

    enum Type {
        Desktop,
        Laptop,
        Monoblock,
        Netbook
    }

    enum Peripherality {
        Peripheral,
        NonPeripheral
    }

    enum Cooler {
        YES,
        NO
    }

    enum Port {
        COM,
        USB,
        LPT
    }

    enum Criticality {
        Critical,
        NonCritical
    }
}

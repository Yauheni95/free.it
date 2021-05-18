package by.freee.it.lesson13;

import jakarta.xml.bind.annotation.*;
import java.util.List;
@XmlRootElement(name = "Devices")
@XmlAccessorType(XmlAccessType.FIELD)
public class Devices {
    @XmlElement(name = "Computer")
    private List<Computer> Devices;

    public Devices(List<Computer> devices) {
        Devices = devices;
    }
    public Devices() {
    }

    public List <Computer> getDevices() {
        return Devices;
    }

    public void setDevices(List <Computer> devices) {
        Devices = devices;
    }
}

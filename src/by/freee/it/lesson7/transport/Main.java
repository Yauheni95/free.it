package by.freee.it.lesson7.transport;

public class Main {
    public static void main(String[] args) {
        CivilAirTransport transp1 = new CivilAirTransport(300, 250, 18000, "Airnub", 7.5, 110, 45, true);
        System.out.println(transp1.toString());
        transp1.checkPassengersCapacity(54);
        transp1.checkPassengersCapacity(19);
        System.out.println();

        LightLandTransport transp2 = new LightLandTransport(150, 220, 3000, "audi", 4, 10, "sedan", 6);
        System.out.println(transp2.toString());
        transp2.routeInformation(5);
        System.out.println();

        FreightLandTransport transp3 = new FreightLandTransport(190, 180, 5000, "Sprinter", 4, 16, 3);
        System.out.println(transp3.toString());
        transp3.checkCapacity(3100);
        transp3.checkCapacity(2000);
        System.out.println();

        MilitaryAirTransport transp4=new MilitaryAirTransport(340,450,5500.500,"Bullet",4.5,45,true,6);
        System.out.println(transp4.toString());
        transp4.shot();
        transp4.checkEjectionSystem();
    }
}

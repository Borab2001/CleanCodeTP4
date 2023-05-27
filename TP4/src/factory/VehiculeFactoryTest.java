package factory;

public class VehiculeFactoryTest {
    public static void main(String[] args) {
        Vehicule bus = VehiculeFactory.createVehicule(VehiculeType.BUS, Color.RED);
        Vehicule car = VehiculeFactory.createVehicule(VehiculeType.CAR, Color.BLUE);
        Vehicule truck = VehiculeFactory.createVehicule(VehiculeType.TRUCK, Color.GREEN);

        System.out.println("Created a " + bus.getColor() + " bus.");
        bus.start();

        System.out.println("Created a " + car.getColor() + " car.");
        car.start();

        System.out.println("Created a " + truck.getColor() + " truck.");
        truck.start();
    }
}

package factory;

public class VehiculeFactory {
    public static Vehicule createVehicule(VehiculeType type, Color color) {
        switch (type) {
            case BUS:
                return new Bus(color);
            case CAR:
                return new Car(color);
            case TRUCK:
                return new Truck(color);
            default:
                throw new IllegalArgumentException("Unsupported VehiculeType: " + type);
        }
    }
}

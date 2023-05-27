package factory;

public class Truck extends Vehicule {
    public Truck(Color color) {
        super(color);
    }

    @Override
    public void start() {
        System.out.println("Starting the truck");
    }
}

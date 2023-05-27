package factory;

public class Bus extends Vehicule {
    public Bus(Color color) {
        super(color);
    }

    @Override
    public void start() {
        System.out.println("Starting the bus");
    }
}

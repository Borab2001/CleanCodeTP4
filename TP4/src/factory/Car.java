package factory;

public class Car extends Vehicule {
    public Car(Color color) {
        super(color);
    }

    @Override
    public void start() {
        System.out.println("Starting the car");
    }
}

package factory;

public abstract class Vehicule {
    private Color color;

    public Vehicule(Color color) {
        this.color = color;
    }

    public abstract void start();

    public Color getColor() {
        return color;
    }
}


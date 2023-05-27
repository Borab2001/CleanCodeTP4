package washing;

public class WashStep extends SuitWashStep {
    public WashStep() {
        super("Wash");
    }

    @Override
    public void applyTo(Suit suit) {
        System.out.println("Washing the suit...");
        suit.setClean(true);
    }
}


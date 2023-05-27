package washing;

public abstract class SuitWashStep {
    protected String name;

    public SuitWashStep(String name) {
        this.name = name;
    }

    public SuitWashStep andThen(SuitWashStep nextStep) {
        return new CompositeSuitWashStep(this, nextStep);
    }

    public abstract void applyTo(Suit suit);
}

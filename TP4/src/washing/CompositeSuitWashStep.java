package washing;

public class CompositeSuitWashStep extends SuitWashStep {
    private SuitWashStep firstStep;
    private SuitWashStep secondStep;

    public CompositeSuitWashStep(SuitWashStep firstStep, SuitWashStep secondStep) {
        super(firstStep.name + " and " + secondStep.name);
        this.firstStep = firstStep;
        this.secondStep = secondStep;
    }

    @Override
    public void applyTo(Suit suit) {
        firstStep.applyTo(suit);
        secondStep.applyTo(suit);
    }
}

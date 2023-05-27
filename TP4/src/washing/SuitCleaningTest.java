package washing;

public class SuitCleaningTest {
    public static void main(String[] args) {
        Suit suit = new Suit();

        SuitWashStep washStep = new WashStep();
        SuitWashStep dryCleanStep = new SuitWashStep("Dry clean") {
            @Override
            public void applyTo(Suit suit) {
                System.out.println("Dry cleaning the suit...");
                suit.setClean(true);
            }
        };
        SuitWashStep ironStep = new SuitWashStep("Iron") {
            @Override
            public void applyTo(Suit suit) {
                System.out.println("Ironing the suit...");
                suit.setIroned(true);
            }
        };

        SuitWashStep cleaningProcess = washStep.andThen(dryCleanStep).andThen(ironStep);
        cleaningProcess.applyTo(suit);

        System.out.println("The suit is clean and ironed: " + suit.isClean() + ", " + suit.isIroned());
    }
}

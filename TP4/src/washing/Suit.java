package washing;

public class Suit {
    private boolean isClean;
    private boolean isIroned;

    public Suit() {
        this.isClean = false;
        this.isIroned = false;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public boolean isIroned() {
        return isIroned;
    }

    public void setIroned(boolean ironed) {
        isIroned = ironed;
    }
}

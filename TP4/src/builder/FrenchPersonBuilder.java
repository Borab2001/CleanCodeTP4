package builder;

public class FrenchPersonBuilder extends PersonBuilder<FrenchPersonBuilder> {
    private final double CM_IN_FEET = 30.48;

    @Override
    public FrenchPersonBuilder size(double size) {
        person.setSize(size);
        return this;
    }

    @Override
    public FrenchPersonBuilder title(Title title) {
        person.setTitle(title);
        return this;
    }
}

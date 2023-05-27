package builder;

import java.util.function.Consumer;

// AmericanPersonBuilder
public class AmericanPersonBuilder extends PersonBuilder<AmericanPersonBuilder> {
    private final double CM_IN_FEET = 30.48;

    @Override
    public AmericanPersonBuilder size(double size) {
        person.setSize(size * CM_IN_FEET);
        return this;
    }

    @Override
    public AmericanPersonBuilder title(Title title) {
        person.setTitle(title);
        return this;
    }

    public AmericanPersonBuilder with(Consumer<AmericanPersonBuilder> builder){
        builder.accept(this);
        return this;
    }
}
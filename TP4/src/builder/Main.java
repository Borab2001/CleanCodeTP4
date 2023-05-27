package builder;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person american = new AmericanPersonBuilder()
                .with(b -> b.name("John")
                        .size(6)
                        .title(Title.MR)
                        .birthday(new Date()))
                .build();

        Person french = new FrenchPersonBuilder()
                .name("Jean")
                .size(180)
                .title(Title.M)
                .birthday(new Date())
                .build();

        System.out.println(american);
        System.out.println(french);
    }
}


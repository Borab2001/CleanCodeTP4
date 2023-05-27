package builder;

import java.util.Date;

// Abstract Builder
public abstract class PersonBuilder<T extends PersonBuilder<T>> {
    protected Person person = new Person();

    public T name(String name) {
        person.setName(name);
        return (T) this;
    }

    public T birthday(Date birthday) {
        person.setBirthday(birthday);
        return (T) this;
    }

    abstract T size(double size);
    abstract T title(Title title);

    public Person build() {
        return person;
    }
}

package builder;

import java.util.Date;

public class Person {
    protected String name;
    protected double size;
    protected Title title;
    protected Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", title=" + title +
                ", birthday=" + birthday +
                '}';
    }
}

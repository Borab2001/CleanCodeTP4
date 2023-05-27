package adapter;

public class Charger implements Lightning {
    // private Lightning phone;

    // public void plugPhone(Lightning iphone) { this.phone = iphone; }

    @Override
    public void connect() {
        System.out.println("Charging device");
    }

    public void wireless() {
        System.out.println("Wireless charging");
    }
}

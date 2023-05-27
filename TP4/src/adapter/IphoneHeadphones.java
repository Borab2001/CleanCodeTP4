package adapter;

public class IphoneHeadphones implements Lightning {

    @Override
    public void connect() {
        System.out.println("Low Battery");
    }

}

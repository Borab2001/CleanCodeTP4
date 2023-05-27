package adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lightning iphoneCharger = new Charger();
        HeadphonesJack headphonesJack = new HeadphonesJack();
        Lightning iphoneAdapter = new IphoneAdapter(headphonesJack);

        List<Lightning> devices = new ArrayList<>();
        devices.add(iphoneCharger);
        devices.add(iphoneAdapter);
        devices.add(headphonesJack);

        devices.forEach(Lightning::connect);
    }
}

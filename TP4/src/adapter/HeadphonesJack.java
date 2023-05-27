package adapter;

public class HeadphonesJack implements Lightning {
    public void jackAintWorkin() {
        System.out.println("Oops, not working");
    }

    public void playMusic() {
        System.out.println("Look at me - XXXTentation");
    }

    @Override
    public void connect() {
        playMusic();
    }
}

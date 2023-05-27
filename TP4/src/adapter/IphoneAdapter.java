package adapter;

public class IphoneAdapter implements Lightning {

    private HeadphonesJack headphonesJack;

    public IphoneAdapter(HeadphonesJack headphonesJack) {
        this.headphonesJack = headphonesJack;
    }

    @Override
    public void connect() {
        headphonesJack.jackAintWorkin();
        headphonesJack.playMusic();
    }
}


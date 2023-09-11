package OOP;

public class TestTV {
    public static void main(String[] args) {
        TV tv = new TV(){};
        tv.turnOn();
        tv.setChannel(2);
        tv.setVolumeLevel(15);
        tv.channelUp();
        System.out.println(tv.channel);
        tv.channelDown();
        System.out.println(tv.channel);
        tv.volumeUp();
        System.out.println(tv.volumeLevel);
        tv.volumeDown();
        System.out.println(tv.volumeLevel);


    }
}

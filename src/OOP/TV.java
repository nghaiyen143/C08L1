package OOP;

public class TV {
    int channel;
    int volumeLevel;
    boolean on;
    public TV(){};
    public void turnOn(){
        on = true;
    };
    public void turnOff(){
        on = false;
    };
    public void setChannel(int newChannel){
        this.channel = newChannel;
    };
    public void setVolumeLevel(int newVolumeLevel){
        this.volumeLevel = newVolumeLevel;
    };
    public void channelUp(){
        channel++;
    };
    public void channelDown(){
        channel--;
    };
    public void volumeUp(){
        volumeLevel++;
    };
    public void volumeDown(){
        volumeLevel--;
    };
}

package bridge;

/**
 * Demo Bridge Pattern - Remote Control & Device
 */
public class BridgeDemo {
    public static void main(String[] args) {
        System.out.println("=== Test với TV + Remote cơ bản ===");
        Device tv = new Tv();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();
        remote.volumeUp();
        remote.channelUp();
        remote.channelUp();
        tv.printStatus();

        System.out.println("\n=== Test với Radio + Advanced Remote ===");
        Device radio = new Radio();
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(radio);
        advancedRemote.togglePower();
        advancedRemote.volumeUp();
        advancedRemote.volumeUp();
        advancedRemote.mute();
        radio.printStatus();
    }
}

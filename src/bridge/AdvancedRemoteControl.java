package bridge;

/**
 * Refined Abstraction - Điều khiển từ xa nâng cao
 */
public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("→ Tắt tiếng (Mute)");
    }
}

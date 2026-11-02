package bridge;

/**
 * Abstraction - Điều khiển từ xa cơ bản
 */
public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
            System.out.println("→ Tắt thiết bị");
        } else {
            device.enable();
            System.out.println("→ Bật thiết bị");
        }
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
        System.out.println("→ Giảm âm lượng: " + device.getVolume() + "%");
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
        System.out.println("→ Tăng âm lượng: " + device.getVolume() + "%");
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
        System.out.println("→ Chuyển kênh xuống: " + device.getChannel());
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
        System.out.println("→ Chuyển kênh lên: " + device.getChannel());
    }
}

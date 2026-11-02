package observer;

/**
 * Concrete Subscriber - Ghi log
 */
public class LoggingListener implements EventListener {
    private final String message;

    public LoggingListener(String message) {
        this.message = message;
    }

    @Override
    public void update(String eventType, String data) {
        System.out.println("[LoggingListener] " + message.replace("%s", data));
    }
}

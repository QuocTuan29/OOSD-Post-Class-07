package observer;

/**
 * Concrete Subscriber - Gửi email cảnh báo
 */
public class EmailAlertsListener implements EventListener {
    private final String email;
    private final String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String eventType, String data) {
        System.out.println("[EmailAlerts] Gửi đến " + email + ": " + message.replace("%s", data));
    }
}

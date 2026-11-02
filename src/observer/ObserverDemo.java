package observer;

/**
 * Demo Observer Pattern
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        // Đăng ký listeners
        LoggingListener logger = new LoggingListener("Ai đó đã mở file: %s");
        editor.events.subscribe("open", logger);

        EmailAlertsListener emailAlerts = new EmailAlertsListener(
                "admin@example.com",
                "Ai đó đã thay đổi file: %s"
        );
        editor.events.subscribe("save", emailAlerts);

        // Thêm logger cho event save
        LoggingListener saveLogger = new LoggingListener("File đã được lưu: %s");
        editor.events.subscribe("save", saveLogger);

        System.out.println("\n--- Thao tác với Editor ---");
        editor.openFile("/path/to/test.txt");
        editor.saveFile();

        System.out.println("\n--- Hủy đăng ký email alerts ---");
        editor.events.unsubscribe("save", emailAlerts);
        editor.saveFile();
    }
}

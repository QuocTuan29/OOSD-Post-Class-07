package observer;

/**
 * Subscriber interface
 */
public interface EventListener {
    void update(String eventType, String data);
}

package observer;

/**
 * Concrete Publisher - Text Editor
 */
public class Editor {
    public EventManager events;
    private String fileName;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String path) {
        this.fileName = path;
        System.out.println("[Editor] Đang mở file: " + path);
        events.notify("open", path);
    }

    public void saveFile() {
        System.out.println("[Editor] Đang lưu file: " + fileName);
        events.notify("save", fileName);
    }
}

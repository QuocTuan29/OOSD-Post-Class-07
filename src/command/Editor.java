package command;

/**
 * Receiver - Trình soạn thảo văn bản
 */
public class Editor {
    public String text = "";

    public String getSelection() {
        // Giả lập: lấy toàn bộ text hiện tại
        return text;
    }

    public void deleteSelection() {
        text = "";
        System.out.println("[Editor] Đã xóa nội dung");
    }

    public void replaceSelection(String content) {
        text = content;
        System.out.println("[Editor] Đã thay thế nội dung: \"" + content + "\"");
    }

    public void setText(String text) {
        this.text = text;
    }
}

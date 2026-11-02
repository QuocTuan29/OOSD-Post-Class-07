package command;

import java.util.Stack;

/**
 * Application - Quản lý clipboard và lịch sử command (Invoker + Client)
 */
public class Application {
    public String clipboard = "";
    public Editor activeEditor;
    private final Stack<Command> history = new Stack<>();

    public Application() {
        this.activeEditor = new Editor();
    }

    public void executeCommand(Command command) {
        command.execute();
        // Chỉ lưu những command có thể undo (ở ví dụ này tất cả đều lưu)
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
            System.out.println("[App] Đã Undo");
        } else {
            System.out.println("[App] Không còn gì để Undo");
        }
    }
}

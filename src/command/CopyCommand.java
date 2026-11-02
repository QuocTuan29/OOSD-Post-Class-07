package command;

public class CopyCommand implements Command {
    private final Application app;
    private final Editor editor;

    public CopyCommand(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    @Override
    public void execute() {
        app.clipboard = editor.getSelection();
        System.out.println("[Copy] Đã copy: \"" + app.clipboard + "\"");
    }

    @Override
    public void undo() {
        // Copy không thay đổi state → không cần undo
    }
}

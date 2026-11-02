package command;

public class CutCommand implements Command {
    private final Application app;
    private final Editor editor;
    private String backup;

    public CutCommand(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    @Override
    public void execute() {
        backup = editor.text;          // Lưu backup để undo
        app.clipboard = editor.getSelection();
        editor.deleteSelection();
        System.out.println("[Cut] Đã cut: \"" + app.clipboard + "\"");
    }

    @Override
    public void undo() {
        editor.setText(backup);
        System.out.println("[Cut-Undo] Khôi phục text: \"" + backup + "\"");
    }
}

package command;

public class PasteCommand implements Command {
    private final Application app;
    private final Editor editor;
    private String backup;

    public PasteCommand(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    @Override
    public void execute() {
        backup = editor.text;
        editor.replaceSelection(app.clipboard);
        System.out.println("[Paste] Đã paste: \"" + app.clipboard + "\"");
    }

    @Override
    public void undo() {
        editor.setText(backup);
        System.out.println("[Paste-Undo] Khôi phục text: \"" + backup + "\"");
    }
}

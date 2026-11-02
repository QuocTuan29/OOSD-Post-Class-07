package command;

/**
 * Demo Command Pattern - Text Editor với Undo
 */
public class CommandDemo {
    public static void main(String[] args) {
        Application app = new Application();
        Editor editor = app.activeEditor;

        // Thiết lập text ban đầu
        editor.setText("Hello Design Patterns");
        System.out.println("Text ban đầu: \"" + editor.text + "\"\n");

        // 1. Copy
        Command copy = new CopyCommand(app, editor);
        app.executeCommand(copy);

        // 2. Cut
        Command cut = new CutCommand(app, editor);
        app.executeCommand(cut);
        System.out.println("Text sau Cut: \"" + editor.text + "\"\n");

        // 3. Paste
        Command paste = new PasteCommand(app, editor);
        app.executeCommand(paste);
        System.out.println("Text sau Paste: \"" + editor.text + "\"\n");

        // 4. Undo Paste
        app.undo();
        System.out.println("Text sau Undo: \"" + editor.text + "\"\n");

        // 5. Undo Cut
        app.undo();
        System.out.println("Text sau Undo lần 2: \"" + editor.text + "\"");
    }
}

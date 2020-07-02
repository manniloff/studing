package patterns.behavioral.state.tools;

public class SelectionTool implements Tools {
    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}

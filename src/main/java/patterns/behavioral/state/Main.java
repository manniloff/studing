package patterns.behavioral.state;

import patterns.behavioral.state.canvas.Canvas;
import patterns.behavioral.state.tools.BrushTool;
import patterns.behavioral.state.tools.EraserTool;
import patterns.behavioral.state.tools.SelectionTool;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}

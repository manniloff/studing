package patterns.behavioral.state;

import patterns.behavioral.state.canvas.Canvas;
import patterns.behavioral.state.tools.BrushTool;
import patterns.behavioral.state.tools.EraserTool;
import patterns.behavioral.state.tools.SelectionTool;

/**
 * State pattern - позволяет объектам менять поведение в зависимости от своего состояния. Извне создаётся впечатление, что изменился класс объекта.
 * <p>
 * Примеры Состояния в стандартных библиотеках Java:
 * javax.faces.lifecycle.LifeCycle#execute() (контролируемый из FacesServlet: поведение зависит от текущей фазы (состояния) JSF)
 */

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

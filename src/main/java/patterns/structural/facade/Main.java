package patterns.structural.facade;

import patterns.structural.facade.video.VideoConversionFacade;

import java.io.File;

/**
 * Facade pattern - предоставляет простой интерфейс к сложной системе классов, библиотеке или фреймворку.
 *
 * Паттерн часто встречается в клиентских приложениях, написанных на Java, которые используют классы-фасады для упрощения работы со сложными библиотеки или API.
 *
 * Примеры Фасадов в стандартных библиотеках Java:
 * javax.faces.context.FacesContext использует «под капотом» классы LifeCycle, ViewHandler, NavigationHandler и многие другие, но клиенты об этом даже не знают (что не мешает заменить эти классы другими с помощью инъекций).
 * javax.faces.context.ExternalContext использует внутри классы ServletContext, HttpSession, HttpServletRequest, HttpServletResponse, и так далее.
 *
 * В этом примере Фасад упрощает работу клиента со сложной библиотекой видеоконвертации.
 *
 * Фасад предоставляет пользователю лишь один простой метод, скрывая за собой целую систему с видеокодеками, аудиомикшерами и другими не менее сложными объектами.
 */
public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}

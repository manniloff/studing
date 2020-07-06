package patterns.behavioral.chain_of_responsibility;

import patterns.behavioral.chain_of_responsibility.authcheck.Middleware;
import patterns.behavioral.chain_of_responsibility.authcheck.RoleCheckMiddleware;
import patterns.behavioral.chain_of_responsibility.authcheck.ThrottlingMiddleware;
import patterns.behavioral.chain_of_responsibility.authcheck.UserExistsMiddleware;
import patterns.behavioral.chain_of_responsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Демо-класс. Здесь всё сводится воедино.
 * <p>
 * Chain of responsibility patter - помогает нам решить проблему последовательных действий.
 * <p>
 * Представьте, что вы делаете систему приёма онлайн-заказов. Вы хотите ограничить к ней доступ так,
 * чтобы только авторизованные пользователи могли создавать заказы. Кроме того, определённые пользователи,
 * владеющие правами администратора, должны иметь полный доступ к заказам.
 * <p>
 * Этот пример показывает как пользовательские данные проходят последовательную аутентификацию в множестве обработчиков, связанных в одну цепь.
 * <p>
 * Этот пример отличается от канонической версии тем, что проверка обрывается, если очередной обработчик не может обработать запрос.
 * В классическом варианте, следование по цепочке заканчивается как только нашёлся элемент цепи, который может обработать запрос.
 * Просто знайте, что Концептуальный пример от этого не меняется, а код отличается только условием выхода из цепи.
 */

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // Проверки связаны в одну цепь. Клиент может строить различные цепи,
        // используя одни и те же компоненты.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                  .linkWith(new RoleCheckMiddleware());

        // Сервер получает цепочку от клиентского кода.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
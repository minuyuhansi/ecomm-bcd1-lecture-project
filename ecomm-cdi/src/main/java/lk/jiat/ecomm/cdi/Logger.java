package lk.jiat.ecomm.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import lk.jiat.ecomm.annotation.Console;

@ApplicationScoped
public class Logger {
    public void log(@Observes String message) {
        System.out.println("Logger: " + message);
    }

    public void ConsoleLog(@Observes @Console String message) {
        System.out.println("Console Logger: " + message);
    }
}

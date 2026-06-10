package lk.jiat.ecomm.cdi;

import jakarta.enterprise.context.Dependent;
import lk.jiat.ecomm.annotation.Email;

@Email
@Dependent
public class EmailNotifier implements NotificationService{
    @Override
    public void notify(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

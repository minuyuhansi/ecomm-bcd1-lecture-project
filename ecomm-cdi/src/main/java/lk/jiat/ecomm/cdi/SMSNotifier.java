package lk.jiat.ecomm.cdi;

import jakarta.enterprise.context.Dependent;
import lk.jiat.ecomm.annotation.SMS;

@SMS
@Dependent
public class SMSNotifier implements NotificationService{
    @Override
    public void notify(String message) {
            System.out.println("Sending SMS notification: " + message);

    }
}

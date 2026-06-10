package lk.jiat.ecomm.ejb;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import lk.jiat.ecomm.annotation.Email;
import lk.jiat.ecomm.annotation.SMS;
import lk.jiat.ecomm.cdi.MyService;
import lk.jiat.ecomm.cdi.NotificationService;
import lk.jiat.ecomm.ejb.remote.AppSetting;

@Stateless
public class AppSettingSessionBean implements AppSetting {

    @Inject
    private MyService myService;

    @Inject
    @SMS
    private NotificationService notificationService;

    @Override
    public String getName() {
        notificationService.notify("This is a notification from AppSettingSessionBean.");
//        myService.doSomething();
        return "Ecomm EE Application";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String getDescription() {
        return "This is  the Ecomm EE App setting session bean";
    }
}

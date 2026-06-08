package lk.jiat.ecomm.ejb;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.inject.Inject;
import lk.jiat.ecomm.cdi.MyService;
import lk.jiat.ecomm.ejb.remote.AppSetting;

@Singleton
public class AppSettingSessionBean implements AppSetting {

    @Inject
    private MyService myService;

    @Override
    public String getName() {
        myService.doSomething();
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

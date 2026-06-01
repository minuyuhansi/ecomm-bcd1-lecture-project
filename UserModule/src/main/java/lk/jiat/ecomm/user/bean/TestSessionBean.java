package lk.jiat.ecomm.user.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Stateless;
import lk.jiat.ecomm.user.remote.TestRemote;

@Stateless
public class TestSessionBean implements TestRemote {

    int i;

    @PostConstruct
    public void init() {
        System.out.println("TestSessionBean instance created... ");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("TestSessionBean instance destroyed... ");
    }

    @Override
    public String test() {

        i++;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "Test method called... " + i + " times. Instance: " + this;
    }
}

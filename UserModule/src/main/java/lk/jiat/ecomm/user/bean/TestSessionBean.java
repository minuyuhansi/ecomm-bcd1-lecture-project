package lk.jiat.ecomm.user.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.PostActivate;
import jakarta.ejb.PrePassivate;
import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;
import lk.jiat.ecomm.user.remote.TestRemote;

@Stateful
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

    @PostActivate
    void postActivate() {
        System.out.println("TestSessionBean instance activated... ");
    }

    @PrePassivate
    void prePassivate() {
        System.out.println("TestSessionBean instance passivated... ");
    }

    @Override
    public String test() {

        for (int i=0; i < 10; i++) {
            this.i++;
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "Test method called... " + i + " times. Instance: " + this;
    }
}

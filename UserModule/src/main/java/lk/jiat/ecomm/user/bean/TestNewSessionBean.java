package lk.jiat.ecomm.user.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.*;
import lk.jiat.ecomm.user.remote.TestRemote;

@Stateful(mappedName = "TestNewSessionBean")
//@Startup
public class TestNewSessionBean implements TestRemote {

    int i;

    @PostConstruct
    public void init() {
        System.out.println("TestNewSessionBean instance created... ");
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

    @Remove
    public void remove() {
        System.out.println("TestSessionBean instance removed... ");
    }

    @Override
//    @Lock(LockType.READ)
    public String test() {

        i++;
        System.out.println("TestSessionBean test...");

//        for (int i = 0; i < 10; i++) {
//            this.i++;
//        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "Test method called... " + i + " times. Instance: " + this;
    }
}

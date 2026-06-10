package lk.jiat.ecomm.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

//@ApplicationScoped
@Dependent
public class MyService {
    public void doSomething() {
        System.out.println("Doing something in MyService..."+this);
    }
}

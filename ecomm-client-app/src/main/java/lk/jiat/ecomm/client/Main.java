package lk.jiat.ecomm.client;

import lk.jiat.ecomm.user.remote.TestRemote;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Client Application is working...");

        try {
            InitialContext ic = new InitialContext();
            TestRemote testRemote = (TestRemote) ic.lookup("java:global/ecomm-user-1.0/TestSessionBean");
            testRemote.test();


        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}

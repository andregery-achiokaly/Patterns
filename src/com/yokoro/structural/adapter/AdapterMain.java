package com.yokoro.structural.adapter;


public class AdapterMain {

    public void show(){
        System.out.println("\nAdapter: \n" +
                "Problem: Client needs in some result from Adaptee.\n" +
                "But Interface of Adaptee is different of Client\n" +
                "Resolution: We create ConcreteAdapter that implements Adapter with the right interface.\n" +
                "After that Client can use this ConcreteAdapter and will got needed result\n" +
                "Exmaple: new Client().doSomething();");
        new Client().doSomething();
    }
}

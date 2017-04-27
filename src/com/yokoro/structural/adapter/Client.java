package com.yokoro.structural.adapter;



public class Client {
    public void doSomething (){
        Adapter adapter = new ConcreteAdapter();

        Double key = adapter.makeSomething2();
        System.out.println("Result: " + key);
    }
}

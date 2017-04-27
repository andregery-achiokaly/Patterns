package com.yokoro.structural.decorator;


public class ConcreteComponent implements Component {
    @Override
    public void doSomething() {
        System.out.println("ConcreteComponent do something");
    }

    @Override
    public double getSomeValue() {
        return 0;
    }
}
package com.yokoro.structural.adapter;


public class ConcreteAdapter implements Adapter {
    private Adaptee plumber = new Adaptee();

    @Override
    public Double makeSomething1() {
        return Double.valueOf(plumber.getSomething1());
    }

    @Override
    public Double makeSomething2() {
        return Double.valueOf(plumber.getSomething2());
    }

    @Override
    public Double makeSomething3() {
        return Double.valueOf(plumber.getSomething3());
    }
}

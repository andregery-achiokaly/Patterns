package com.yokoro.structural.decorator;


public class ConcreteDecorator2 implements Decorator {
    Component component;

    public ConcreteDecorator2(Component c){
        setComponent(c);
    }

    @Override
    public void setComponent(Component c) {
        this.component = c;
    }

    @Override
    public void doSomething() {
       component.doSomething();
       doConcreteSomething();
    }

    private void doConcreteSomething() {
        System.out.println("ConcreteDecorator2 do something");
    }

    @Override
    public double getSomeValue() {
        return component.getSomeValue() + 2;
    }
}

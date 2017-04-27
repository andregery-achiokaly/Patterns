package com.yokoro.structural.decorator;


public class ConcreteDecorator3 implements Decorator {
    Component component;

    public ConcreteDecorator3(Component c){
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
        System.out.println("ConcreteDecorator3 do something");
    }

    @Override
    public double getSomeValue() {
        return component.getSomeValue() + 3;
    }
}

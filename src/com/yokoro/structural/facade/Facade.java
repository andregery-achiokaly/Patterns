package com.yokoro.structural.facade;

/**
 * Created by Alexander_Topilskii on 1/3/2017.
 */
public class Facade {
    private ElementSystem1 operator1;
    private ElementSystem2 operator2;
    private ElementSystem3 operator3;

    Facade() {
        operator1 = new ElementSystem1();
        operator2 = new ElementSystem2();
        operator3 = new ElementSystem3();
    }

    public void doSomethingLowLevel() {
        operator1.lowLevelDoSomething();
        operator2.lowLevelDoSomething();
        operator3.lowLevelDoSomething();
    }

    public void doSomethingHighLevel() {
        operator1.highLevelDoSomething();
        operator2.highLevelDoSomething();
        operator3.highLevelDoSomething();
    }
}

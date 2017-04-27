package com.yokoro.structural.facade;

/**
 * Created by Alexander_Topilskii on 1/3/2017.
 */
public class ElementSystem1 {
    public void lowLevelDoSomething() {
        System.out.println(this.getClass().getSimpleName() + " Low level do something");
    }

    public void highLevelDoSomething() {
        System.out.println(this.getClass().getSimpleName() + " High level do something");
    }
}

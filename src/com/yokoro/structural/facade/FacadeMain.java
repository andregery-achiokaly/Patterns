package com.yokoro.structural.facade;

/**
 * <b>Facade:</b> <img width="640" height="305" src="../../images/facade.jpg" alt="">
 * <p><b>Проблема:</b><p>есть большая сложная система, которой трудно управлять.
 * <p><b>Решение:</b><p>сделать фасад для нее и через фасад управлять системой.
 * <p><b>Пример:</b><p>new Facade().doSomethingLowLevel();
 */
public class FacadeMain {

    public void show() {
        System.out.println();
        Facade facade = new Facade();
        System.out.println("Hello, Facade, could you do something low level?");
        facade.doSomethingLowLevel();
        System.out.println("Thanks! Facade, could you do something high level?");
        facade.doSomethingHighLevel();
    }
}

package com.yokoro.structural.facade;

/**
 * Created by Alexander_Topilskii on 1/3/2017.
 */
public class FacadeMain {

    public void show(){
        System.out.println("Facade:\n" +
                "Проблема: есть большая сложная система, которой трудно управлять.\n" +
                "Решение: сделать фасад для нее и через фасад управлять системой.\n" +
                "Пример: new Facade().doSomethingLowLevel();\n");
        Facade facade = new Facade();
        System.out.println("Hello, Facade, could you do something low level?");
        facade.doSomethingLowLevel();
        System.out.println("Thanks! Facade, could you do something high level?");
        facade.doSomethingHighLevel();
    }
}

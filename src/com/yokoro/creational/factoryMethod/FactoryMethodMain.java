package com.yokoro.creational.factoryMethod;


import java.io.File;

public class FactoryMethodMain {
    public void show(){
        new FactoryMethod().getWriter(new File("SS"));
    }
}

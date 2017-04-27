package com.yokoro;

import com.yokoro.creational.factoryMethod.FactoryMethodMain;
import com.yokoro.structural.adapter.AdapterMain;
import com.yokoro.structural.decorator.DecoratorMain;
import com.yokoro.structural.facade.FacadeMain;
/*
<img width="640" height="305" src="./0b909b8fbe9fa7d4c02225c2004cb126.jpg" alt="">
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        new DecoratorMain().show();
        new FacadeMain().show();
        new AdapterMain().show();
        new FactoryMethodMain().show();
    }
}

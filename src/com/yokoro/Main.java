package com.yokoro;

import com.yokoro.creational.factoryMethod.FactoryMethodMain;
import com.yokoro.structural.adapter.AdapterMain;
import com.yokoro.structural.decorator.DecoratorMain;
import com.yokoro.structural.facade.FacadeMain;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        new DecoratorMain().show();
        new FacadeMain().show();
        new AdapterMain().show();
        new FactoryMethodMain().show();
    }
}

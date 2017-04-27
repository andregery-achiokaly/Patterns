package com.yokoro;

import com.yokoro.creational.abstractFactory.AbstractFactoryMain;
import com.yokoro.creational.builder.BuilderMain;
import com.yokoro.creational.factoryMethod.FactoryMethodMain;
import com.yokoro.creational.prototype.PrototypeMain;
import com.yokoro.structural.decorator.DecoratorMain;

/**
 * Паттерны проектирования.
 * Плюсы:
 * снижении сложности разработки за счёт готовых абстракций для решения целого класса проблем
 * облегчают коммуникацию
 * Минусы:
 * вызывают желание использовать там где не надо
 * слепое следование некоторому выбранному шаблону может привести к усложнению программы
 * черезмерное ООП снижает производительность системы
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        new DecoratorMain().show();
//        new FacadeMain().show();
//        new AdapterMain().show();
        new FactoryMethodMain().show();
        new AbstractFactoryMain().show();
        new BuilderMain().show();
        new PrototypeMain().show();
    }
}

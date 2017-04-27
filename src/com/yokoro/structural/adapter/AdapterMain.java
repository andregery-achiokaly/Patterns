package com.yokoro.structural.adapter;

/**
 * <p><b>Adapter:</b> <img width="640" height="305" src="../../images/adapter.jpg" alt="">
 * <p><b>Проблема:</b><p> Клиенты нуждаются в результате от интерфейса Adaptee.
 * <p>Но интерфейс Adaptee отличается от интерфейса клиентов
 * <p><b>Решение:</b><p> мы создаем ConcreteAdapter который имплементит Adapter с правильным интерфейсом.
 * <p>После этого Client может использовать этот ConcreteAdapter и получать правильный результат
 * <p><b>Пример:</b><p> new Client().doSomething();
 */
public class AdapterMain {

    public void show() {
        System.out.println();
        new Client().doSomething();
    }
}

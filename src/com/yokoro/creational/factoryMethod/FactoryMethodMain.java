package com.yokoro.creational.factoryMethod;


import java.io.File;

/**
 * <b>Фабричный метод</b> <img  src="../../images/factory method.jpg" alt="">
 * <p><p>Мы делаем интерфейс Creator с методом create, который возвращает интерфейс Product.
 * Далее имплементируем от этого интерфейса классы.
 * <p>Таким образом у нас получается несколько классов с методами create.
 * Каждый метод create возвращает свою реализацию Product
 * И мы можем подменяя реализацию получать разный Product метода create.
 * <p>Плюсы: Таким образом мы не завязаны на реализцаии конкретного Creator-а<p>
 * Минусы: нужно создавать конкретного креейтора под каждый продукт
 */

public class FactoryMethodMain {
    public void show() {
        new FactoryMethod().getWriter(new File("somepath"));
    }
}

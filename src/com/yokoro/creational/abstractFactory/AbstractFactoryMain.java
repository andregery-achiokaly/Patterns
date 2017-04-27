package com.yokoro.creational.abstractFactory;


/**
 * Абстрактная фабрика
 * <img  src="../../images/abstractFactory.jpg" alt="">
 * <p>
 * Мы пишем интерфейс АбстрактнаяФабрика, с методами сделатьПродук1(), сделатьПродукт2
 * Делаем Фабрику, которая наследуется от этого интерфейса и имлементим методы.
 * Далее мы можем подменять фабрики и получать разные продукты
 * Плюсы:
 * Мы не завязаны на конкретной фабрике - можем подменять ее
 * Мы спрятали производство продуктов в фабрику
 * Мы можем не беспокоится, что продукт1 и продукт2 не подойдут друг к другу,
 * т.к. конкретной реализацией продукта1 и продукт2 занимается конкретная фабрика,
 * пример: Фабрики: АбстрактныйМагазинЖивотных и его имплеменатции: МагазинСобак и МагазинКошек,
 * у них есть методы: сделатьЖивотное() и сделатьКорм(), которые возвращают Животное и Корм
 * подменяя реализацию фабрик мы получаем набор из кошки и ее корма (или собаи и собчаегоКорма)
 * Таким образом мы можем не бояться, что Кошка будет случайно питаться СобачьимКормом
 * </p>
 */
public class AbstractFactoryMain {
    public void show() {
        TestClient test = new TestClient(); //Создаем наш тестовый клиент
        System.out.println("Run example for Japan");
        String countryCode = "JP"; //Выбранная страна - Япония
        test.run(countryCode); // запускаем клиент
        String s = new String("D");

        System.out.println("Run example for US");
        countryCode = "US";//Выбираем США
        test.run(countryCode);

        System.out.println("Run example for DE");
        countryCode = "DE"; // Выбираем Германию, которую еще не поддерживаем
        test.run(countryCode);
    }
}
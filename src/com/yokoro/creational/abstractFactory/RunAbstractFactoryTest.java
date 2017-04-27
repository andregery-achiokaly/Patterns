package com.yokoro.creational.abstractFactory;

public class RunAbstractFactoryTest {
    public static void main(String args[]){
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

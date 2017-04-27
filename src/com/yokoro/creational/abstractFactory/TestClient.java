package com.yokoro.creational.abstractFactory;

public class TestClient {
    public void run(String countryId){//Параметр определяет страну
        UIAbstractFactory uiFactory = null; //Инициализируем фабрику
        if(countryId.equals("JP"))
            uiFactory = new JapaneseUIFactory(); // Создаем фабрику UI для Японии
        if(countryId.equals("US"))
            uiFactory = new USUIFactory(); // Создаем фабрику для США

        if(uiFactory != null){
            Help help = uiFactory.getHelp(); //Справка
            log("help created for: " + help.getHelpCountry());

            Images images = uiFactory.getImages(); // Баннеры
            log("UI images created for: " + images.getImagesCountry());

            Locale locale = uiFactory.getLocale(); // Локализация
            log("UI locale created for: " + locale.getLocaleCountry());
        }else{
            log("Wrong country id");
        }
    }

    private void log(String msg){
        System.out.println(msg);
    }
}

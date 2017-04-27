package com.yokoro.structural.decorator;

/**
 * Created by Alexander_Topilskii on 1/3/2017.
 */
public class DecoratorMain {

    //Point of entering to show Decorator
    public void show() {
        System.out.println("Decorator: \n" +
                "Проблема: Есть класс ConcreteComponent который делает doSomething, \n" +
                "которому нужно добавить новый функционал.\n" +
                "Возможно не один. Возможно в разных местах потребуется разный функционал\n" +
                "Что делаем: Создаем к нему интерфейс Component\n" +
                "и имплементим от него Декоратор(что бы повторять функционал).\n" +
                "В декораторе имеем поле с Component и в конструктор Декоратора\n" +
                "передаем и присваиваем этот компонент.\n" +
                "Далее создаем ConcreteDecorator и в методе doSomething вызываем метод Component-a после \n" +
                "чего вызываем дополнительный метод, который был нужен \n" +
                "Таким образом у нас пофвился новый функционал.\n" +
                "При необходимости мы можем создать еще один конкретный декоратор \n" +
                "И экземпляр первого декоратора передавать \n" +
                "в конструктор второго, таким образом функционал будет увеличиваться.\n" +
                "Минусы: может появиться много одотипных декораторов, что ухудшит читабельность.\n" +
                "Пример:\n" +
                "Component component = new ConcreteComponent();\n" +
                "component = new ConcreteDecorator3(new ConcreteDecorator2(new ConcreteDecorator1(component)));\n" +
                "component.doSomething();\n");
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator3(new ConcreteDecorator2(new ConcreteDecorator1(component)));
        System.out.println("Do something");
        component.doSomething();
        System.out.println("Total value: " + component.getSomeValue());
    }

    /* Results:
    Order for my computer
    Component: My computer
    Component: Logitech ConcreteDecorator1 K200
    Component: SteelSeries Sensei MLG 62153 Black
    Component: Toshiba STOR.E 1TB
    Component: Toshiba STOR.E 1TB
    Total cost: 50270.0
     */
}

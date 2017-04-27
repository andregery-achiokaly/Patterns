package com.yokoro.structural.decorator;

/**
 * <b>Decorator:</b>
 * <img width="640" height="305" src="../../images/Decorator.jpg" alt="">
 * <p><b>Проблема:</b> Есть класс ConcreteComponent который делает doSomething,
 * которому нужно добавить новый функционал.Возможно не один.
 * Возможно в разных местах потребуется разный функционал.
 * <p>
 * <b>Что делаем:</b>
 * Создаем к нему интерфейс Component и
 * имплементим от него Декоратор(что бы повторять функционал).
 * В декораторе имеем поле с Component и в конструктор Декоратора
 * передаем и присваиваем этот компонент.
 * Далее создаем ConcreteDecorator и в методе doSomething
 * вызываем метод Component-a после чего вызываем дополнительный метод,
 * который был нужен Таким образом у нас пофвился новый функционал.
 * При необходимости мы можем создать еще один конкретный декоратор
 * И экземпляр первого декоратора передавать в конструктор второго,
 * таким образом функционал будет увеличиваться.
 * <p>
 * <b>Минусы:</b><p>
 * Может появиться много одотипных декораторов,
 * что ухудшит читабельность.
 * <p><b>Пример:</b>
 * <p>Component component = new ConcreteComponent();
 * <p>component = new ConcreteDecorator3(new ConcreteDecorator2(new ConcreteDecorator1(component)));
 * <p>component.doSomething();
 * <p>
 * <b>Results:</b>
 * <p>Order for my computer
 * <p>Component: My computer
 * <p>Component: Logitech ConcreteDecorator1 K200
 * <p>Component: SteelSeries Sensei MLG 62153 Black
 * <p>Component: Toshiba STOR.E 1TB
 * <p>Component: Toshiba STOR.E 1TB
 * <p>Total cost: 50270.0
 */
public class DecoratorMain {

    //Point of entering to show Decorator
    public void show() {
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

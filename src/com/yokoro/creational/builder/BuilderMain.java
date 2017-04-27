package com.yokoro.creational.builder;


/**
 * Строитель<p>
 * <img  src="../../images/builder.jpg" alt="">
 * <p>
 * У нас есть какая-то Деталь, которая состоит из частей. Деталь имеет методы СобратьПервуюЧасть(Параметр1 параметр),
 * собратьВторуюЧасть(Параметр2 параметр) и т.д.
 * <p>
 * Этот паттерн позволяет сделать Абстрактного Билдера Детали с методами сделатьПервуюЧасть(), СделатьВторуюЧасть() и т.п.
 * Далее реализовать этот абстрактный билдер и переопределить методы по умолчанию, Например
 * БилдерКраснойДетали будет иметь методы сделатьПервуюЧасть(), а внутри он будет вызывать методы Деталь деталь.собратьПервуюЧасть(красныйЦвет)
 * <p>На каждом этапе построения методы "сделать" возвращают экземпляр билдера (this) что бы можно было по цепочке вызывать:
 * Деталь деталь = БилдерКраснойДетали.билд().сделатьПервуюЧасть().сделатьВторуюЧасть(). и так далее
 * <p>Пример в коде не самый ороший, его стоит переделать
 */
public class BuilderMain {

    public void show() {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
}
    class Pizza {
        private String dough = "";
        private String sauce = "";
        private String topping = "";

        public void setDough(String dough)     { this.dough = dough; }
        public void setSauce(String sauce)     { this.sauce = sauce; }
        public void setTopping(String topping) { this.topping = topping; }
    }


    /** Абстрактный билдер */
    abstract class PizzaBuilder {
        protected Pizza pizza;

        public Pizza getPizza() { return pizza; }
        public void createNewPizzaProduct() { pizza = new Pizza(); }

        public abstract void buildDough();
        public abstract void buildSauce();
        public abstract void buildTopping();
    }

    /** "ConcreteBuilder" */
    class HawaiianPizzaBuilder extends PizzaBuilder {
        public void buildDough()   { pizza.setDough("cross"); }
        public void buildSauce()   { pizza.setSauce("mild"); }
        public void buildTopping() { pizza.setTopping("ham+pineapple"); }
    }

    /** "ConcreteBuilder" */
    class SpicyPizzaBuilder extends PizzaBuilder {
        public void buildDough()   { pizza.setDough("pan baked"); }
        public void buildSauce()   { pizza.setSauce("hot"); }
        public void buildTopping() { pizza.setTopping("pepperoni+salami"); }
    }


    /** "Получатель результата " */
    class Waiter {
        private PizzaBuilder pizzaBuilder;

        public void setPizzaBuilder(PizzaBuilder pb) { pizzaBuilder = pb; }
        public Pizza getPizza() { return pizzaBuilder.getPizza(); }

        public void constructPizza() {
            pizzaBuilder.createNewPizzaProduct();
            pizzaBuilder.buildDough();
            pizzaBuilder.buildSauce();
            pizzaBuilder.buildTopping();
        }
    }




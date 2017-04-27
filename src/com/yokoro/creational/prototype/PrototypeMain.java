package com.yokoro.creational.prototype;


/**
 * Прототип
 * <img  src="../../images/prototype.jpg" alt="">
 * <p>
 *  В Java есть такой паттерн по умолчанию - Cloneable
 *  Мораль в том, что мы используем Прототип и вызываем у него метод clone
 *  Это помогает нам не создавать класс с помощью new или не создавать
 *  сложный класс с нуля с миллионом параметрами и состояниями.
 */
public class PrototypeMain {

    public void show(){
        ComplicatedObject prototype = new ComplicatedObject(5, 7);
        Copyable clone = prototype.copy();
    }
}

interface Copyable {
    Copyable copy();
}

 class ComplicatedObject implements Copyable {
    int i;
    int j;

    public ComplicatedObject(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public Copyable copy() {
        //на самом деле тут во имя лени сделано через new, но лучше не так делать, а через клонейбл
        return new ComplicatedObject(this.i, this.j);
    }
}


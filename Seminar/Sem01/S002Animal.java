/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

00:41:00

Абстракция

 */
package OOP.Seminar.Sem01;

public abstract class S002Animal {
    String test;
    public static void sayHello(){
        System.out.println("sayHello");
    }
    public abstract void voice();
}

/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

00:14:30

Инкапсуляция

 */

package OOP.Seminar.Sem01;

public class S002Main {
    static S002Cat cat = new S002Cat();
    public static void main(String[] args) {
        cat.setName("boris");
        cat.setAge(5);
        System.out.println(cat);
        badMethod();
        RussianGreyCat russianGreyCat = new RussianGreyCat();
        russianGreyCat.voice();
        Animal.sayHello();

    }



    public static void badMethod(){
        cat.setName("murzik");


        System.out.println(cat);

    }
}

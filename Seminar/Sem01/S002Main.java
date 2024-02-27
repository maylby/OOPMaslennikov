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
        // RussianGreyCat russianGreyCat = new RussianGreyCat();
        // russianGreyCat.voice();
        // Animal.sayHello();

    }



    public static void badMethod(){
        cat.setName("murka"); // исправление "boris" на "murzik"
                                    // выдаёт:
                                    // Cat{name='boris', age=5}
                                    // bad name! // запрет на исправление
                                    // Cat{name='boris', age=5}

        System.out.println(cat); // исправил "murzik" на "murka" 
                                 // выдача:
                                 // Cat{name='boris', age=5}
                                 // Cat{name='murka', age=5}
                                 // Можно изменить имя 
                                 // на любое, кроме "murzik"
    }
}

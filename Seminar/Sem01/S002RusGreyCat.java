/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

00:31:00

Наследование (Класс "RusGreyCat")

 */
package OOP.Seminar.Sem01;

/*
 * "S002RusGreyCat" - класс наследник
 * "S002Cat" - класс родитель (наследуемый)
 * Класс наследник может наследовать, только один класс
 * Но родительский класс может иметь 
 * неограниченное число наследников (полиморфизм)
 */
public class S002RusGreyCat extends S002Animal {
    @Override
    public void voice() {
        System.out.println("meow");

    }
}

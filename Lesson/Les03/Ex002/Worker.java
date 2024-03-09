/*
Объектно-ориентированное программирование (лекции)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414491

 */

package OOP.Lesson.Les03.Ex002;

import java.util.Iterator;

/*
 * Реализация (implements) в "Worker" интерфейса "Iterator"
 */
public class Worker implements Iterator<String> {  /* Если реализовать итератор, 
                                                    * как <Object>, вместо <String>, то
                                                    * выводить "next" можно в простом виде,
                                                    * ввиде голого значения,
                                                    * при реализации "String"
                                                    * вывод можно сделать более красивым 
                                                    * и понятным пользователю:
                                                    * <имя переменной>: <значение>
                                                    */
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.index = 0;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 4; // "4" - количество строк
                            // когда число перебраных строк будет равно 4, 
                            // выполнение метода "hasNext" завершится
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                //return firstName;
                return String.format("firstName: %s", firstName);
            case 2:
                //return lastName;
                return String.format("lastName: %s", lastName);
            case 3:
                //return age;
                return String.format("age: %d", age);
            default:
                //return salary;
                return String.format("salary: %d", salary);
        }
    }
}

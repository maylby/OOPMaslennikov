/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

00:14:30

Инкапсуляция

 */
package OOP.Seminar.Sem01;

public class S002Cat {
    String name;
    int age;

    /*
     * 00:29:00
     * 
     * код метода "meow()" записан с экрана, 
     * этого кода не было в репозитории GitHub 
     * https://github.com/besSmertniyKoder/untitled
     * 
     * код показан на занятии для демонстрации того, что
     * переменная, которая определена в одном методе, 
     * не может быть вызвана в другом методе,
     * переменная вызывается, только вызовом метода целиком, 
     * тоже относится к циклам,
     * если переменная определена в цикле, то
     * вызвать её вне цикла нельзя
     * (пример инкапсуляции)
     */
    public void meow() { // сохранил данную запись для примера
        String meow = "meow";
        System.out.println(meow);
    }

    public void purr(){
        System.out.println("purring");
    }


    public String getName() {
        return name;
    }

    /*
     * запрет на использование имени "murzik"
     */
    public void setName(String name) {
        if (name.equals("murzik")){
            System.out.println("bad name!"); // выдача строки запрета
        }else {
            this.name = name; // разрешено любое имя, кроме "murzik"
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

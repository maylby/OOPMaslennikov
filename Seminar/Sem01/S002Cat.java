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

    public void purr(){
        System.out.println("purring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("murzik")){
            System.out.println("bad name!");
        }else {
            this.name = name;
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

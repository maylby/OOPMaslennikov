/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

00:41:00
Генадий Ионов

 */
package OOP.Seminar.Sem06.Task01;

/*
 * Класс "Employe" (Сотрудник)
 * (получение набора данных о сотрудниках)
 */
public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }    

}

/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

Роман Сухачев 

В этом примере класс Employee нарушает SRP, так как он содержит методы 
как для вычисления заработной платы, так и для сохранения данных в базу данных. 
Это делает класс менее поддерживаемым и усложняет его изменение.
*/
package OOP.Seminar.Sem06.Task;

/*
 * В классе "Employee" прописать
 * сеттеры и геттеры для "name" и "salary" и
 * конструктор, описывающий логику работы с данными, а также
 * переопределить метод вывода данных.
 */
public class Employee { 
    private String name;
    private double salary;

    public void calculateSalary() { // метод подсчёта зарплаты нужно вынести
                                    // в отдельный класс "Salary"
        // Подсчет заработной платы
    }

    public void saveEmployee() { // Сотрудников "Employee" следует поместить в список,
                                 // создав отдельный класс "ListEmployee", 

        // Сохранение данных сотрудника в базу данных
    } 
}

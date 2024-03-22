/*
Объектно-ориентированное программирование (семинары)
Урок 5. От простого к практике
https://gb.ru/lessons/414500/homework

 */
package OOP.Seminar.Sem05.Task01.View;

import OOP.Homework.Home05.Service.DataService;
import OOP.Homework.Home05.Data.Student;
import OOP.Homework.Home05.Data.User;

/**
 * Сделать package View
 * Написать View, где будет метод вывода в консоль 
 * данных студента, поданных на вход.
 */
public class DataView {
    private DataService DataService;

    public DataView() {
        this.DataService = new DataService();
    }
    public void addUser(User student){
        DataService.addUser(student);

    }

    public void showUser() {
       DataService.seeUser();
    }

    @Override
    public String toString() {
        return "DataView {" +
                "DataService = " + DataService +
                '}';

    }
}

package OOP.Seminar.Sem06.Task02;

import OOP.Seminar.Sem06.Task01.Employee;
// import OOP.Seminar.Sem06.Task01.ListEmployee;

public class SaveData {
    Employee worker;
    int id;

    public void saveData(int id, String name, double salary) {
        // сохранение данных сотрудника в базу данных 
        worker.getName();
        worker.getSalary();
        id++;
    }
}

class SaveData2<T> {
    T data;

    public void saveData(T data) {
        // сохранение данных сотрудника в базу данных
    }
}
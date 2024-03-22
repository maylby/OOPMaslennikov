/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

 */
package OOP.Seminar.Sem06.Task04;

interface Work {
    void work();
}
    
interface Eat {
    void eat();
}
    
class Worker {
    public void work() {
    // Реализация работы инженера
    }
    
    public void eat() {
    // Реализация приема пищи
    }
    
}
    
class Engineer extends Worker {
    
}

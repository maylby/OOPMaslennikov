/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

 */
package OOP.Seminar.Sem06.Task;

public class LightBulb {
    public void turnOn() {
        // Включение лампочки
    }
    
    public void turnOff() {
        // Выключение лампочки
    }
    }
    
class Switch {
    private LightBulb bulb;
    
    public Switch() {
        this.bulb = new LightBulb();
    }
    
    public void operate() {
        // Работа с выключателем
        bulb.turnOn();
    }
}

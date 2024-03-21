/*
Объектно-ориентированное программирование (лекции)
Урок 6. SOLID
https://gb.ru/lessons/414494

 */
package OOP.Lesson.Les06;

// Open-closed principle
// Принцип открытости/закрытости
// Можно улучшать, но нельзя изменять
public class Ex002_1OCP {
    public static void main(String[] args) {
        System.out.println(new Client(1).getDiscount(100));
    }
}

class Client {
    public int clientType;

    public Client(int type) {
        clientType = type;
    }

    public double getDiscount(double price) {
        return (clientType == 1) ? price *0.85 : price *0.95;
    }
}

// Больше клиентов = больше if'ов


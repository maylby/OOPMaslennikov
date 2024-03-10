/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497

00:41:00

Задание 1

Необходимо реализовать:

1. Интерфейс ActorBehavoir, который будет содержать 
   описание возможных действий актора в очереди/магазине
2. Абстрактный класс Actor, который хранит в себе параметры актора, 
   включая состояние готовности сделать заказ и факт получения заказа. 
   Дополнение: 
   для большего понимания, можно сделать методы-геттеры 
   для имени и прочих “персональных данных” abstract
3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir


<<interface>>
ActorBehaviour

void: setMakeOrder
void: setTakeOrder
boolean: isMakeOrder
boolean: isTakeOrder


<<abstract class>>
Actor (implements ActorBehaviour)

protected String: name
protected boolean: isMakeOrder
protected boolean: isTakeOrder

abstract String: getName()


<<class>>
Human (extends Actor)


00:43:00

Решение
(Alexey Logachev)

*/

package OOP.Seminar.Sem02.Ex02;

public class ActAll {
    
}

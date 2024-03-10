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
interface ActorBehaviour {

	void setMakeOrder();
	void setTakeOrder();

	boolean isMakeOrder();
	boolean isTakeOrder();
}
Решение
(Alexey Logachev)

Весь код папки "Ex02" в одном файле "ActAll"
*/
package OOP.Seminar.Sem02.Ex02;

import java.util.List;
/*
 * "ActAll" -  переименованный класс "Actor"
 */
public abstract class ActAll implements ActorBehaviour {

	protected String name;
	protected boolean isMakeOrder;
	protected boolean isTakeOrder;

	public abstract String getName();
}


interface ActorBehaviour {

	void setMakeOrder();
	void setTakeOrder();

	boolean isMakeOrder();
	boolean isTakeOrder();
}


interface QueueBehaviour {

	void acceptToMarket(Actor actor);
	void releaseFromMarket(List<Actor> actors);
	void update(); // вызывает методы accept и release

}


interface MarketBehaviour {

	void takeInQueue(Actor actor);
	void takeOrders();
	void giveOrders();
	void releaseFromQueue();
}

/*
 * Класс "Human" (человек) 
 * наследует (extends) абстрактный класс "Actor" (деятель)
 */
class Human extends Actor {

    @Override
	public String getName() {
		return name;
	}

	@Override
	public void setMakeOrder() {
		isMakeOrder = true;
	}

	@Override
	public void setTakeOrder() {
		isTakeOrder = true;
	}

	@Override
	public boolean isMakeOrder() {
		return isMakeOrder;
	}

	@Override
	public boolean isTakeOrder() {
		return isTakeOrder;
	} 
}

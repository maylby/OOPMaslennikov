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
package OOP.Seminar.Sem02.Ex03;

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

	void acceptToMarket(ActAll actor);
	void releaseFromMarket(List<ActAll> actors);
	void update(); // вызывает методы accept и release

}


interface MarketBehaviour {

	void takeInQueue(ActAll actor);
	void takeOrders();
	void giveOrders();
	void releaseFromQueue();
}

/*
 * Класс "Human" (человек) 
 * наследует (extends) абстрактный класс "Actor" (деятель)
 */
class Human extends ActAll {

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



class Market implements MarketBehaviour, QueueBehaviour {

	
	@Override
	public void takeInQueue(ActAll actor) {
		// return null;
	}

	@Override
	public void takeOrders() {
		// return null;
	}

	@Override
	public void giveOrders() {
		// giveOrders = true;
	}

	@Override
	public void releaseFromQueue() {
		// releaseFromQueue = true;
	}

	@Override
	public void acceptToMarket(ActAll actor) {
		// acceptToMarket(Actor actor) = true;
	}

	@Override
	public void releaseFromMarket(List<Actor> actors) {
		// releaseFromMarket(List<Actor> actors) = true;
	}

	@Override
	public void update() {
		// void update = true;
	}
}

/*
Домашнее задание 2

 * Рекомендации по выполнению ДЗ
 *
 * "QueueBehaviour" - это очередь
 * прописать поля ArrayList (реализация класса "Market" (?))
 * в "Market" взаимодействовать с полями

Реализовать класс Market и все методы, которые он обязан реализовывать. 
Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
MarketBehaviour – помещает и удаляет человека из очереди, 
метод update – обновляет состояние магазина (принимает и отдает заказы)


<<class>>
Market

void: acceptToMarket 
void: acceptToMarket 
void: acceptToMarket

 */
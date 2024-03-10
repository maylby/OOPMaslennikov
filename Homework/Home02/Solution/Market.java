/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497/homework

Домашнее задание (ДЗ-2)

Реализовать класс Market и все методы, которые он обязан реализовывать. 
Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
MarketBehaviour – помещает и удаляет человека из очереди, 
метод update – обновляет состояние магазина (принимает и отдает заказы)


<<class>>
Market

void: acceptToMarket 
void: acceptToMarket 
void: acceptToMarket


Реализация (класс "Market")

 * "QueueBehaviour" - алгоритм очереди
 * ("queue" - поле очереди)
 * "MarketBehaviour" - магазин, алгоритм поведения
 * ("market" - поле магазина)
 * прописать поля в ArrayList 
 * "Market" взаимодействует с полями
 */

package OOP.Homework.Home02.Solution;

import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque; 

/**
 * Класс "Market" реализует 
 * интерфейсы "MarketBehaviour" и "QueueBehaviour" 
 * и хранит список людей в очереди в различных статусах
 */
public class Market implements MarketBehaviour, QueueBehaviour {
    ArrayDeque<Actor> queue; // очередь
    ArrayList<Actor> market; // магазин

	// Реализация интерфейса "MarketBehaviour" (3 метода ниже)

	/**
	 * "acceptToMarket" - вход в магазин
	 */
	@Override
	public void acceptToMarket(Actor actor) {
		market.add(actor);
	}

	/**
	 * "releaseFromMarket" - выход из магазина
	 */
	@Override
	public void releaseFromMarket(List<Actor> actors) {
		market.removeAll(actors);
	}

	/**
	 * "update" - обновление информации о заказах
	 */
	@Override
	public void update() { 
		takeOrders(); // принятые заказы
        giveOrders(); // отданные заказы
	}


		// Реализация интерфейса "QueueBehaviour" (4 метода ниже)

	/**
	 * "takeInQueue" ставит в очередь
	 */
	@Override
	public void takeInQueue(Actor actor) {
		queue.add(actor); // добавить в очередь        
	}

	/**
	 * "takeOrders" принимает заказы
	 */
	@Override
	public void takeOrders() {
		Human human = (Human) queue.peek(); // проверка очереди
        if (human != null) { 
			human.setTakeOrder(); // внести заказ в список
        }
	}

	/**
	 * "giveOrders" отдаёт заказы
	 */
	@Override
	public void giveOrders() {
        Human human = (Human) queue.peek(); // проверка очереди
        if (human != null) { 
            human.setMakeOrder(); // отдать заказ из списка
        }
	}

	/**
	 * "releaseFromQueue" выпускает из очереди
	 */
	@Override
	public void releaseFromQueue() {
        queue.poll();
	}
}


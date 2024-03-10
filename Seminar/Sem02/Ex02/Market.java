/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497


01:04:00

Задание 2

Необходимо реализовать строение классов, без
конкретной реализации:

1. Интерфейс QueueBehaviour, который описывает
   логику очереди – помещение в/освобождение из
   очереди, принятие/отдача заказа

2. Интерфейс MarketBehaviour, который описывает
   логику магазина – приход/уход покупателей,
   обновление состояния магазина

3. Класс Market, который реализовывает два
   вышеуказанных интерфейса и хранит в списке
   список людей в очереди в различных статусах

 */

package OOP.Seminar.Sem02.Ex02;

import java.util.List;

/*
 * Класс Market, который реализует два
 * вышеуказанных интерфейса и хранит
 * список людей в очереди в различных статусах
 */
public class Market implements QueueBehaviour, MarketBehaviour {

	
	@Override
	public void takeInQueue(Actor actor) {
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
	public void acceptToMarket(Actor actor) {
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


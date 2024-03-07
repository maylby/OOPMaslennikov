/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497

*/

package OOP.Seminar.Sem02.Ex02;

import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

	
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

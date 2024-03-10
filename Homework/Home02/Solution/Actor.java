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


P.S.
Рекомендации по выполнению ДЗ:

   * Реализация - класс "Market"
   * "QueueBehaviour" - это очередь (алгоритм очереди)
   * ("queue" - поле очереди)
   * "MarketBehaviour" - это магазин (алгоритм поведения)
   * ("market" - поле магазина)
   * прописать поля в ArrayList 
   * "Market" - взаимодействие с полями

 */

package OOP.Homework.Home02.Solution;

public abstract class Actor implements ActorBehaviour {

	protected String name;
	protected boolean isMakeOrder;
	protected boolean isTakeOrder;

	public abstract String getName();
}


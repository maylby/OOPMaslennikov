/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497

*/

package OOP.Seminar.Sem02.Ex02;

interface QueueBehaviour {

	void takeInQueue(Actor actor);
	void takeOrders();
	void giveOrders();
	void releaseFromQueue();
}

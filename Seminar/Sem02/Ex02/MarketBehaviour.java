/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497

*/

package OOP.Seminar.Sem02.Ex03;

interface QueueBehaviour {

	void acceptToMarket(Actor actor);
	void releaseFromMarket(List<Actor> actors);
	void update(); // вызывает методы accept и release

}

package OOP.Seminar.Sem06.Task;

/*
В данном случае, нарушается принцип LSP 
(Liskov’s Substitution Principle - Принцип подстановки Барбары Лисков), 
так как наследующий класс Ostrich изменяет ожидаемое поведение 
метода fly() базового класса Bird.

 */
public class Bird {
	public void fly() {
		// Реализация полета птицы
	}
}

class Ostrich extends Bird {
	public void fly() {
	throw new UnsupportedOperationException("Страус не умеет летать");
	}
}

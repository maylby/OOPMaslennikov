/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

01:10:00
Liskov’s Substitution Principle (Принцип подстановки Барбары Лисков)
 */
package OOP.Seminar.Sem06.Task03;

/*
 * В данном случае, нарушается принцип LSP, 
 * так как наследующий класс Ostrich изменяет ожидаемое поведение 
 * метода fly() базового класса Bird.
 */
public class Bird {
	public void fly() {
		// Реализация полета птицы
	}
}

/*
 * Из тела файла удалена закомиченная часть кода, т.к.
 * метод "fly" прописан в классе "Bird", 
 * который наследует "Ostrich"
 */
class Ostrich extends Bird {
	// public void fly() {
	//     throw new UnsupportedOperationException("Страус не умеет летать");
	// }
}
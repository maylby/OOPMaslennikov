/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

 */
package OOP.Seminar.Sem06.Task02;

public class Rectangle {
	public double width;
	public double height;
}

class AreaCalculator {
	public double calculateArea(Rectangle rectangle) {
	return rectangle.width * rectangle.height;
	}
}
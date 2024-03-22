/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

 */
package OOP.Seminar.Sem06.Task02;

public class Rectangle implements AreaCalculator {
	public double width;
	public double height;

	@Override
	public double calculateArea() {
		return width * height;
	}
}

interface AreaCalculator {
    public double calculateArea();
} 
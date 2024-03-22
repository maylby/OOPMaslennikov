/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

00:59:30
Роман Сухачев 

 */
package OOP.Seminar.Sem06.Task02;

/*
 * В этом примере, чтобы добавить поддержку других фигур, 
 * придется изменять класс AreaCalculator. Это нарушает OCP, 
 * так как класс не открыт для расширения и закрыт для изменения.
 */
public class Rectangle {
    public double width;
	public double height;
}

class AreaCalculator {
	public double calculateArea(Rectangle rectangle) {
	    return rectangle.width * rectangle.height;
	}
}

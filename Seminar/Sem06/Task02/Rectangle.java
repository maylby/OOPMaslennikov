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
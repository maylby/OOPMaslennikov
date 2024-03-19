/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

 */
package OOP.Lesson.Les05.Ex003.Mathematics.Shapes;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public static Rectangle create(double width, double height, String name) {
        // ???...
        var instance = new Rectangle();
        instance.name = name;

        instance.width = width;
        instance.height = height;
        return instance;
    }

    private Rectangle() {
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        // ???...
        return String.format("Name: %s  width: %d  height: %d", name, width, height);
    }
}


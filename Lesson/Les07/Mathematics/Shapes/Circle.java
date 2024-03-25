/*
Объектно-ориентированное программирование (лекции)
Урок 7. Есть ли жизнь без Java?
https://gb.ru/lessons/414495

 */
package OOP.Lesson.Les07.Mathematics.Shapes;

import OOP.Lesson.Les05.Ex003.Mathematics.Exceptions.UnacceptableValueException;

public class Circle extends Shape {
    
    public static Circle create(double radius, String name) throws UnacceptableValueException {
        // ???...
        if (radius < 0)
            throw new UnacceptableValueException("radius < 0");

        var instance = new Circle();
        instance.name = name;
        instance.radius = radius;
        return instance;
    }

    public double radius;

    private Circle() {
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    // @Override
    // public String toString() {
    // // ???...
    // return String.format("Name: %s radius: %s", name, radius);
    // }

}


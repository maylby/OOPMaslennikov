/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

 */
package OOP.Lesson.Les05.Ex003.Mathematics.CalculateArea;

import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Shape;

public class CalculateArea implements Calculate {

    private static CalculateArea instance;
    // static {
    // instance = new CalculateArea();
    // }

    public static CalculateArea getInstance() {
        if (instance == null)
            instance = new CalculateArea();
        return instance;
    }

    private CalculateArea() {
    }

    /**
     * RefInt
     */
    private class RefInt {
        public double value;

        public RefInt(double ident) {
            value = ident;
        }
    }

    /*
     * Метод (calculate) вычисления площади
     */
    private void calculate(Shape shape, RefInt ref) {
        ref.value += shape.getArea();

        for (Shape item : shape.shapes) {
            calculate(item, ref);
        }

    }

    /*
     * Метод, проходящий по всем фигурам
     * и описывающий (считающий?) их
     * (подсчёт в методе "calculate" /см. выше/)
     */
    public double visit(Shape shape) {
        RefInt area = new RefInt(0);

        calculate(shape, area);

        return area.value;
    }

}

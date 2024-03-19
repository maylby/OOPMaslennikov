/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

 */
package OOP.Lesson.Les05.Ex003.Mathematics.CalculateArea;

import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Shape;

/*
 * Интерфейс "Calculate", содержащий 
 * один метод (visit), который принимает фигуру
 */
public interface Calculate {
    double visit(Shape shape);
}

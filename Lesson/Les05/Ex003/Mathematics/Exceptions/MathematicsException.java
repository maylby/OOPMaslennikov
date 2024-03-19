/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

 */
package OOP.Lesson.Les05.Ex003.Mathematics.Exceptions;

public class MathematicsException extends Exception {
    public MathematicsException(String msg) {
        super(msg);
    }
}
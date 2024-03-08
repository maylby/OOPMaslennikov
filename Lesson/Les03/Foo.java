/*
Объектно-ориентированное программирование (лекции)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414491

Некоторые стандартные интерфейсы

На занятии:

1. Введение
2. Iterator<E>
3. Iterable<E>
4. Comparator<E>
5. Comparable<E>
6. Comparable, equals, ==
7. foreach для своих типов
8. Примеры
9. Итоги


Введение

Некоторые стандартные интерфейсы и придание 
нового поведения своим типам.


00:03:00

 */
package OOP.Lesson.Les03;

public abstract class Foo {
	public abstract void m1();
	public abstract void m2();

}


class Program {
	public static void main(String[] args) {
		Foo foo1 = new Foo() {
			@Override
			public void m1() {
				System.out.print(">>>m1");
			}

			@Override
			public void m2() {
				System.out.print("m2");
			}	
		}; // зачем точка с запятой после фигурной скобки?

		// foo1.m1(); // переменная foo1 вызывает метод m1 с заданным поведением "m1"
		foo1.m1(); // замена переменной на foo2 и вызов, того же метода (m1)
			   // после смены его поведения с (m1) на (>>>m1)
	}
}
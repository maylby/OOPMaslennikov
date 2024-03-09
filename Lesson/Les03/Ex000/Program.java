/*
Объектно-ориентированное программирование (лекции)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414491

 */
package OOP.Lesson.Les03.Ex000;

public class Program {
    public static void main(String[] args) {
		Foo foo1 = new Foo() {
			@Override
			public void m1() {
				System.out.print("m1");
			}

			@Override
			public void m2() {
				System.out.print("m2");		
			}	
		}; // зачем точка с запятой после фигурной скобки?

		foo1.m1(); // переменная foo1 вызывает метод m1 с заданным поведением "m1"
		
		/*
		 * Дубль верхней записи "@Override"
		 * смена пременной "foo1" на "foo2"
		 * изменение поведения с "m1" на ">>>m1"
		 */
		Foo foo2 = new Foo() {
			@Override
			public void m1() {
				System.out.print(">>>m1");
			}

			@Override
			public void m2() {
				System.out.print(">>>m2");
			}	
		}; 
		foo2.m1(); // замена переменной на foo2 и вызов, того же метода (m1)
			   // после смены его поведения с (m1) на (>>>m1)
	}
}

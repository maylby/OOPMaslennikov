/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 
https://gb.ru/lessons/414497

*/

package OOP.Seminar.Sem02.Ex01;

/*
 * Класс "Cat" 
 * наследует абстрактный класс "Animal",
 * в котором размещён не реализованный метод "voice",
 * и мплеминтирует интерфейс "Feeding", где
 * размещён не реализованный метод "feed",
 * методы следует реализовать, т.к. они не реализуется по умолчанию.
 */
public class Cat extends Animal implements Feeding {
    
    /*
     * Переопределяем (@Override) метод "voice"
     * задаём значение, указывая конкретный голос
     */
    @Override  // аноация "@Override" - косметическая (заголовок)
               // без неё реализация метода тоже будет работать,
               // но всё же лучше её не удалять для удобства чтения кода
	public void voice() {
		System.out.println("meow");
	}

    /*
     * Реализуем - имплементируем (implements) метод "feed"
     * задаём значение, указывая, что именно ест животное (Cat)
     */
    @Override
    public void feed() {
        System.out.println("feeding with whiskas");
    }
}

/*
00:39:00

Роман Сухачев 
Сылка на GitHub:
https://github.com/besSmertniyKoder/bstractions

 */

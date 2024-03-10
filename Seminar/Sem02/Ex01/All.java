/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 
https://gb.ru/lessons/414497

Весь код в одном файле (All)
*/
package OOP.Seminar.Sem02.Ex01;

/**
 * "All" - переименованный класс "Main"
 * Функции:
 * Создание новых переменных (cat, owl),
 * вызов методов, реализующих переменные
 */
public class All {
    public static void main(String[] args) {
		Cat cat = new Cat();
		Owl owl = new Owl();
		cat.voice();
		owl.voice();
        cat.feed();
        owl.feed();
    }
}


/**
* Абстрактный класс Animal), 
* связывает классы в структуру,
* требует обязательной реализации методов
*/
abstract class Animal {

    /*
     * Абстрактный метод "voice" (голос, вой)
     * позволяет не делать сразу реализации, чтобы
     * впоследствие использовать один метод 
     * для голосов нескольких разных животных
     */
    public abstract void voice();
}


/**
 * Интерфейс "Feeding" (кормление) 
 * создан для реализации различных методов, т.к.
 * их реализация неоднотипна, в каждом методе своя
 * ("interface" - обновлённая версия "abstract class" в Java)
 */
interface Feeding {
    void feed();
}


/**
 * Класс "Cat" (кошка)
 * наследует абстрактный класс "Animal", где
 * размещён не реализованный метод "voice",
 * имплеминтирует интерфейс "Feeding", где
 * размещён не реализованный метод "feed",
 * оба метода реализуются данным классом "Cat" для кошки.
 */
class Cat extends Animal implements Feeding {
    
    /*
     * Переопределение метода "voice"
     * задаётся значение (конкретный голос)
     */
    @Override  // анотация "@Override" косметическая (заголовок)
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
 * Класс "Owl" (сова)
 * наследует абстрактный класс "Animal",
 * имплеминтирует интерфейс "Feeding", где
 * размещён не реализованные метод "voice" и "feed", соответственно,
 * и реализованы данным классом "Owl" для совы, т.к. 
 * методы не реализуется по умолчанию.
 */
class Owl extends Animal implements Feeding {

    /*
     * Переопределяем (@Override) метод "voice"
     * задаём значение, указывая конкретный голос
     */
    @Override
	public void voice() {
		System.out.println("uhuu");
	}

    /*
     * Реализуем - имплементируем (implements) метод "feed"
     * задаём значение, указывая, что именно ест животное (Owl)
     */
    @Override
    public void feed() {
        System.out.println("catches mouse");
    } 
}

/*
00:39:00

Роман Сухачев 
Ссылка на репозиторий с кодом занятия на GitHub:
https://github.com/besSmertniyKoder/bstractions

 */
/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 
https://gb.ru/lessons/414497

*/

package OOP.Seminar.Sem02.Ex01;

public class Main {
    public static void main(String[] args) {
		Cat cat = new Cat();
		Owl owl = new Owl();
		cat.voice();
		owl.voice();
        cat.feed();
        owl.feed();
    }
}
/* вывод:
    meow
    uhuu
    feeding with whiskas
    catches mouse 
    */ 
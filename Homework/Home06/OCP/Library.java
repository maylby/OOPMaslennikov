/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework


Реализация OCP 
Принцип открытости/закрытости
*/
package OOP.Homework.Home06.OCP;

import java.util.ArrayList;
import java.util.List;

/*
* "Library" - библиотека
* метод добавления книг 
* метод выдачи библиотечных карточек
* метод вывода информации о всех выданных книгах 
* с их библиотечными карточками.
*/
public class Library<T, K, V> { // (?) Система сообщает: "Параметр типа T скрывает тип T"
                                // Что это значит? Какие действия от меня требуются?
    private List<Book<T>> books;
    private int cardCount;
    private List<LibraryCard<K, V>> libraryCards; 
    
    public Library() {
        books = new ArrayList<>();
        libraryCards = new ArrayList<>();
        cardCount = 0;
    }

    void addBook(Book<T> book) {
        books.add(book);
    }

    void createLibraryCard(LibraryCard<K, V> libraryCard) {
        libraryCards.add(libraryCard);
        cardCount++;
    }

    @Override
    public String toString() {
        return "list = " + "№" + cardCount + libraryCards;
    }

}
/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework
*/

package OOP.Homework.Home06.SRP;

import java.util.ArrayList;

/*
* "Library" - библиотека
* метод добавления книг 
* метод выдачи библиотечных карточек
* метод вывода информации о всех выданных книгах 
* с их библиотечными карточками.
*/
public class Library<T, K, V> {

    private Book<T> books;
    private int cardCount;
    private LibraryCard<K, V> orders; // Order

    public Library(Book<T> books, int cardCount, LibraryCard<K, V> orders) {
        this.books = books;
        this.cardCount = cardCount;
        this.orders = orders;
    }


    void addBook(Book<T> book) {
        books.add(book); // Метод add(Book<T>) не определен для типа Book<T>.
    }

    void createLibraryCard(LibraryCard<K, V> libraryCards) {
        libraryCards.add(libraryCards);
        cardCount++;
    }

    @Override
    public String toString() {
        return "list = " + "№" + cardCount + orders + books;
    }

}

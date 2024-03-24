/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework

Реализация SRP (Single Responsibility Principle - Принцип единственной ответственности)
 */
package OOP.Homework.Home06.SRP;

public class BookData extends Book { // Что значит "Неявный суперконструктор Book() 
                                     // не определен для конструктора по умолчанию. 
                                     // Необходимо определить явный конструктор"???
    BookData bookData;
    int id;

    public void bookData (int id, BookData bookData) {

        // сохранение данных о книге 
        bookData.getName(); // получить название книги
        bookData.getAutor(); // получить автора
        // bookData.getNumber(); // получить номер карточки
        id++;
    }
}

class BooksData<T> {
    T data;

    public void booksData(T data) {
        // сохранение данных о книге в базу данных
    }
}


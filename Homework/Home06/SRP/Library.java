/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework
*/

package OOP.Homework.Home06.SRP;

/*
* "Library" - библиотека
* метод добавления книг 
* метод выдачи библиотечных карточек
* метод вывода информации о всех выданных книгах 
* с их библиотечными карточками.
*/
public class Library<T, K, V> {

    private List<Book<T>> books;
    private int cardCount;
    private List<LibraryCard<K, V>> orders; // Order

    public OnlineStore() {
        books = new ArrayList<>();
        libraryCard = new ArrayList<>();
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

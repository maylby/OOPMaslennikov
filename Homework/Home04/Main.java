/*
Объектно-ориентированное программирование (семинары)
Урок 4. ООП: Обобщения. ч1
https://gb.ru/lessons/414499/homework

 */
package OOP.Homework.Home04;

/*
Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. 
Каждая книга должна содержать параметр типа T для ее названия.
Создайте обобщенный класс LibraryCard<K, V>, который представляет
библиотечную карточку для определенной книги.
 
Карточка должна содержать параметры типов K (номер карточки) и V (информация о книге).
Создайте класс Library, который будет представлять библиотеку. 
У этого класса должны быть методы добавления книг и выдачи библиотечных карточек.
Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.
*/
public class Main {
    public static void main(String[] args) {

    	Library<String, Integer, String> library = new Library<>(); // OnlineStore
								    // T, K, V
    	library.addProd(new Product<>("book", 1991)); // "shirt" (рубаха) - книга (?)
    	library.addProd(new Product<>("jornal", 2011)); // "dress" (платье) - журнал (?)
    	// System.out.println(library);

    	LibraryCard<Integer, String> card1 = new LibraryCard<Integer, String>(1111); // Order
   	LibraryCard<Integer, String> card2 = new LibraryCard<Integer, String>(1112); // № карточки?
    
    	card1.setListProd("book");
    	card2.setListProd("jornal");
    	library.createOrder(card1);
    	library.createOrder(card2);

    	System.out.println(library);
    }
}

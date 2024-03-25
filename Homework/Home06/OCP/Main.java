/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework


Реализация OCP 
Принцип открытости/закрытости

Код класса "Main" ставлен без изменений
(см. реализация OCP в классе Book)
*/
package OOP.Homework.Home06.OCP;


public class Main {
    public static void main(String[] args) {

    	Library<String, Integer, String> library = new Library<>(); 
        
    	library.addBook(new Book<>("book", "LastName", 1991)); 
    	library.addBook(new Book<>("journal", "Edition", 2011));
    	LibraryCard<Integer, String> card1 = new LibraryCard<Integer, String>(0021); 
   	    LibraryCard<Integer, String> card2 = new LibraryCard<Integer, String>(0012);
    
    	card1.setListBook("book");
    	card2.setListBook("journal");
    	library.createLibraryCard(card1);
    	library.createLibraryCard(card2);

    	System.out.println(library);
    }
}

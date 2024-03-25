/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework


Реализация ISP 
Принцип разделения интерфейса

Добавлен интерфейс "Article" (статья)
для поиска по текста статьи 
(подстановка в периодические издания)
Добавлен класс "Journal" (журнал)
Добавлен класс "Newspaper" (газета)
*/
package OOP.Homework.Home06.ISP;

/**
 * ArticleJournal
 */
interface ArticleJournal {
    void text();
}

/**
 * ArticleJournal
 */
interface ArticleNewspaper {
    void text();
}

/*
* Book - книгa в библиотеке
* параметр типа T - ее название
*/
public class Book<T> {
    private T name;
    private String autor;
    private Integer pages;
    
    public Book(T name, String autor, Integer pages) {
        this.name = name;
        this.autor = autor;
    }
    
    public T getName() {
        return name;
    }
    
    public String getAutor() {
        return autor;
    }

    public Integer getPages() {
        return pages;
    }
    
    @Override
    public String toString() {
        return String.format("Книга %s", name, pages);
    }
}

/*
 * класс "Newspaper" (газета)
 */
class Newspaper<T> extends Book<T> implements ArticleNewspaper {

    public Newspaper(T name, String autor, Integer pages) {
        super(name, autor, pages);
        
    }

    @Override
    public void text() {
        // метод поиска статьи в газете
        // отличается от поиска в журнале
        // нет оглавления (содержания)
    }
}


/*
 * класс "Journal" (журнал)
 * наследует класс
 */
class Journal<T> extends Book<T> implements ArticleJournal {

    public Journal(T name, String autor, Integer pages) {
        super(name, autor, pages);
        
    }

    @Override
    public void text() {
        // метод поиска статьи в журнале
        // отличается от поиска в газете
        // есть оглавление (содержания)
    }
}
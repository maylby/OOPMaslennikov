/*
Объектно-ориентированное программирование (семинары)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414498/homework

 */

package OOP.Homework.Home03;

import java.util.ArrayList;
 import java.util.Iterator;

public class Stream implements Iterable<Group>{
    private ArrayList<Group> groups;

    public Stream(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<Group> iterator() {
        return new StreamIterator(groups);
    }
}

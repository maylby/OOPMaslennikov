/*
Объектно-ориентированное программирование (семинары)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414498/homework

 */

package OOP.Homework.Home03;

import java.util.List;
 import java.util.Iterator;

public class Stream implements Iterator<Group>{
    public List<Group> groups;
    public String specialiation;
    public int number;
    

    public Stream(List<Group> groups) {
        this.groups = groups;
        this.index = 0; // "index" - то же, что "count"
                        // (см. файл "GroupIterator")
    }

    public String fullGroup() {
        return String.format("%s", groups);
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < groups.size(); // "size" - число групп,
                                        // возможно, нужно написать "length" (?)
    }
    
    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("gpoup: %s", specialiation);
            default:
                return String.format("number: %d", number);
        }
    }

    // public ArrayList<Group> getGroups() {
    //     return groups;
    // }

    // public void setGroups(ArrayList<Group> groups) {
    //     this.groups = groups;
    // }

    // @Override
    // public Iterator<Group> iterator() {
    //     return new StreamIterator(groups);
    // }
}

/*
Объектно-ориентированное программирование (семинары)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414498/homework

 */

package OOP.Homework.Home03;

import java.util.Comparator;

public class StreamComparator implements Comparator<Group> {
     @Override
     public int compare(Group g1, Group g2) {
         String s1 = g1.getSpecialization() + g1.getNumber();
         String s2 = g2.getSpecialization() + g1.getNumber();
         return s1.compareTo(s2);
     }
 }

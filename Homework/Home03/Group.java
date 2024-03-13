/*
Объектно-ориентированное программирование (семинары)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414498/homework

 */

 package OOP.Homework.Home03;

 import java.util.ArrayList;
 import java.util.Iterator;
 
 public class Group implements Iterable<Student>{
     private ArrayList<Student> students;
     private String specialization;
     private int number;
    
     public Group(String specialization, int number) {
        this.specialization = specialization;
        this.number = number;
     }
     
     public Group(ArrayList<Student> students) {
         this.students = students;
     }
 
     public ArrayList<Student> getStudents() {
         return students;
     }
 
     public void setStudents(ArrayList<Student> students) {
         this.students = students;
     }
 
     @Override
     public Iterator<Student> iterator() {
         return new GroupIterator(students);
     }


     public String getSpecialization() {
        return specialization;
    }
 
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getNumbern() {
        return number;
    }
 
    public void setNumbern(String number) {
        this.number = number;
    }

     @Override
     public String toString() {
         return "Group{" + "№: " + number +
                 ", specialization = '" + specialization + '\'' +
                 '}';
     }
  
     @Override
     public int compareTo(Group group) {
         return this.specialization.compareTo(group.specialization);
     }
 
    // @Override
    // public int compareTo(Group student) {
    //     return this.specialization.compareTo(student.specialization);
    // }
     
 }
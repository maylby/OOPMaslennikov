/*
Объектно-ориентированное программирование (лекции)
Урок 4. ООП: Обобщения
https://gb.ru/lessons/414492

00:14:00

"Воркер" (рабочий)
 */

 package OOP.Lesson.Less04.Ex002;

 public class Worker {
     private int id;
 
     public String firstName;
     public String lastName;
     public int age;
     public int salary;
 
     public Worker(int id, String firstName,
             String lastName,
             int age,
             int salary) {
 
         this.id = id;
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
         this.salary = salary;
         
     }
 
     public String fullName() {
         return String.format("%s %s", firstName, lastName);
     }
 }
 
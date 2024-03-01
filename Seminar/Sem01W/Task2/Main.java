/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

*/
package OOP.Seminar.Sem01W.Task2;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
        ArrayList<Product> prods = new ArrayList<>();
        prods.add(new Product("Хлеб", 40.0));
        prods.add(new Product("Молоко", 80.0));
        prods.add(new Product("Колбаса", 120.0));
        prods.add(new Product("Сыр", 150.0));
        
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.initProducts(prods);
        System.out.println(vendingMachine.getProduct("Сыр"));
    }
    
}

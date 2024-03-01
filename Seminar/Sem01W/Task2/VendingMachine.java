/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

*/
package OOP.Seminar.Sem01W.Task2;

import java.util.ArrayList;

public class VendingMachine {

        private ArrayList<Product> products;
    
    public void initProducts(ArrayList<Product> products){
        this.products = products;
    }
    
    public Product getProduct(String prodName){
        for (Product p : products) {
            if (p.getName().equals(prodName)){
                return p;
            }
        }
        return null;
    }
    
}

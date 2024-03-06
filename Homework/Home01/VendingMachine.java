/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496/homework

Домашнее задание 1

 */
package OOP.Homework.Home01;

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
            /*
             * Как добавить указание объёма (volume) 
             * для ввода заказа в "HotBrinksMachine",
             * не меняя название заказываемого продукта???
             */
            // if (p.getVolume().equals(volume)){
            //     return p;
            // }
        }
        return null;
    }
}

/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

*/
package OOP.Seminar.Sem01W.Task2;

import java.util.ArrayList;

public abstract class Product {

    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    // public Product() {

    // }

    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        this.name = name;
    }
        
    public double getCost() {
        return cost;
    }
        
    public void setCost(double cost) {
        this.cost = cost;
    }

    /*
     * Переопределение метода
     * для выдачи сведений о продукте
     * в понятной потребителю форме
     */
    @Override
    public String toString() {
        return "Product{" +
        "name: '" + name + '\'' +
        ", cost: " + cost +
        '}';
    }
    
}

/*
 * Класс "Наследников"
 * BottleWater
 */
class BottleWater extends Product {
    String name;
    double cost;

    public BottleWater(String name, double cost) {
        super(name, cost);
}
}

class Burger {
    public Burger() {
        super();
    }
}


class VendMach implements VendingMachine {
    private ArrayList<Product> bottleWaters;

    public void initProducts(ArrayList<Product> battleOfWaters) {
        this.bottleWaters = battleOfWaters;
    }

    @Override
    public Product getProduct(String prodName) {
        for (Product p : bottleWaters) {
            if (p.getName().equals(prodName)) {
            return p;
            }
        }
        return null;
    }
}

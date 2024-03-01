/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496


Задача 2 

Решение
(Александр Верзун)

*/
package OOP.Seminar.Sem01W.Task2;

import java.util.ArrayList;

/*
 * Сделать класс Товар абстрактным, 
 * создать нескольких наследников (к примеру: БутылкаВоды), 
 * сделать интерфейсом ТорговыйАвтомат 
 * и реализовать класс какого-то одного типа ТорговогоАвтомата 
 * (пример: ПродающийБутылкиВодыАвтомат
 * 
 * В интерфейсе только getProduct!
 */
public class All {
    
}
class Main {
    public static void main(String[] args) {
        ArrayList<Product> prods = new ArrayList<>();
        prods.add(new BottleWater("Вода", 40.0));
        prods.add(new BottleWater("Минералка", 60.0));
        prods.add(new BottleWater("Кола", 80.0));
        
        VendMach vendingMachine = new VendMach();
        vendingMachine.initProducts(prods);
        System.out.println(vendingMachine.getProduct("Минералка"));
    }
}

interface VendingMachine {
    
    Object getProduct(String prodName); // "public" - удалил перед "Product"
                                         // вместо скобок "{}", точка с запятой
        // {
        //     for (Product p : products) {
        //         if (p.getName().equals(prodName)){
        //             return p;
        //         }
        //     }
        //     return null;
        // }
}



abstract class Product {

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
 * BottleWater Класс "наследник"
 */
class BottleWater extends Product {
    String name;
    double cost;

    public BottleWater(String name, double cost) {
        super(name, cost);
    }
}

/*
 * Burger - Класс "наследник"
 * (неиспользован)
 */
class Burger {
    public Burger() {
        super();
    }
}


class VendMach implements VendingMachine {
    
    /*
     * Автомат по подаже бутилированной воды
     */
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

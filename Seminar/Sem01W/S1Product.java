/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

00:55:00

Задача 1

Решение
(Сергей Пономарев)
 */

package OOP.Seminar.Sem01W;
/*
* Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
* содержащий в себе методы initProducts (List <Product>)
* сохраняющий в себе список исходных продуктов и getProduct(String name) 
*/

import java.util.ArrayList;
import java.util.List;

public class S1Product {

    private String name;
    private double cost;

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
        
    public S1Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
}



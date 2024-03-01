package OOP.Seminar.Sem01W;

import java.util.ArrayList;

public class S1Main {

    public static void main(String[] args) {
        ArrayList<S1Product> prods = new ArrayList<>();
        prods.add(new S1Product("Хлеб", 40.0));
        prods.add(new S1Product("Молоко", 80.0));
        prods.add(new S1Product("Колбаса", 120.0));
        prods.add(new S1Product("Сыр", 150.0));
        
        S1VendingMachine vendingMachine = new S1VendingMachine();
        vendingMachine.initProducts(prods);
        System.out.println(vendingMachine.getProduct("Сыр"));
    }
}

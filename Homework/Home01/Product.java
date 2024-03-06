/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496/homework

Домашнее задание 1

 */
package OOP.Homework.Home01;

public class Product {

    private String name;
    private int volume;
    private int termo;

    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        this.name = name;
    }
        
    public double getVolume() {
        return volume;
    }
        
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTermo() {
        return termo;
    }
        
    public void setTermo(int termo) {
        this.termo = termo;
    }
        
    public Product(String name, int volume, int termo) {
        this.name = name;
        this.volume = volume;
        this.termo = termo;
    }
    
    /*
     * Переопределение метода
     * для выдачи сведений о продукте
     * в понятной потребителю форме
     */
    @Override
    public String toString() {
        return "Product{" +
        "name = '" + name + '\'' +
        ", volume: " + volume + 
        ", temperature: " + termo +
        '}';
    }
}

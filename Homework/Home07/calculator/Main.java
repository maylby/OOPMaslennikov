package OOP.Homework.Home07.calculator;

// Создать логирование операций, для класса Calculator. 
// Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICreateCalculation createCalculation = new CreateCalculation();
        ViewCalculator view = new ViewCalculator(createCalculation);
        view.run();
    }
}
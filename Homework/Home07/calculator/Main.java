package OOP.Homework.Home07.calculator;

public class Main {
    public static void main(String[] args) {
        ICreateCalculation createCalculation = new CreateCalculation();
        ViewCalculator view = new ViewCalculator(createCalculation);
        view.run();
    }
}
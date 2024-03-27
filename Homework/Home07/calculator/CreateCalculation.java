package OOP.Homework.Home07.calculator;

public class CreateCalculation implements ICreateCalculation {
    public Calculable create(int firstArg) {
        return new Calculator(firstArg);
    }
}


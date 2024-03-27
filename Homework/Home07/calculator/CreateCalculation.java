package OOP.Homework.Home07.calculator;

import OOP.Homework.Home07.calculator.Calculator;

public class CreateCalculation implements ICreateCalculation {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}


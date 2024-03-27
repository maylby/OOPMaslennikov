package OOP.Homework.Home07.calculator;

public final class Calculator implements Calculable {

    private int firstArg;

    public Calculator(int firstArg) {
        this.firstArg = firstArg;
    }

    @Override
    public Calculable sum(int arg) {
        firstArg += arg;
        return this;
    }

    @Override
    public Calculable mult(int arg) {
        firstArg *= arg;
        return this;
    }

    @Override
    public Calculable div(int arg) {
        firstArg /= arg;
        return this;
    }

    @Override
    public int getResult() {
        return firstArg;
    }
}


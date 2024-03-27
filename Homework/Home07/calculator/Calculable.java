package OOP.Homework.Home07.calculator;

interface Calculable {
    Calculable sum(int arg);
    Calculable mult(int arg);
    Calculable div(int arg);
    int getResult();
}

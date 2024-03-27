package OOP.Homework.Home07.calculator;

interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    // Calculable div(int arg); // как задать деление?
    int getResult();
}

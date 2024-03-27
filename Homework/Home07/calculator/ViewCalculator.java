package OOP.Homework.Home07.calculator;

import java.util.Scanner;

public class ViewCalculator {

    private ICreateCalculation createCalculation;

    public ViewCalculator(ICreateCalculation createCalculation) {
        this.createCalculation = createCalculation;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("1-й аргумент: ");
            Calculable calculator = createCalculation.create(primaryArg);
            while (true) {
                String cmd = prompt("Выбрать действие (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("2-й аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("2-й аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = promptInt("2-й аргумент: ");
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Продолжить? Да: Y / Нет: N");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}



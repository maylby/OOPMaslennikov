/*
Объектно-ориентированное программирование (семинары)
Урок 7. ООП Дизайн и Solid ч.2
https://gb.ru/lessons/414502/homework

Аттестационная работа

 */
package OOP.Homework.Home07.calculator;

import java.util.Scanner;

public class ViewCalculator {

    private ICreateCalculation createCalculation;

    public ViewCalculator(ICreateCalculation createCalculation) {
        this.createCalculation = createCalculation;
    }

    public void run() {
        while (true) {
            int firstArg = promptInt("1-й аргумент: ");
            Calculable calculator = createCalculation.create(firstArg);
            while (true) {
                String act = prompt("Действие (*, +, /, =) : ");
                if (act.equals("*")) {
                    int arg = promptInt("2-й аргумент: ");
                    calculator.mult(arg);
                    continue;
                }
                if (act.equals("+")) {
                    
                    int arg = promptInt("2-й аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (act.equals("/")) {
                    int arg = promptInt("2-й аргумент: ");
                    if (arg == 0) {
                        // throw new RuntimeException("Деление на ноль!");
                        
                        /*
                         * Обработка ошибки "Деление на ноль"
                         * Замена строки "throw"
                         */
                        Scanner sc = new Scanner(System.in); 
                        System.err.println("Делить на ноль нельзя!\n Ведите другой аргумент: ");
                    
                        int x = sc.nextInt();
                        while (x == 0) {
                            System.err.println("Делить на ноль нельзя!\n Ведите другой аргумент: ");
                            x = sc.nextInt();
                        }
                        calculator.div(x);
                        continue;
                    }
                    calculator.div(arg);
                    continue;
                }

                if (act.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }    
                String act = prompt("Продолжить? (да: Y / нет: N) ");
                if (act.equals("Y")) {
                    continue; // (?) не возвращает к дальнейшей работе
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



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
                        
                    //         /*
                    //          * Код "while" для обработки ошибки "Деление на ноль"
                    //          * 
                    //          * Система сообщает об ошибке: 
                    //          * "Сканер не может быть преобразован в тип"
                    //          * Разобраться, что не так!..
                    //          */
                    //         Scanner sc = new Scaner(Sistem.in); 
                    //         System.err.println("Делить на ноль нельзя, введите другой аргумент")
                    
                    //         int x = sc.nextInt();
                    //         while (x == 0) {
                    //             System.err.println("Делить на ноль нельзя, введите другой аргумент")
                    //             x = sc.nextInt();
                    //         }
                    //     }
                    // }
                        throw new RuntimeException("Деление на ноль!"); // сохранил "throw"
                    }
                    calculator.div(arg);
                    continue;  
                    
                    // continue;
                }
                if (act.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }    
                String act = prompt("Продолжить (Y/N)? ");
                if (act.equals("Y")) {
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



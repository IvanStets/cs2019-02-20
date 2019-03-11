package by.it.ivanstets.ivanstetsles4;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какую вы хотите зарплату в $$$?");
        double sum = sc.nextInt();
        double sum1 = sum + (sum * 0.5);
        double sum2 = sum;
        if (3000 < sum || sum < 300) {
            System.out.println("Мы вам перезвоним!");
        } else {
            dot:
            for (int month = 0; month <= 14; month++) {
                switch (month) {
                    case 0:
                        System.out.println("За месяц 0 начислено $0.0");
                        break;
                    case 1:
                        System.out.println("За январь начислено $" + sum1);
                        if (sum1 == 666) {
                            break dot;
                        }
                        break;
                    case 2:
                        System.out.println("За февраль начислено $" + sum1);
                        break;
                    case 3:
                        System.out.println("За март начислено $" + sum1);
                        break;
                    case 4:
                        System.out.println("За апрель начислено $" + sum1);
                        break;
                    case 5:
                        System.out.println("За май начислено $" + sum1);
                        break;
                    case 6:
                        System.out.println("За июнь начислено $" + sum2);
                        if (sum2 == 666) {
                            break dot;
                        }
                        break;
                    case 7:
                        System.out.println("За июль начислено $" + sum2);
                        break;
                    case 8:
                        System.out.println("За август начислено $" + sum2);
                        break;
                    case 9:
                        System.out.println("За сентябрь начислено $" + sum1);
                        break;
                    case 10:
                        System.out.println("За октябрь начислено $" + sum1);
                        break;
                    case 11:
                        System.out.println("За ноябрь начислено $" + sum1);
                        break;
                    case 12:
                        System.out.println("За декабрь начислено $" + sum1);
                        break;
                    case 13:
                        System.out.println("За месяц 13 начислено $0.0");
                        break;
                    case 14:
                        System.out.println("За месяц 14 начислено $0.0");
                        break;
                }
            }
        }
    }
}

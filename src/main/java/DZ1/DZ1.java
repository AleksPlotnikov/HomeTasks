package DZ1;

import java.util.Scanner;

public class DZ1 {
    public static int recursiveMethod(int a, int b) {
        if (b == 0)
            return a;
        else
            return recursiveMethod(b, a % b);
    }

        public static void main(String[] args) {
            int a,b, result;
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите первое число:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Введите данные используя целые числа. Повторите ввод!");
                        scanner.next();
                }
                a = scanner.nextInt();
                    System.out.println("введите второе число:");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Введите данные используя целые числа. Повторите ввод!");
                                scanner.next();
            }
                b = scanner.nextInt();
                    result = recursiveMethod(a,b);
                        System.out.print("Наибольший общий делитель: " + result);
        }
    }
/**
 * Created by Александр on 29.03.2017.
 */
import java.util.Scanner;

public class HomeWork_3 {

    private static Scanner sc = new Scanner(System.in);

    private static void HomeWork_3_1() {
        System.out.println("Введите отрезок и шаг:");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("h: ");
        double h = sc.nextDouble();

        for (double x = a; x <= b; x += h) {
            double fx1 = x - Math.sin(x);
            double fx2 = Math.pow(Math.sin(x), 2);
            double fx3 = (2 * Math.cos(x)) - 1;

            System.out.println(x + "\t\tа)" + fx1 + "\n\t\tб)" + fx2 + "\n\t\tв)" + fx3);
            System.out.println();
        }
    }

    private static void HomeWork_3_2(){
        int a = 3, b = -5;
        double result;

        for (double x = 1; x <= 5; x += 0.5) {
            result = (a * (x * x) + b);
            System.out.println("При х = " + x + ", у = " + result);
        }
    }

    private static void HomeWork_3_3() {
        System.out.print("Введите натуральное число: ");
        long number = sc.nextLong();

        System.out.println("\nТеперь введите цифры для проверки: ");

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        int a1 = 0, b1 = 0;
        long result = 0L;

        for(long x = number; x !=0; x /= 10){
            result = x%10;
            if (result == a) a1++;
            if (result == b) b1++;
        }
        System.out.println("Число 'a' встречаеться "+ a1 + "раз, а число 'b' встречаеться "+ b1 + "раз.");
        System.out.println(a1>b1 ? "a>b" : "a<b");
    }

    private static void HomeWork_3_4() {
        double result = 0, x = 0, fact = 1, k = 0;

        System.out.print("Введите значение конечной k: ");
        double kfinish = sc.nextInt();

        for (int i = 1; i <= 20; i++) {

            System.out.print("Введите значени Xi: ");
            x = sc.nextDouble();

            for (k = 1; k <= kfinish; k++) {

                for (int z = 1; z <= k; z++) {
                    fact *= z;
                }

                result = Math.pow(x, k) / fact;
                System.out.print(result + " \n");
            }
        }
    }

    private static void HomeWork_3_5() {
        System.out.println("Введите значие Xi: ");
        int xi = sc.nextInt();

        double result = 0, fact = 1;

        for(int i = 1; i <= 15; i++){

            for(int j = 1; j<=i; j++)
                fact *= j;

            result = (i + xi) / fact;
            System.out.println(result);
        }
    }

    private static void HomeWork_3_6() {
        System.out.println("Выберите значение K");
        int k = sc.nextInt();

        for (int x = 1; x <= 30; x++) {

            for (int y = 1; y <= 30; y++) {

                if (k * k == y * y + x * x)
                    System.out.println("Уравнение решаеться при x=" + x + ", y=" + y);
            }
        }
    }
    private static void HomeWork_3_7() {
        int x = 100;
        Enter:
        for (int a = 0; a < 15; a++) {

            for (int b = x; ; b++) {

                if (b % 19 == 0) {

                    x = b + 1;
                    System.out.println(b);

                    continue Enter;
                }
            }
        }
    }
    private static void HomeWork_3_8() {
        int x = 500;
        Enter:
        for (int a = 0; a < 15; a++) {

            for (int b = x; ; b++) {

                if (b % 13 == 0 || b % 17 == 0) {

                    x = b + 1;
                    System.out.println(b);

                    continue Enter;
                }
            }
        }
    }
    private static void HomeWork_3_9() {
        int a = 2, step = 4, sum = 0, metter = 0, last_number = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choice Z: ");
        int z = sc.nextInt();

        for (a = 2; sum < z; a += step) {
            metter++;
            sum += a;
            last_number = a;
        }
        System.out.println("Всего членов прогрессии: " + metter + "\nСумма членов прогресии: "
                + sum + "\nПоследнее слагаемое: " + last_number);
    }
    private static void HomeWork_3_10() {
        int number = 1, sum = 1;

        for(int i = 0; i<10; i++){
            System.out.println(number);
            number += 4;
            sum += number;
        }
        System.out.println(sum);
    }
    private static void HomeWork_3_11() {
        System.out.println("Выберите фигуру\n1)Прямоугольник\n2)Прямоугольны треугольник\n3)Равносторонний треугольник\n4)Ромб");
        int change = sc.nextInt();
        System.out.println("Выберите размер");
        int count = sc.nextInt();

        switch (change) {

            case 1:
                //прямоугольник
                for (int i = 0; i < 3; i++) {
                    System.out.println();
                    for (int j = 0; j < 10; j++) {
                        System.out.print("*");
                    }
                }
                break;

            case 2:
                // прямоугольны треугольник
                for (int i = 0; i < count; i++) {
                    for (int k = 0; k < i + 1; k++) {

                        if (k == 0 || k == i || i == count - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }

            case 3:
                //равносторонний треугольник
                for (int i = 0; i < count; i++) {
                    System.out.println();

                    for (int j = 0; j < i + count; j++) {

                        if (j == i + count - 1 || i == count - 1 || i + j == count - 1)
                            System.out.print("*");
                        else System.out.print(" ");
                    }
                }
                break;
            case 4:
                //ромб
                for (int i = 0; i < count; i++) {
                    System.out.println();

                    for (int j = 0; j < i + count; j++) {

                        if (j == i + count - 1 || i + j == count - 1)
                            System.out.print("*");
                        else System.out.print(" ");
                    }

                    if (i == count - 1) {
                        for (int m = count - 1; m >= 0; m--) {
                            if (m == count - 1) continue;
                            System.out.println();

                            for (int k = 0; k < m + count; k++) {

                                if (k == m + count - 1 || k + m == count - 1)
                                    System.out.print("*");
                                else System.out.print(" ");
                            }

                        }
                    }
                }
                break;
        }
    }

    public static void main(String args[]) {

        System.out.println("Выберите номер задания 1 - 11");
        int number = sc.nextInt();

        switch (number) {
            case 1 : HomeWork_3_1(); break;
            case 2 : HomeWork_3_2(); break;
            case 3 : HomeWork_3_3(); break;
            case 4 : HomeWork_3_4(); break;
            case 5 : HomeWork_3_5(); break;
            case 6 : HomeWork_3_6(); break;
            case 7 : HomeWork_3_7(); break;
            case 8 : HomeWork_3_8(); break;
            case 9 : HomeWork_3_9(); break;
            case 10 : HomeWork_3_10(); break;
            case 11 : HomeWork_3_11(); break;
        }
    }
}
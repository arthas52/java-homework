package semester1.practice06.homework;

import java.util.Locale;

public class Task1Fraction {

    public static void main(String[] args) {
        System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");

        Fraction fraction = new Fraction();
        fraction.setValues(8, 12);
        System.out.print("Дріб 1: ");
        fraction.printFraction();
        System.out.println();

        fraction.simplify();
        System.out.print("Після скорочення: ");
        fraction.printFraction();
        System.out.println(" (десятковий вигляд: " + format(fraction.toDecimal()) + ")");

        int num1 = fraction.getNumerator();
        int den1 = fraction.getDenominator();
        int num2 = 3;
        int den2 = 4;
        System.out.println();
        System.out.println("Додаємо дріб " + num2 + "/" + den2 + " до " + num1 + "/" + den1 + "...");
        fraction.add(num2, den2);
        System.out.print("Формула: " + num1 + "/" + den1 + " + " + num2 + "/" + den2
                + " = (" + num1 + "*" + den2 + " + " + num2 + "*" + den1 + ") / ("
                + den1 + "*" + den2 + ") = ");
        fraction.printFraction();
        System.out.println();
        System.out.print("Результат додавання: ");
        fraction.printFraction();
        System.out.println(" (десятковий вигляд: " + format(fraction.toDecimal()) + ")");
        System.out.println("=====================================");
    }

    private static String format(double value) {
        return String.format(Locale.US, "%.4f", value);
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public void setValues(int num, int den) {
        if (den == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            numerator = num;
            denominator = 1;
        } else if (den < 0) {
            numerator = -num;
            denominator = -den;
        } else {
            numerator = num;
            denominator = den;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void simplify() {
        int divisor = gcd(numerator, denominator);
        if (divisor != 0) {
            numerator /= divisor;
            denominator /= divisor;
        }
    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    public void add(int otherNum, int otherDen) {
        if (otherDen == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            return;
        }
        numerator = numerator * otherDen + otherNum * denominator;
        denominator = denominator * otherDen;
        simplify();
    }

    public void printFraction() {
        if (denominator == 1) {
            System.out.print(numerator);
        } else {
            System.out.print(numerator + "/" + denominator);
        }
    }
}
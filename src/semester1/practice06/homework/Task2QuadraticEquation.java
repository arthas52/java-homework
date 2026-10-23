package semester1.practice06.homework;

import java.util.Locale;

public class Task2QuadraticEquation {

    public static void main(String[] args) {
        System.out.println("=== РОЗВ'ЯЗУВАЧ КВАДРАТНИХ РІВНЯНЬ ===");

        System.out.println("Тест 1:");
        QuadraticEquation twoRoots = new QuadraticEquation();
        twoRoots.setCoefficients(1, -5, 6);
        twoRoots.printSolution();
        System.out.println("--------------------------------------");

        System.out.println("Тест 2:");
        QuadraticEquation oneRoot = new QuadraticEquation();
        oneRoot.setCoefficients(1, -4, 4);
        oneRoot.printSolution();
        System.out.println("--------------------------------------");

        System.out.println("Тест 3:");
        QuadraticEquation noRoots = new QuadraticEquation();
        noRoots.setCoefficients(1, 2, 5);
        noRoots.printSolution();
        System.out.println("======================================");
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public void setCoefficients(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Увага: коефіцієнт 'a' не може дорівнювати 0 (це лінійне рівняння)!");
            this.a = 1.0;
        } else {
            this.a = a;
        }
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }

    public double getRoot1() {
        double d = getDiscriminant();
        if (d < 0) {
            return Double.NaN;
        }
        return (-b + Math.sqrt(d)) / (2 * a);
    }

    public double getRoot2() {
        double d = getDiscriminant();
        if (d < 0) {
            return Double.NaN;
        }
        return (-b - Math.sqrt(d)) / (2 * a);
    }

    private String term(double value) {
        return value < 0 ? "(" + value + ")" : String.valueOf(value);
    }

    private String format(double value) {
        return String.format(Locale.US, "%.2f", value);
    }

    public void printSolution() {
        double d = getDiscriminant();
        System.out.println("Рівняння: " + a + "*x^2 + " + term(b) + "*x + " + term(c) + " = 0");
        System.out.println("Дискримінант D = " + format(d));
        if (d > 0) {
            System.out.println("Рівняння має 2 дійсні корені:");
            System.out.println("  x1 = " + format(getRoot1()));
            System.out.println("  x2 = " + format(getRoot2()));
        } else if (d == 0) {
            System.out.println("Рівняння має один дійсний корінь:");
            System.out.println("  x = " + format(-b / (2 * a)));
        } else {
            System.out.println("Рівняння не має дійсних коренів у множині R.");
        }
    }
}
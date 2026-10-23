package semester1.practice05.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task1DailySales {

    public static void main(String[] args) {
        // Locale.US потрібна, щоб дробові числа вводились через крапку (8200.50), а не через кому
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        double[] sales = new double[7];

        System.out.println("=== ФІНАНСОВИЙ ЗВІТ КАВ'ЯРНІ ЗА ТИЖДЕНЬ ===");
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Введіть виторг за " + days[i] + " (грн): ");
            sales[i] = scanner.nextDouble();
        }

        double total = 0;
        double max = sales[0];
        double min = sales[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
            if (sales[i] > max) {
                max = sales[i];
                maxIndex = i;
            }
            if (sales[i] < min) {
                min = sales[i];
                minIndex = i;
            }
        }
        double average = total / sales.length;

        System.out.println();
        System.out.println("---------------- ПІДСУМКИ ----------------");
        System.out.println("Загальний тижневий виторг: " + format(total) + " грн");
        System.out.println("Середній виторг на день:    " + format(average) + " грн");
        System.out.println("Найкращий день:            " + days[maxIndex] + " (" + format(max) + " грн)");
        System.out.println("Найгірший день:            " + days[minIndex] + " (" + format(min) + " грн)");
        System.out.println();
        System.out.println("Дні з виторгом вище середнього:");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                System.out.println("- " + days[i] + ": " + format(sales[i]) + " грн");
            }
        }
        System.out.println("==========================================");

        scanner.close();
    }

    private static String format(double value) {
        return String.format(Locale.US, "%.2f", value);
    }
}
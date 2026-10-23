package semester1.practice03.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task1FuelCalculator {

    public static void main(String[] args) {
        // Locale.US потрібна, щоб дробові числа вводились через крапку (450.0), а не через кому
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== КАЛЬКУЛЯТОР ПОЇЗДКИ ТА ПАЛЬНОГО ===");
        System.out.print("Введіть відстань поїздки (км): ");
        double distance = scanner.nextDouble();
        System.out.print("Введіть середню витрату на 100 км (л): ");
        double fuelConsumption = scanner.nextDouble();
        System.out.print("Оберіть тип пального (1 - А-95, 2 - Дизель, 3 - Газ): ");
        int fuelType = scanner.nextInt();

        if (distance <= 0 || fuelConsumption <= 0) {
            System.out.println("Помилка: відстань і витрата пального мають бути більше нуля!");
            scanner.close();
            return;
        }

        double pricePerLiter = switch (fuelType) {
            case 1 -> 56.50;
            case 2 -> 52.80;
            case 3 -> 29.40;
            default -> -1.0;
        };
        String fuelName = switch (fuelType) {
            case 1 -> "Бензин А-95";
            case 2 -> "Дизель";
            case 3 -> "Газ";
            default -> "Невідомо";
        };

        if (pricePerLiter < 0) {
            System.out.println("Помилка: невідомий тип пального!");
            scanner.close();
            return;
        }

        double neededFuel = distance * fuelConsumption / 100.0;
        double baseCost = neededFuel * pricePerLiter;
        double discount = (baseCost >= 2000.0) ? baseCost * 0.05 : 0.0;
        double finalCost = (baseCost >= 2000.0) ? baseCost * 0.95 : baseCost;

        System.out.println();
        System.out.println("---------------- ЗВІТ ПОЇЗДКИ ----------------");
        System.out.println("Обране пальне:               " + fuelName
                + " (" + String.format(Locale.US, "%.2f", pricePerLiter) + " грн/л)");
        System.out.println("Необхідно пального:          " + String.format(Locale.US, "%.2f", neededFuel) + " л");
        System.out.println("Базова вартість:             " + String.format(Locale.US, "%.2f", baseCost) + " грн");
        System.out.println("Знижка АЗС (5%):             " + String.format(Locale.US, "%.2f", discount) + " грн");
        System.out.println("----------------------------------------------");
        System.out.println("Підсумкова сума до сплати:   " + String.format(Locale.US, "%.2f", finalCost) + " грн");
        System.out.println("==============================================");

        scanner.close();
    }
}
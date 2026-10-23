package semester1.practice05.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task2WarehouseInventory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = {"Ноутбук", "Смартфон", "Бездротові навушники", "Механічна клавіатура", "Монітор 27\""};
        int[] quantities = {8, 3, 25, 4, 12};
        double[] prices = {28500.0, 19200.0, 1850.0, 3100.0, 9400.0};

        double[] totalValues = new double[items.length];
        double warehouseTotal = 0;
        int maxIndex = 0;
        for (int i = 0; i < items.length; i++) {
            totalValues[i] = quantities[i] * prices[i];
            warehouseTotal += totalValues[i];
            if (totalValues[i] > totalValues[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("=================== ЗВІТ СКЛАДУ ЕЛЕКТРОНІКИ ===================");
        System.out.println("№ | Назва товару            | К-сть | Ціна (грн) | Загальна вартість");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < items.length; i++) {
            System.out.println(String.format("%d | %-23s | %-6s| %-10s | %s грн",
                    i + 1, items[i], quantities[i] + " шт.", format(prices[i]), format(totalValues[i])));
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Загальна вартість складу: " + format(warehouseTotal) + " грн");
        System.out.println("Найбільший капітал у товарі: " + items[maxIndex]
                + " (" + format(totalValues[maxIndex]) + " грн)");
        System.out.println();
        System.out.println("🚨 ДЕФІЦИТНІ ПОЗИЦІЇ (менше 5 шт.):");
        for (int i = 0; i < items.length; i++) {
            if (quantities[i] < 5) {
                System.out.println("- " + items[i] + " (залишилось: " + quantities[i]
                        + " шт.) -> ⚠️ Терміново дозамовити!");
            }
        }
        System.out.println("================================================================");

        scanner.close();
    }

    private static String format(double value) {
        return String.format(Locale.US, "%.2f", value);
    }
}
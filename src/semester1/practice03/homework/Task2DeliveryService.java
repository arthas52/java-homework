package semester1.practice03.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task2DeliveryService {

    public static void main(String[] args) {
        // Locale.US потрібна, щоб дробові числа вводились через крапку (8.5), а не через кому
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== ТАРИФІКАТОР СЛУЖБИ ДОСТАВКИ ===");
        System.out.print("Введіть вагу відправлення (кг): ");
        double weight = scanner.nextDouble();
        System.out.print("Введіть відстань транспортування (км): ");
        int distance = scanner.nextInt();
        System.out.print("Оберіть пункт призначення (1 - Відділення, 2 - Поштомат, 3 - Кур'єр): ");
        int deliveryType = scanner.nextInt();
        scanner.nextLine(); // очищення залишкового \n після nextInt()
        System.out.print("Чи є у вас карта Premium? (так/ні): ");
        String premiumAnswer = scanner.nextLine();

        if (weight <= 0 || weight > 50.0) {
            System.out.println("Помилка: вага має бути більше 0 та не більше 50 кг!");
            scanner.close();
            return;
        }
        if (distance <= 0) {
            System.out.println("Помилка: відстань має бути більше 0 км!");
            scanner.close();
            return;
        }

        double baseTariff = switch (deliveryType) {
            case 1 -> 50.0;
            case 2 -> {
                if (weight > 15.0) {
                    System.out.println("Поштомат не підтримує вантажі понад 15 кг!");
                    yield -1.0;
                } else {
                    yield 60.0;
                }
            }
            case 3 -> 100.0;
            default -> -1.0;
        };

        if (baseTariff < 0) {
            if (deliveryType < 1 || deliveryType > 3) {
                System.out.println("Помилка: некоректний тип доставки!");
            }
            scanner.close();
            return;
        }

        String deliveryName = switch (deliveryType) {
            case 1 -> "Відділення";
            case 2 -> "Поштомат";
            default -> "Кур'єр";
        };

        double distanceSurcharge;
        if (distance <= 50) {
            distanceSurcharge = 0.0;
        } else if (distance <= 200) {
            distanceSurcharge = 35.0;
        } else {
            distanceSurcharge = 80.0;
        }

        boolean isPremium = premiumAnswer.equalsIgnoreCase("так");
        double subtotal = baseTariff + distanceSurcharge;
        double total = isPremium ? subtotal * 0.8 : subtotal;
        String clientStatus = isPremium ? "Premium (-20%)" : "Стандартний (без знижки)";

        System.out.println();
        System.out.println("------------- НАКЛАДНА ДОСТАВКИ -------------");
        System.out.println("Тип доставки:              " + deliveryName
                + " (базовий тариф: " + String.format(Locale.US, "%.2f", baseTariff) + " грн)");
        System.out.println("Доплата за відстань:       " + String.format(Locale.US, "%.2f", distanceSurcharge)
                + " грн (" + distance + " км)");
        System.out.println("Сума до знижки:            " + String.format(Locale.US, "%.2f", subtotal) + " грн");
        System.out.println("Статус клієнта:            " + clientStatus);
        System.out.println("---------------------------------------------");
        System.out.println("РАЗОМ ДО СПЛАТИ:           " + String.format(Locale.US, "%.2f", total) + " грн");
        System.out.println("=============================================");

        scanner.close();
    }
}
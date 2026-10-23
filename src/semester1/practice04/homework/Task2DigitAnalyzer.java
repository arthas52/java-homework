package semester1.practice04.homework;

import java.util.Scanner;

public class Task2DigitAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== АНАЛІЗАТОР РОЗРЯДІВ ЧИСЛА ===");
        System.out.print("Введіть додатне ціле число: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Помилка: число має бути додатним!");
            scanner.close();
            return;
        }

        int originalNumber = number;
        int temp = number;
        int digitsCount = 0;
        int digitsSum = 0;
        int maxDigit = 0;
        long reversedNumber = 0;

        while (temp > 0) {
            int digit = temp % 10;
            digitsCount++;
            digitsSum += digit;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }

        System.out.println();
        System.out.println("--- СТАТИСТИКА ЧИСЛА ---");
        System.out.println("Початкове число:     " + originalNumber);
        System.out.println("Кількість цифр:      " + digitsCount);
        System.out.println("Сума цифр:           " + digitsSum);
        System.out.println("Найбільша цифра:     " + maxDigit);
        System.out.println("Перевернуте число:   " + reversedNumber);
        if (originalNumber == reversedNumber) {
            System.out.println("Результат:           ✨ Це число є ПАЛІНДРОМОМ!");
        } else {
            System.out.println("Результат:           Це звичайне число (не паліндром).");
        }
        System.out.println("================================");

        scanner.close();
    }
}
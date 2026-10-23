package semester1.practice04;

import java.util.Locale;
import java.util.Scanner;

public class Practice04 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            choice = readInt("\nВведіть номер завдання (1-40) або 0 для виходу: ");
            System.out.println();
            switch (choice) {
                case 0 -> System.out.println("Роботу завершено.");
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 5 -> task5();
                case 6 -> task6();
                case 7 -> task7();
                case 8 -> task8();
                case 9 -> task9();
                case 10 -> task10();
                case 11 -> task11();
                case 12 -> task12();
                case 13 -> task13();
                case 14 -> task14();
                case 15 -> task15();
                case 16 -> task16();
                case 17 -> task17();
                case 18 -> task18();
                case 19 -> task19();
                case 20 -> task20();
                case 21 -> task21();
                case 22 -> task22();
                case 23 -> task23();
                case 24 -> task24();
                case 25 -> task25();
                case 26 -> task26();
                case 27 -> task27();
                case 28 -> task28();
                case 29 -> task29();
                case 30 -> task30();
                case 31 -> task31();
                case 32 -> task32();
                case 33 -> task33();
                case 34 -> task34();
                case 35 -> task35();
                case 36 -> task36();
                case 37 -> task37();
                case 38 -> task38();
                case 39 -> task39();
                case 40 -> task40();
                default -> System.out.println("Такого завдання немає.");
            }
        } while (choice != 0);
        scanner.close();
    }

    // ===== Допоміжні методи введення та форматування =====

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введіть ціле число!");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введіть число!");
            }
        }
    }

    private static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static char readChar(String prompt) {
        String line = readLine(prompt).trim();
        return line.isEmpty() ? ' ' : Character.toLowerCase(line.charAt(0));
    }

    private static String fmt(double value) {
        return String.format(Locale.US, "%.2f", value);
    }

    // ===== Блок 1: Усунення надлишковості (DRY) =====

    // Завдання 1
    private static void task1() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Java - надійна та кросплатформна мова!");
        }
    }

    // Завдання 2
    private static void task2() {
        String text = readLine("Введіть текст: ");
        int n = readInt("Скільки разів повторити (N >= 1): ");
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "] " + text);
        }
    }

    // Завдання 3
    private static void task3() {
        int balance = 0;
        for (int month = 1; month <= 12; month++) {
            balance += 500;
            System.out.println("Місяць " + month + ": " + balance + " грн");
        }
    }

    // Завдання 4
    private static void task4() {
        double rate = readDouble("Введіть курс євро до гривні: ");
        for (int euro = 10; euro <= 100; euro += 10) {
            System.out.println(euro + " EUR = " + fmt(euro * rate) + " UAH");
        }
    }

    // Завдання 5
    private static void task5() {
        int width = readInt("Введіть ширину рамки: ");
        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    // ===== Блок 2: Цикл while =====

    // Завдання 6
    private static void task6() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        System.out.println("Поїхали! Ракета запущена!");
    }

    // Завдання 7
    private static void task7() {
        long sum = 0;
        int number = readInt("Введіть число (0 - завершити): ");
        while (number != 0) {
            sum += number;
            number = readInt("Введіть число (0 - завершити): ");
        }
        System.out.println("Сума введених чисел: " + sum);
    }

    // Завдання 8
    private static void task8() {
        long m = readInt("Введіть число M: ");
        long power = 1;
        while (power <= m) {
            System.out.print(power + " ");
            power *= 2;
        }
        System.out.println();
    }

    // Завдання 9
    private static void task9() {
        int n = readInt("Введіть додатне число N: ");
        if (n <= 0) {
            System.out.println("Помилка: число має бути додатним!");
            return;
        }
        int temp = n;
        int digitsCount = 0;
        int digitsSum = 0;
        while (temp > 0) {
            digitsSum += temp % 10;
            digitsCount++;
            temp /= 10;
        }
        System.out.println("Кількість цифр: " + digitsCount);
        System.out.println("Сума цифр: " + digitsSum);
    }

    // Завдання 10
    private static void task10() {
        int n = readInt("Введіть додатне число: ");
        if (n <= 0) {
            System.out.println("Помилка: число має бути додатним!");
            return;
        }
        int temp = n;
        long reversed = 0;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Число у зворотному порядку: " + reversed);
    }

    // Завдання 11
    private static void task11() {
        double deposit = readDouble("Введіть початкову суму внеску (грн): ");
        double percent = readDouble("Введіть річну ставку (%): ");
        if (deposit <= 0 || percent <= 0) {
            System.out.println("Помилка: сума і ставка мають бути додатними!");
            return;
        }
        double capital = deposit;
        int years = 0;
        while (capital < deposit * 2) {
            capital += capital * percent / 100;
            years++;
        }
        System.out.println("Капітал подвоїться через " + years + " р. (" + fmt(capital) + " грн)");
    }

    // Завдання 12
    private static void task12() {
        int n = readInt("Введіть число N (> 1): ");
        if (n <= 1) {
            System.out.println("Помилка: число має бути більше 1!");
            return;
        }
        int divisor = 2;
        while (n % divisor != 0) {
            divisor++;
        }
        System.out.println("Найменший дільник числа " + n + " (крім 1): " + divisor);
    }

    // Завдання 13
    private static void task13() {
        int secret = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess = -1;
        while (guess != secret) {
            guess = readInt("Ваша здогадка (1-100): ");
            attempts++;
            if (guess > secret) {
                System.out.println("Менше!");
            } else if (guess < secret) {
                System.out.println("Більше!");
            }
        }
        System.out.println("Вгадали! Число " + secret + ". Спроб: " + attempts);
    }

    // ===== Блок 3: Цикл do-while =====

    // Завдання 14
    private static void task14() {
        int choice;
        do {
            System.out.println("1. Розпочати нову гру");
            System.out.println("2. Завантажити збереження");
            System.out.println("3. Налаштування");
            System.out.println("0. Вихід");
            choice = readInt("Ваш вибір: ");
            switch (choice) {
                case 1 -> System.out.println("Нова гра розпочата!");
                case 2 -> System.out.println("Збереження завантажено.");
                case 3 -> System.out.println("Відкрито налаштування.");
                case 0 -> System.out.println("Вихід із меню.");
                default -> System.out.println("Невідомий пункт меню!");
            }
        } while (choice != 0);
    }

    // Завдання 15
    private static void task15() {
        int age;
        do {
            age = readInt("Введіть вік (1-120): ");
            if (age < 1 || age > 120) {
                System.out.println("Некоректний вік, спробуйте ще раз.");
            }
        } while (age < 1 || age > 120);
        System.out.println("Вік підтверджено: " + age);
    }

    // Завдання 16
    private static void task16() {
        final int CORRECT_PIN = 1234;
        int attempts = 0;
        boolean isGranted = false;
        do {
            int pin = readInt("Введіть PIN-код: ");
            attempts++;
            if (pin == CORRECT_PIN) {
                isGranted = true;
            } else {
                System.out.println("Невірний PIN. Залишилось спроб: " + (3 - attempts));
            }
        } while (!isGranted && attempts < 3);
        if (isGranted) {
            System.out.println("Доступ надано");
        } else {
            System.out.println("Карту заблоковано!");
        }
    }

    // Завдання 17
    private static void task17() {
        char answer;
        do {
            double a = readDouble("Введіть перше число: ");
            double b = readDouble("Введіть друге число: ");
            System.out.println("Сума: " + (a + b));
            answer = readChar("Бажаєте продовжити? (y/n): ");
        } while (answer == 'y');
        System.out.println("Роботу завершено.");
    }

    // Завдання 18
    private static void task18() {
        int attempts = 0;
        int dice1;
        int dice2;
        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            attempts++;
            System.out.println("Кидок " + attempts + ": " + dice1 + " і " + dice2);
        } while (dice1 != dice2);
        System.out.println("Дубль! Кількість спроб: " + attempts);
    }

    // Завдання 19
    private static void task19() {
        int numerator = readInt("Введіть чисельник: ");
        int denominator;
        do {
            denominator = readInt("Введіть знаменник (не 0): ");
            if (denominator == 0) {
                System.out.println("Знаменник не може бути нулем!");
            }
        } while (denominator == 0);
        System.out.println("Результат: " + ((double) numerator / denominator));
    }

    // Завдання 20
    private static void task20() {
        int score;
        int sum = 0;
        int count = 0;
        do {
            score = readInt("Введіть бал (0-100, від'ємне число - завершити): ");
            if (score > 100) {
                System.out.println("Некоректний бал, спробуйте ще раз.");
            } else if (score >= 0) {
                sum += score;
                count++;
            }
        } while (score >= 0);
        if (count > 0) {
            System.out.println("Середній бал: " + fmt((double) sum / count));
        } else {
            System.out.println("Жодного балу не введено.");
        }
    }

    // ===== Блок 4: Цикл for, break та continue =====

    // Завдання 21
    private static void task21() {
        int a = readInt("Введіть A: ");
        int b = readInt("Введіть B (B >= A): ");
        if (a > b) {
            System.out.println("Помилка: A має бути не більше B!");
            return;
        }
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Завдання 22
    private static void task22() {
        int n = readInt("Введіть N (0-20): ");
        if (n < 0 || n > 20) {
            System.out.println("Помилка: N має бути від 0 до 20!");
            return;
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }

    // Завдання 23
    private static void task23() {
        System.out.println(String.format("%6s | %8s | %6s", "Число", "Квадрат", "Куб"));
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%6d | %8d | %6d", i, i * i, i * i * i));
        }
    }

    // Завдання 24
    private static void task24() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Завдання 25
    private static void task25() {
        for (int i = 100; i <= 200; i++) {
            if (i % 13 == 0 && i % 7 == 0) {
                System.out.println("Перше число, кратне 13 і 7: " + i);
                break;
            }
        }
    }

    // Завдання 26
    private static void task26() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + " = " + (int) c);
        }
    }

    // Завдання 27
    private static void task27() {
        int n = readInt("Введіть кількість доданків N: ");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println("S = " + sum);
    }

    // Завдання 28
    private static void task28() {
        int first = readInt("Введіть перший член a1: ");
        int difference = readInt("Введіть різницю d: ");
        int n = readInt("Введіть кількість членів n: ");
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int term = first + i * difference;
            System.out.print(term + " ");
            sum += term;
        }
        System.out.println();
        System.out.println("Сума: " + sum);
    }

    // ===== Блок 5: Приведення типів =====

    // Завдання 29
    private static void task29() {
        byte b = 125;
        for (int i = 1; i <= 6; i++) {
            b = (byte) (b + 1);
            System.out.println("Ітерація " + i + ": b = " + b);
        }
        // Після 127 відбувається переповнення (overflow): старші біти відкидаються,
        // старший біт молодшого байта стає знаковим, тому значення стрибає на -128.
    }

    // Завдання 30
    private static void task30() {
        int n = readInt("Скільки чисел введете (N > 0): ");
        if (n <= 0) {
            System.out.println("Помилка: N має бути додатним!");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += readInt("Число " + i + ": ");
        }
        double exactAverage = (double) sum / n;
        int wrongAverage = sum / n;
        System.out.println("Точне середнє: " + exactAverage);
        System.out.println("Без приведення (цілочисельне ділення): " + wrongAverage);
    }

    // Завдання 31
    private static void task31() {
        String word = readLine("Введіть слово (5 символів): ");
        String encrypted = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            encrypted += (char) (ch + 1);
        }
        System.out.println("Зашифроване слово: " + encrypted);
    }

    // Завдання 32
    private static void task32() {
        double[] prices = {19.99, 45.50, 12.10, 99.95, 3.40};
        int wholeSum = 0;
        int kopecksSum = 0;
        for (int i = 0; i < prices.length; i++) {
            int whole = (int) prices[i];
            wholeSum += whole;
            kopecksSum += (int) Math.round((prices[i] - whole) * 100);
        }
        System.out.println("Сума цілих гривень: " + wholeSum);
        System.out.println("Сума відкинутих копійок: " + kopecksSum + " коп. (" + fmt(kopecksSum / 100.0) + " грн)");
    }

    // Завдання 33
    private static void task33() {
        for (int i = 1; i <= 50; i++) {
            int percent = (int) (((double) i / 50) * 100);
            System.out.println("Завантажено: " + percent + "%");
        }
        // Приведення (int) відкидає дробову частину, тому через похибку double
        // деякі значення можуть вийти на 1% меншими (наприклад, 57 замість 58).
    }

    // Завдання 34
    private static void task34() {
        long bigNumber = 3_000_000_000L;
        int truncated = (int) bigNumber;
        System.out.println("long: " + bigNumber);
        System.out.println("int після приведення: " + truncated);
        // Число 3 000 000 000 більше за максимум int (2 147 483 647),
        // тому старші 32 біти відкинуто і значення стало від'ємним.
    }

    // Завдання 35
    private static void task35() {
        System.out.println("Цикл із double-лічильником:");
        for (double d = 0.0; d <= 1.0; d += 0.1) {
            System.out.println(d);
        }
        System.out.println("Цикл із цілочисельним лічильником:");
        for (int i = 0; i <= 10; i++) {
            double val = i / 10.0;
            System.out.println(val);
        }
    }

    // ===== Блок 6: Вкладені цикли =====

    // Завдання 36
    private static void task36() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    // Завдання 37
    private static void task37() {
        int height = readInt("Введіть висоту H: ");
        int width = readInt("Введіть ширину W: ");
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == 0 || row == height - 1 || col == 0 || col == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Завдання 38
    private static void task38() {
        int n = readInt("Введіть висоту трикутника N: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Завдання 39
    private static void task39() {
        int n = readInt("Введіть число N: ");
        for (int number = 2; number <= n; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    // Завдання 40
    private static void task40() {
        int n = readInt("Введіть розмір дошки N: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i + j) % 2 == 0 ? "#" : "_");
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
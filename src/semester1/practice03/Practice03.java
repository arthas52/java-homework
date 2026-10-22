package semester1.practice03;

import java.util.Locale;
import java.util.Scanner;

public class Practice03 {

    public static void main(String[] args) {
        // Locale.US потрібна, щоб дробові числа вводились через крапку (3.5), а не через кому
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // ===== Блок 1: Взаємодія з консоллю через Scanner =====

        // Завдання 1
        {
            System.out.print("Введіть ім'я: ");
            String firstName = scanner.nextLine();
            System.out.print("Введіть прізвище: ");
            String lastName = scanner.nextLine();
            System.out.print("Введіть вік: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // очищення буфера
            System.out.print("Введіть місто: ");
            String city = scanner.nextLine();
            System.out.println("=== ВХІДНІ ДАНІ ===");
            System.out.println("Ім'я: " + firstName);
            System.out.println("Прізвище: " + lastName);
            System.out.println("Вік: " + age);
            System.out.println("Місто: " + city);
            System.out.println("-------------------");
            System.out.println("Привіт, " + firstName + " " + lastName + " з міста " + city
                    + "! Твій вік: " + age + " р.");
        }

        // Завдання 2
        {
            System.out.print("Введіть перше число: ");
            int a = scanner.nextInt();
            System.out.print("Введіть друге число: ");
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Сума: " + (a + b));
            System.out.println("Різниця: " + (a - b));
            System.out.println("Добуток: " + (a * b));
            System.out.println("Остача від ділення: " + (a % b));
        }

        // Завдання 3
        {
            System.out.print("Введіть суму в гривнях (UAH): ");
            double uahAmount = scanner.nextDouble();
            System.out.print("Введіть курс USD: ");
            double usdRate = scanner.nextDouble();
            scanner.nextLine();
            double usdAmount = uahAmount / usdRate;
            System.out.println("Сума до видачі: " + String.format(Locale.US, "%.2f", usdAmount) + " USD");
        }

        // Завдання 4
        {
            System.out.print("Введіть номер квитка: ");
            int ticketNumber = scanner.nextInt();
            scanner.nextLine(); // очищення залишкового \n після nextInt()
            System.out.print("Введіть повне ім'я студента: ");
            String fullName = scanner.nextLine();
            System.out.print("Введіть спеціальність: ");
            String specialty = scanner.nextLine();
            System.out.println("Студент: " + fullName + ", квиток №" + ticketNumber
                    + ", спеціальність: " + specialty);
        }

        // Завдання 5
        {
            System.out.print("Ваш зріст (м): ");
            double heightMeters = scanner.nextDouble();
            System.out.print("Ваша вага (кг): ");
            double weightKg = scanner.nextDouble();
            scanner.nextLine();
            double bmi = weightKg / Math.pow(heightMeters, 2);
            System.out.println("Розрахований BMI: " + String.format(Locale.US, "%.2f", bmi));
        }

        // Завдання 6
        {
            System.out.print("Введіть символ: ");
            char symbol = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.println("Символ: " + symbol + " | Код символу: " + (int) symbol);
        }

        // Завдання 7
        {
            System.out.print("Катет A: ");
            double legA = scanner.nextDouble();
            System.out.print("Катет B: ");
            double legB = scanner.nextDouble();
            scanner.nextLine();
            double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
            double perimeter = legA + legB + hypotenuse;
            double area = legA * legB / 2;
            System.out.println("Гіпотенуза: " + hypotenuse);
            System.out.println("Периметр: " + perimeter);
            System.out.println("Площа: " + area);
        }

        // Завдання 8
        {
            System.out.print("Товар: ");
            String productName = scanner.nextLine();
            System.out.print("Ціна: ");
            double price = scanner.nextDouble();
            System.out.print("Кількість: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            double total = price * quantity;
            double vat = total * 20 / 100;
            System.out.println("Загальна сума: " + total + " грн (з них ПДВ 20%: " + vat + " грн)");
        }

        // ===== Блок 2: if, if-else, if-else-if =====

        // Завдання 9
        {
            System.out.print("Введіть число: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number > 0) {
                System.out.println("Число додатне.");
            } else if (number < 0) {
                System.out.println("Число від'ємне.");
            } else {
                System.out.println("Число дорівнює нулю.");
            }
        }

        // Завдання 10
        {
            System.out.print("Введіть число: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number == 0) {
                System.out.println("Число є нулем");
            } else if (number % 2 == 0) {
                System.out.println("Число " + number + " є парним.");
            } else {
                System.out.println("Число " + number + " є непарним.");
            }
        }

        // Завдання 11
        {
            System.out.print("Введіть вік: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age < 0 || age > 120) {
                System.out.println("Некоректний вік");
            } else if (age <= 12) {
                System.out.println("Дитина");
            } else if (age <= 17) {
                System.out.println("Підліток");
            } else if (age <= 64) {
                System.out.println("Дорослий");
            } else {
                System.out.println("Пенсіонер");
            }
        }

        // Завдання 12
        {
            System.out.print("Введіть підсумковий бал (0-100): ");
            int score = scanner.nextInt();
            scanner.nextLine();
            if (score < 0 || score > 100) {
                System.out.println("Помилка: некоректний бал!");
            } else if (score >= 90) {
                System.out.println("Відмінно (A)");
            } else if (score >= 82) {
                System.out.println("Дуже добре (B)");
            } else if (score >= 74) {
                System.out.println("Добре (C)");
            } else if (score >= 64) {
                System.out.println("Задовільно (D)");
            } else if (score >= 60) {
                System.out.println("Достатньо (E)");
            } else {
                System.out.println("Незадовільно (F)");
            }
        }

        // Завдання 13
        {
            System.out.print("Введіть 3 числа: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            scanner.nextLine();
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            int min = a;
            if (b < min) {
                min = b;
            }
            if (c < min) {
                min = c;
            }
            System.out.println("Максимум: " + max);
            System.out.println("Мінімум: " + min);
        }

        // Завдання 14
        {
            System.out.print("Введіть X: ");
            double x = scanner.nextDouble();
            System.out.print("Введіть Y: ");
            double y = scanner.nextDouble();
            scanner.nextLine();
            String position;
            if (x == 0 && y == 0) {
                position = "знаходиться на початку координат.";
            } else if (x == 0 || y == 0) {
                position = "лежить на осі координат.";
            } else if (x > 0 && y > 0) {
                position = "знаходиться у I чверті.";
            } else if (x < 0 && y > 0) {
                position = "знаходиться у II чверті.";
            } else if (x < 0 && y < 0) {
                position = "знаходиться у III чверті.";
            } else {
                position = "знаходиться у IV чверті.";
            }
            System.out.println("Точка (" + x + "; " + y + ") " + position);
        }

        // Завдання 15
        {
            int x = 5;
            int y = 20;
            // Без фігурних дужок else прив'язується до НАЙБЛИЖЧОГО if (y > 10),
            // а не до зовнішнього if (x > 10). Тут x = 5, тому зовнішня умова хибна
            // і не виводиться нічого, хоча за відступами здається, що else належить зовнішньому if.
            if (x > 10)
                if (y > 10)
                    System.out.println("x > 10 і y > 10");
                else
                    System.out.println("else належить до внутрішнього if (y > 10)");

            // Виправлений варіант: фігурні дужки, else належить до зовнішнього if (x > 10)
            if (x > 10) {
                if (y > 10) {
                    System.out.println("x > 10 і y > 10");
                }
            } else {
                System.out.println("x не більше 10 (else належить до зовнішнього if)");
            }
        }

        // Завдання 16
        {
            System.out.print("Спожито (кВт·год): ");
            int kwh = scanner.nextInt();
            scanner.nextLine();
            double sum;
            if (kwh <= 100) {
                sum = kwh * 2.64;
                System.out.println("Сума до сплати: " + kwh + " * 2.64 = " + sum + " грн");
            } else {
                sum = 100 * 2.64 + (kwh - 100) * 4.32;
                System.out.println("Сума до сплати: 100 * 2.64 + " + (kwh - 100) + " * 4.32 = " + sum + " грн");
            }
        }

        // ===== Блок 3: Тернарний оператор =====

        // Завдання 17
        {
            System.out.print("Введіть x: ");
            int x = scanner.nextInt();
            System.out.print("Введіть y: ");
            int y = scanner.nextInt();
            scanner.nextLine();
            int max = (x > y) ? x : y;
            System.out.println("Більше число: " + max);
        }

        // Завдання 18
        {
            System.out.print("Введіть число n: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            int abs = (n < 0) ? -n : n;
            System.out.println("Модуль числа: " + abs);
        }

        // Завдання 19
        {
            System.out.print("Введіть число: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            String result = (number % 2 == 0) ? "Парне" : "Непарне";
            System.out.println(result);
        }

        // Завдання 20
        {
            System.out.print("Введіть бал: ");
            int score = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Результат: " + ((score >= 60) ? "Зараховано" : "Незараховано"));
        }

        // Завдання 21
        {
            System.out.print("Введіть число n: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            String status = (n > 0) ? "Додатне" : (n < 0) ? "Від'ємне" : "Нуль";
            System.out.println(status);
        }

        // Завдання 22
        {
            System.out.print("Сума покупки: ");
            double purchaseSum = scanner.nextDouble();
            scanner.nextLine();
            double finalPrice = (purchaseSum > 1000) ? purchaseSum * 0.9 : purchaseSum * 0.98;
            System.out.println("До сплати зі знижкою: " + finalPrice + " грн");
        }

        // Завдання 23
        {
            System.out.print("Введіть ділене a: ");
            int a = scanner.nextInt();
            System.out.print("Введіть дільник b: ");
            int b = scanner.nextInt();
            scanner.nextLine();
            String divisionResult = (b != 0)
                    ? "Результат: " + ((double) a / b)
                    : "Помилка: ділення на нуль неможливе!";
            System.out.println(divisionResult);
        }

        // Завдання 24
        {
            System.out.print("Кількість помилок: ");
            int count = scanner.nextInt();
            scanner.nextLine();
            String message = (count == 1) ? "Знайдено 1 помилку" : "Знайдено " + count + " помилок";
            System.out.println(message);
        }

        // ===== Блок 4: Логічні та порозрядні оператори =====

        // Завдання 25
        {
            int x = 10;
            int divisor = 0;
            if (divisor != 0 && (x / divisor > 1)) {
                System.out.println("Успішне ділення");
            } else {
                System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
            }
            // Оператор && ліниво обчислює вираз: divisor != 0 дає false, тому права частина
            // (x / divisor > 1) не обчислюється взагалі, і ArithmeticException не виникає.
        }

        // Завдання 26
        {
            int counter1 = 0;
            int counter2 = 0;
            boolean b1 = false && (++counter1 > 0);
            boolean b2 = false & (++counter2 > 0);
            System.out.println("counter1 (&&): " + counter1 + ", b1 = " + b1);
            System.out.println("counter2 (&): " + counter2 + ", b2 = " + b2);
            // && ліниве: ліворуч false, права частина пропущена, counter1 лишився 0.
            // & жадібне: завжди обчислює обидва операнди, тому ++counter2 виконався і counter2 = 1.
        }

        // Завдання 27
        {
            int number = 5;
            if (number > 0 || (10 / 0 == 0)) {
                System.out.println("Умова виконана, аварійне ділення не викликалося!");
            }
            // Оператор || ліниво обчислює вираз: number > 0 вже true, тому результат відомий
            // і права частина (10 / 0 == 0) не виконується.
        }

        // Завдання 28
        {
            int counterA = 0;
            int counterB = 0;
            boolean test1 = true || (++counterA > 0);
            boolean test2 = true | (++counterB > 0);
            System.out.println("counterA (||): " + counterA + ", test1 = " + test1);
            System.out.println("counterB (|): " + counterB + ", test2 = " + test2);
            // || ліниве: права частина не виконалась, counterA = 0.
            // | жадібне: обидва операнди обчислюються завжди, тому counterB = 1.
        }

        // Завдання 29
        {
            System.out.print("Введіть години (0-23): ");
            int hours = scanner.nextInt();
            System.out.print("Введіть хвилини (0-59): ");
            int minutes = scanner.nextInt();
            scanner.nextLine();
            boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
            if (isValidTime) {
                System.out.println("Час: " + String.format("%02d:%02d", hours, minutes));
            } else {
                System.out.println("Помилка: некоректний час!");
            }
        }

        // Завдання 30
        {
            System.out.print("Введіть сторони a, b, c: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            scanner.nextLine();
            boolean exists = (a + b > c) && (a + c > b) && (b + c > a);
            System.out.println("Сторони: " + a + ", " + b + ", " + c + " -> Трикутник існує: " + exists);
        }

        // Завдання 31
        {
            System.out.print("Введіть число n: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            boolean isEvenBitwise = (n & 1) == 0;
            boolean isEvenModulo = n % 2 == 0;
            System.out.println("Парне (n & 1): " + isEvenBitwise);
            System.out.println("Парне (n % 2): " + isEvenModulo);
            System.out.println("Операція n & 1 залишає лише останній двійковий біт числа: "
                    + "у парного числа він 0, у непарного 1.");
        }

        // Завдання 32
        {
            System.out.print("PIN-код правильний? (true/false): ");
            boolean isPinCorrect = scanner.nextBoolean();
            System.out.print("Картка активна? (true/false): ");
            boolean isCardActive = scanner.nextBoolean();
            System.out.print("Баланс: ");
            double cardBalance = scanner.nextDouble();
            System.out.print("Сума зняття: ");
            double withdrawAmount = scanner.nextDouble();
            System.out.print("Добовий ліміт перевищено? (true/false): ");
            boolean isDailyLimitExceeded = scanner.nextBoolean();
            scanner.nextLine();
            boolean hasSufficientBalance = cardBalance >= withdrawAmount;
            boolean isAllowed = isPinCorrect && isCardActive && hasSufficientBalance && !isDailyLimitExceeded;
            System.out.println("Транзакція дозволена: " + isAllowed);
        }

        // ===== Блок 5: switch =====

        // Завдання 33
        {
            System.out.print("Введіть номер дня (1-7): ");
            int dayNumber = scanner.nextInt();
            scanner.nextLine();
            switch (dayNumber) {
                case 1:
                    System.out.println("Понеділок");
                    break;
                case 2:
                    System.out.println("Вівторок");
                    break;
                case 3:
                    System.out.println("Середа");
                    break;
                case 4:
                    System.out.println("Четвер");
                    break;
                case 5:
                    System.out.println("П'ятниця");
                    break;
                case 6:
                    System.out.println("Субота");
                    break;
                case 7:
                    System.out.println("Неділя");
                    break;
                default:
                    System.out.println("Некоректний номер дня");
                    break;
            }
        }

        // Завдання 34
        {
            System.out.print("Введіть номер дня (1-7): ");
            int dayNumber = scanner.nextInt();
            scanner.nextLine();
            switch (dayNumber) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Будній (робочий) день");
                    break;
                case 6:
                case 7:
                    System.out.println("Вихідний день");
                    break;
                default:
                    System.out.println("Некоректний номер дня");
                    break;
            }
        }

        // Завдання 35
        {
            System.out.print("Введіть номер місяця (1-12): ");
            int month = scanner.nextInt();
            scanner.nextLine();
            int days = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 28;
                default -> 0;
            };
            if (days == 0) {
                System.out.println("Такого місяця не існує");
            } else {
                System.out.println("Кількість днів у місяці: " + days);
            }
        }

        // Завдання 36
        {
            System.out.print("Введіть місяць: ");
            String monthName = scanner.nextLine();
            String season = switch (monthName.toLowerCase()) {
                case "грудень", "січень", "лютий" -> "Зима";
                case "березень", "квітень", "травень" -> "Весна";
                case "червень", "липень", "серпень" -> "Літо";
                case "вересень", "жовтень", "листопад" -> "Осінь";
                default -> "Невідомий місяць";
            };
            System.out.println("Пора року: " + season);
        }

        // Завдання 37
        {
            System.out.print("Спосіб доставки (1 - Самовивіз, 2 - Кур'єр, 3 - Поштомат): ");
            int deliveryMethod = scanner.nextInt();
            System.out.print("Вага товару (кг): ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            int deliveryCost = switch (deliveryMethod) {
                case 1 -> 0;
                case 2 -> {
                    if (weight > 5) {
                        yield 150;
                    } else {
                        yield 90;
                    }
                }
                case 3 -> 60;
                default -> -1;
            };
            if (deliveryCost == -1) {
                System.out.println("Некоректний вибір способу доставки");
            } else {
                System.out.println("Вартість доставки: " + deliveryCost + " грн");
            }
        }

        // Завдання 38
        {
            System.out.print("Число 1: ");
            double a = scanner.nextDouble();
            System.out.print("Оберіть операцію (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            System.out.print("Число 2: ");
            double b = scanner.nextDouble();
            scanner.nextLine();
            double result = switch (operation) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> (b == 0) ? Double.NaN : a / b;
                default -> Double.NaN;
            };
            if (Double.isNaN(result)) {
                System.out.println("Помилка: некоректна операція або ділення на нуль");
            } else {
                System.out.println("Результат: " + result);
            }
        }

        // Завдання 39
        {
            System.out.print("Введіть команду: ");
            String command = scanner.nextLine();
            // Оператор == порівнює посилання на об'єкти, а не текст. Рядок зі Scanner створюється
            // в купі (Heap) як новий об'єкт, а літерал "start" лежить у String Pool,
            // тому command == "start" дає false навіть при однакових літерах.
            System.out.println("command == \"start\": " + (command == "start"));
            System.out.println("command.equalsIgnoreCase(\"start\"): " + command.equalsIgnoreCase("start"));
            switch (command.toLowerCase()) {
                case "start" -> System.out.println("Система успішно запущена!");
                case "pause" -> System.out.println("Система поставлена на паузу.");
                case "stop" -> System.out.println("Система зупинена.");
                case "exit" -> System.out.println("Вихід із програми.");
                default -> System.out.println("Невідома команда!");
            }
        }

        // Завдання 40
        {
            final int CORRECT_PIN = 1234;
            double balance = 5000.0;
            System.out.println("================ БАНКОМАТ ================");
            System.out.print("Введіть PIN: ");
            int pin = scanner.nextInt();
            if (pin != CORRECT_PIN) {
                System.out.println("Невірний PIN-код. Роботу завершено.");
            } else {
                System.out.println("Авторизація успішна!");
                System.out.print("Оберіть дію (1 - Баланс, 2 - Поповнення, 3 - Зняття, 4 - Вихід): ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> System.out.println("Ваш баланс: " + balance + " грн");
                    case 2 -> {
                        System.out.print("Введіть суму поповнення: ");
                        double deposit = scanner.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Рахунок поповнено. Баланс: " + balance + " грн");
                        } else {
                            System.out.println("Некоректна сума поповнення");
                        }
                    }
                    case 3 -> {
                        System.out.print("Введіть суму зняття: ");
                        double amount = scanner.nextDouble();
                        double commission = (amount > 1000) ? amount * 0.01 : 0.0;
                        if (amount > 0 && amount + commission <= balance) {
                            balance -= amount + commission;
                            System.out.println("Комісія операції: " + commission + " грн");
                            System.out.println("Видано: " + amount + " грн. Залишок на рахунку: " + balance + " грн");
                        } else {
                            System.out.println("Помилка: некоректна сума або недостатньо коштів");
                        }
                    }
                    case 4 -> System.out.println("Роботу завершено.");
                    default -> System.out.println("Невідома дія");
                }
            }
            scanner.nextLine();
            System.out.println("==========================================");
        }

        scanner.close();
    }
}
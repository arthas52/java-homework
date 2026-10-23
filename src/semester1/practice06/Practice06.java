package semester1.practice06;

import java.util.Locale;
import java.util.Scanner;

public class Practice06 {

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

    private static String fmt(double value) {
        return String.format(Locale.US, "%.2f", value);
    }

    // ===== Блок 1: Перші класи, поля та створення об'єктів =====

    // Завдання 1
    private static void task1() {
        Student s1 = new Student();
        s1.name = "Денис";
        s1.age = 19;
        s1.gpa = 4.75;
        System.out.println(s1.name + ", " + s1.age + ", " + s1.gpa);
    }

    // Завдання 2
    private static void task2() {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2021;
        car1.speed = 180;
        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2023;
        car2.speed = 250;
        System.out.println(car1.brand + " " + car1.model + ", " + car1.year + ", " + car1.speed + " км/год");
        System.out.println(car2.brand + " " + car2.model + ", " + car2.year + ", " + car2.speed + " км/год");
        if (car1.year > car2.year) {
            System.out.println("Новіший автомобіль: " + car1.brand);
        } else if (car1.year < car2.year) {
            System.out.println("Новіший автомобіль: " + car2.brand);
        } else {
            System.out.println("Автомобілі випущені в один рік.");
        }
    }

    // Завдання 3
    private static void task3() {
        Book emptyBook = new Book();
        System.out.println("title = " + emptyBook.title);
        System.out.println("author = " + emptyBook.author);
        System.out.println("pages = " + emptyBook.pages);
        System.out.println("isRead = " + emptyBook.isRead);
    }

    // Завдання 4
    private static void task4() {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 7.5;
        rectangle.height = 4.0;
        double area = rectangle.width * rectangle.height;
        double perimeter = 2 * (rectangle.width + rectangle.height);
        System.out.println("Площа: " + area);
        System.out.println("Периметр: " + perimeter);
    }

    // Завдання 5
    private static void task5() {
        Product product = new Product();
        product.name = "Монітор";
        product.price = 6500.0;
        product.quantity = 8;
        double totalCost = product.price * product.quantity;
        System.out.println("Загальна вартість партії \"" + product.name + "\": " + fmt(totalCost) + " грн");
    }

    // Завдання 6
    private static void task6() {
        Smartphone phone = new Smartphone();
        phone.model = "Galaxy";
        phone.batteryLevel = 100;
        phone.isTurnedOn = true;
        phone.batteryLevel -= 35;
        if (phone.batteryLevel <= 0) {
            phone.isTurnedOn = false;
        }
        System.out.println(phone.model + ": заряд " + phone.batteryLevel + "%, увімкнений: " + phone.isTurnedOn);
    }

    // Завдання 7
    private static void task7() {
        Point2D a = new Point2D();
        a.x = 0;
        a.y = 0;
        Point2D b = new Point2D();
        b.x = 3;
        b.y = 4;
        double distance = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        System.out.println("Відстань між A і B: " + distance);
    }

    // Завдання 8
    private static void task8() {
        Student first = new Student();
        first.name = "Іван";
        Student second = first;
        second.name = "Петро";
        System.out.println(first.name);
        // Змінні first і second зберігають посилання на ОДИН і той самий об'єкт у Heap,
        // оператор new викликався лише раз, тому зміна через second видна і через first.
    }

    // ===== Блок 2: Методи void =====

    // Завдання 9
    private static void task9() {
        Greeter greeter = new Greeter();
        greeter.sayHello();
        greeter.sayHelloTo("Олена");
    }

    // Завдання 10
    private static void task10() {
        Animal cat = new Animal();
        cat.species = "Кіт";
        cat.name = "Мурчик";
        Animal dog = new Animal();
        dog.species = "Собака";
        dog.name = "Барбос";
        cat.makeSound();
        cat.printInfo();
        dog.makeSound();
        dog.printInfo();
    }

    // Завдання 11
    private static void task11() {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();
        counter.printCount();
        counter.reset();
        counter.printCount();
    }

    // Завдання 12
    private static void task12() {
        TrafficLight light = new TrafficLight();
        light.changeColor("Червоний");
        light.showSignal();
        light.changeColor("Жовтий");
        light.showSignal();
        light.changeColor("Зелений");
        light.showSignal();
    }

    // Завдання 13
    private static void task13() {
        Player player = new Player();
        player.nickname = "Hero";
        player.takeDamage(30);
        player.heal(50);
        player.takeDamage(200);
    }

    // Завдання 14
    private static void task14() {
        Lamp lamp = new Lamp();
        lamp.status();
        lamp.turnOn();
        lamp.status();
        lamp.toggle();
        lamp.status();
        lamp.toggle();
        lamp.status();
        lamp.turnOff();
        lamp.status();
    }

    // Завдання 15
    private static void task15() {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.tick();
        stopwatch.addSeconds(124);
        stopwatch.displayTime();
    }

    // Завдання 16
    private static void task16() {
        Printer printer = new Printer();
        printer.model = "HP LaserJet";
        printer.paperCount = 10;
        printer.printDocument("Звіт", 4);
        printer.printDocument("Договір", 10);
    }

    // ===== Блок 3: Методи з поверненням значень =====

    // Завдання 17
    private static void task17() {
        SimpleCalculator calc = new SimpleCalculator();
        int sum = calc.add(12, 5);
        int difference = calc.subtract(12, 5);
        int product = calc.multiply(12, 5);
        double quotient = calc.divide(12, 5);
        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + difference);
        System.out.println("Добуток: " + product);
        System.out.println("Частка: " + quotient);
        calc.divide(7, 0);
    }

    // Завдання 18
    private static void task18() {
        Circle circle = new Circle();
        circle.radius = 5.0;
        System.out.println("Площа: " + circle.getArea());
        System.out.println("Довжина кола: " + circle.getCircumference());
    }

    // Завдання 19
    private static void task19() {
        TemperatureConverter converter = new TemperatureConverter();
        double fahrenheit = converter.celsiusToFahrenheit(25);
        double backToCelsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println("25°C = " + fahrenheit + "°F");
        System.out.println(fahrenheit + "°F = " + backToCelsius + "°C");
    }

    // Завдання 20
    private static void task20() {
        NumberChecker checker = new NumberChecker();
        int[] numbers = {7, 12, -5};
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            System.out.println(n + ": парне = " + checker.isEven(n)
                    + ", додатне = " + checker.isPositive(n)
                    + ", просте = " + checker.isPrime(n));
        }
    }

    // Завдання 21
    private static void task21() {
        CurrencyExchange exchange = new CurrencyExchange();
        exchange.usdRate = 41.5;
        System.out.println("10000 грн = " + fmt(exchange.toUSD(10000)) + " USD");
        System.out.println("100 USD = " + fmt(exchange.toUAH(100)) + " грн");
    }

    // Завдання 22
    private static void task22() {
        Employee employee = new Employee();
        employee.name = "Олег";
        employee.baseSalary = 30000;
        employee.bonusPercentage = 15;
        System.out.println("Зарплата з бонусом: " + fmt(employee.calculateTotalSalary()) + " грн");
        System.out.println("Податки (19.5%): " + fmt(employee.calculateTax()) + " грн");
    }

    // Завдання 23
    private static void task23() {
        TextFormatter formatter = new TextFormatter();
        String word = "Програмування";
        System.out.println(formatter.formatTitle(word));
        System.out.println("Кількість голосних у слові \"" + word + "\": " + formatter.countVowels(word));
    }

    // Завдання 24
    private static void task24() {
        Triangle triangle = new Triangle();
        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;
        System.out.println("Трикутник існує: " + triangle.isValid());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площа: " + triangle.getArea());
    }

    // ===== Блок 4: Модифікатори доступу, this та валідація =====

    // Завдання 25
    private static void task25() {
        SecretVault vault = new SecretVault();
        // vault.secretCode = "hacked"; // Помилка компіляції: secretCode has private access in SecretVault
        System.out.println("Код \"hacked\" вірний: " + vault.verifyCode("hacked"));
        System.out.println("Код \"Pass123\" вірний: " + vault.verifyCode("Pass123"));
    }

    // Завдання 26
    private static void task26() {
        UserAccount account = new UserAccount();
        account.setCredentials("admin", "qwerty");
        System.out.println("Вхід з правильними даними: " + account.login("admin", "qwerty"));
        System.out.println("Вхід з неправильним паролем: " + account.login("admin", "1234"));
        account.changePassword("wrong", "newPass");
        account.changePassword("qwerty", "newPass");
        System.out.println("Вхід зі старим паролем: " + account.login("admin", "qwerty"));
        System.out.println("Вхід з новим паролем: " + account.login("admin", "newPass"));
    }

    // Завдання 27
    private static void task27() {
        BankAccount account = new BankAccount();
        account.openAccount("UA123456", 1000);
        account.deposit(500);
        account.deposit(-100);
        boolean ok = account.withdraw(2000);
        System.out.println("Зняття 2000 вдалося: " + ok);
        ok = account.withdraw(300);
        System.out.println("Зняття 300 вдалося: " + ok);
        System.out.println("Залишок: " + fmt(account.getBalance()) + " грн");
    }

    // Завдання 28
    private static void task28() {
        Thermometer thermometer = new Thermometer();
        thermometer.setTemperature(25);
        System.out.println("Температура: " + thermometer.getTemperature());
        thermometer.setTemperature(-300);
        System.out.println("Температура: " + thermometer.getTemperature());
    }

    // Завдання 29
    private static void task29() {
        CarSpeedometer speedometer = new CarSpeedometer();
        speedometer.accelerate(100);
        System.out.println("Швидкість: " + speedometer.getSpeed());
        speedometer.accelerate(200);
        System.out.println("Швидкість: " + speedometer.getSpeed());
        speedometer.brake(100);
        System.out.println("Швидкість: " + speedometer.getSpeed());
        speedometer.brake(300);
        System.out.println("Швидкість: " + speedometer.getSpeed());
    }

    // Завдання 30
    private static void task30() {
        Person first = new Person();
        first.setName("Олексій");
        first.setAge(19);
        Person second = new Person();
        second.setName("Марія");
        second.setAge(130);
        second.setAge(21);
        first.printSummary();
        second.printSummary();
    }

    // Завдання 31
    private static void task31() {
        DiscountCard card = new DiscountCard();
        card.setOwnerName("Андрій");
        card.addPurchase(3000);
        card.printCardInfo();
        card.addPurchase(4000);
        card.printCardInfo();
        card.addPurchase(5000);
        card.printCardInfo();
    }

    // Завдання 32
    private static void task32() {
        SmartDoorLock lock = new SmartDoorLock();
        lock.enterPin(1111);
        lock.enterPin(2222);
        lock.enterPin(3333);
        lock.enterPin(1234);
    }

    // ===== Блок 5: Масиви всередині класів =====

    // Завдання 33
    private static void task33() {
        GradeBook gradeBook = new GradeBook();
        gradeBook.setData("Денис", new int[]{85, 92, 78, 96, 65});
        System.out.println("Середній бал: " + fmt(gradeBook.getAverage()));
        System.out.println("Найвища оцінка: " + gradeBook.getHighestGrade());
        System.out.println("Найнижча оцінка: " + gradeBook.getLowestGrade());
    }

    // Завдання 34
    private static void task34() {
        ArrayStats stats = new ArrayStats();
        stats.setNumbers(new int[]{4, 7, 12, 3, 18, 25, 8, 9, 14, 1});
        System.out.println("Парних: " + stats.countEvens());
        System.out.println("Непарних: " + stats.countOdds());
        System.out.println("Сума: " + stats.calculateSum());
    }

    // Завдання 35
    private static void task35() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(120.0);
        cart.addItem(85.5);
        cart.addItem(200.0);
        cart.printReceipt();
        System.out.println("Разом: " + fmt(cart.getTotalCost()) + " грн");
        cart.applyDiscount(15);
        cart.printReceipt();
        System.out.println("Разом зі знижкою: " + fmt(cart.getTotalCost()) + " грн");
    }

    // Завдання 36
    private static void task36() {
        TemperatureTracker tracker = new TemperatureTracker();
        tracker.setTemps(new double[]{18.5, 21.0, 23.4, 19.8, 25.1, 27.3, 22.0});
        System.out.println("Днів із температурою вище 22: " + tracker.countDaysAbove(22));
        tracker.printWeeklyReport();
    }

    // Завдання 37
    private static void task37() {
        ArraySearcher searcher = new ArraySearcher();
        searcher.setData(new int[]{5, 12, 7, 19, 3});
        System.out.println("Містить 19: " + searcher.contains(19));
        System.out.println("Індекс 7: " + searcher.findIndex(7));
        System.out.println("Містить 100: " + searcher.contains(100));
        System.out.println("Індекс 100: " + searcher.findIndex(100));
    }

    // Завдання 38
    private static void task38() {
        Vector3D vector = new Vector3D();
        vector.setCoords(2, 3, 6);
        System.out.println("Довжина вектора: " + vector.getMagnitude());
        vector.multiplyByScalar(2);
        vector.printVector();
    }

    // Завдання 39
    private static void task39() {
        Matrix2D matrix = new Matrix2D();
        matrix.setGrid(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        matrix.printMatrix();
        System.out.println("Сума всіх елементів: " + matrix.getTotalSum());
        System.out.println("Сума рядка 1: " + matrix.getRowSum(1));
    }

    // Завдання 40
    private static void task40() {
        MatrixDiagonals diagonals = new MatrixDiagonals();
        diagonals.setMatrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        System.out.println("Головна діагональ: " + diagonals.getMainDiagonalSum());
        System.out.println("Побічна діагональ: " + diagonals.getAntiDiagonalSum());
        System.out.println("Суми рівні (симетричні): " + diagonals.isDiagonalSymmetric());
    }
}

// ===================== Класи завдань =====================

// --- Блок 1 ---

class Student {
    public String name;
    public int age;
    public double gpa;
}

class Car {
    public String brand;
    public String model;
    public int year;
    public int speed;
}

class Book {
    public String title;
    public String author;
    public int pages;
    public boolean isRead;
}

class Rectangle {
    public double width;
    public double height;
}

class Product {
    public String name;
    public double price;
    public int quantity;
}

class Smartphone {
    public String model;
    public int batteryLevel;
    public boolean isTurnedOn;
}

class Point2D {
    public double x;
    public double y;
}

// --- Блок 2 ---

class Greeter {
    public void sayHello() {
        System.out.println("Привіт усім!");
    }

    public void sayHelloTo(String name) {
        System.out.println("Привіт, " + name + "! Раді тебе бачити.");
    }
}

class Animal {
    public String species;
    public String name;

    public void makeSound() {
        System.out.println(name + " видає звук!");
    }

    public void printInfo() {
        System.out.println("Вид: " + species + ", кличка: " + name);
    }
}

class Counter {
    public int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void reset() {
        count = 0;
    }

    public void printCount() {
        System.out.println("Лічильник: " + count);
    }
}

class TrafficLight {
    public String currentColor;

    public void changeColor(String newColor) {
        currentColor = newColor;
    }

    public void showSignal() {
        if (currentColor.equals("Червоний")) {
            System.out.println(currentColor + ": Стій!");
        } else if (currentColor.equals("Жовтий")) {
            System.out.println(currentColor + ": Увага!");
        } else if (currentColor.equals("Зелений")) {
            System.out.println(currentColor + ": Їдь!");
        } else {
            System.out.println("Невідомий колір світлофора");
        }
    }
}

class Player {
    public String nickname;
    public int health = 100;

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(nickname + " отримав " + damage + " шкоди. Здоров'я: " + health);
        if (health == 0) {
            System.out.println(nickname + " загинув!");
        }
    }

    public void heal(int amount) {
        health += amount;
        if (health > 100) {
            health = 100;
        }
        System.out.println(nickname + " вилікувався на " + amount + ". Здоров'я: " + health);
    }
}

class Lamp {
    public boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void toggle() {
        isOn = !isOn;
    }

    public void status() {
        if (isOn) {
            System.out.println("Лампа світить");
        } else {
            System.out.println("Лампа вимкнена");
        }
    }
}

class Stopwatch {
    public int seconds;

    public void tick() {
        seconds++;
    }

    public void addSeconds(int s) {
        seconds += s;
    }

    public void displayTime() {
        System.out.println(String.format("%02d:%02d", seconds / 60, seconds % 60));
    }
}

class Printer {
    public String model;
    public int paperCount;

    public void printDocument(String title, int pages) {
        if (paperCount >= pages) {
            paperCount -= pages;
            System.out.println("Документ \"" + title + "\" надруковано (" + pages
                    + " стор.). Залишок паперу: " + paperCount);
        } else {
            System.out.println("Помилка: Недостатньо паперу в принтері " + model + "!");
        }
    }
}

// --- Блок 3 ---

class SimpleCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Помилка: ділення на нуль!");
            return 0.0;
        }
        return (double) a / b;
    }
}

class Circle {
    public double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class TemperatureConverter {
    public double celsiusToFahrenheit(double c) {
        return c * 1.8 + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) / 1.8;
    }
}

class NumberChecker {
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public boolean isPositive(int n) {
        return n > 0;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }
}

class CurrencyExchange {
    public double usdRate;

    public double toUSD(double uah) {
        return uah / usdRate;
    }

    public double toUAH(double usd) {
        return usd * usdRate;
    }
}

class Employee {
    public String name;
    public double baseSalary;
    public double bonusPercentage;

    public double calculateTotalSalary() {
        return baseSalary * (1 + bonusPercentage / 100);
    }

    public double calculateTax() {
        return calculateTotalSalary() * 0.195;
    }
}

class TextFormatter {
    public String formatTitle(String text) {
        return "*** " + text.toUpperCase() + " ***";
    }

    public int countVowels(String text) {
        String vowels = "аоуеиіяюєїaeiou";
        String lower = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < lower.length(); i++) {
            if (vowels.indexOf(lower.charAt(i)) >= 0) {
                count++;
            }
        }
        return count;
    }
}

class Triangle {
    public double a;
    public double b;
    public double c;

    public boolean isValid() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        if (!isValid()) {
            return 0.0;
        }
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

// --- Блок 4 ---

class SecretVault {
    private String secretCode = "Pass123";

    public boolean verifyCode(String attempt) {
        return secretCode.equals(attempt);
    }
}

class UserAccount {
    private String username;
    private String password;

    public void setCredentials(String u, String p) {
        this.username = u;
        this.password = p;
    }

    public boolean login(String enteredUser, String enteredPass) {
        return username.equals(enteredUser) && password.equals(enteredPass);
    }

    public void changePassword(String oldPass, String newPass) {
        if (password.equals(oldPass)) {
            password = newPass;
            System.out.println("Пароль успішно змінено.");
        } else {
            System.out.println("Помилка: старий пароль невірний.");
        }
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public void openAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Рахунок " + accountNumber + " поповнено на " + amount);
        } else {
            System.out.println("Помилка: сума поповнення має бути додатною.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Відмова: недостатньо коштів на рахунку " + accountNumber);
            return false;
        }
        balance -= amount;
        System.out.println("Знято " + amount + " з рахунку " + accountNumber);
        return true;
    }

    public double getBalance() {
        return balance;
    }
}

class Thermometer {
    private double temperature;

    public void setTemperature(double t) {
        if (t < -273.15) {
            System.out.println("Помилка: температура нижче абсолютного нуля!");
        } else {
            this.temperature = t;
        }
    }

    public double getTemperature() {
        return temperature;
    }
}

class CarSpeedometer {
    private int speed = 0;

    public void accelerate(int delta) {
        speed += delta;
        if (speed > 240) {
            speed = 240;
        }
    }

    public void brake(int delta) {
        speed -= delta;
        if (speed < 0) {
            speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Помилка: некоректний вік " + age);
        }
    }

    public void printSummary() {
        System.out.println(name + ", вік: " + age);
    }
}

class DiscountCard {
    private String ownerName;
    private double totalSpent;
    private int discountPercent = 1;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addPurchase(double cost) {
        totalSpent += cost;
        if (totalSpent >= 10000) {
            discountPercent = 10;
        } else if (totalSpent >= 5000) {
            discountPercent = 5;
        } else {
            discountPercent = 1;
        }
    }

    public void printCardInfo() {
        System.out.println("Власник: " + ownerName + ", витрачено: " + totalSpent
                + " грн, знижка: " + discountPercent + "%");
    }
}

class SmartDoorLock {
    private int pinCode = 1234;
    private boolean isLocked = true;
    private int failedAttempts = 0;

    public void enterPin(int enteredPin) {
        if (failedAttempts >= 3) {
            System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
        } else if (enteredPin == pinCode) {
            isLocked = false;
            failedAttempts = 0;
            System.out.println("PIN вірний. Замок відчинено.");
        } else {
            failedAttempts++;
            System.out.println("Невірний PIN. Невдалих спроб: " + failedAttempts + " з 3");
        }
    }
}

// --- Блок 5 ---

class GradeBook {
    private String studentName;
    private int[] grades;

    public void setData(String name, int[] g) {
        this.studentName = name;
        this.grades = g;
    }

    public double getAverage() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public int getHighestGrade() {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    public int getLowestGrade() {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }
}

class ArrayStats {
    private int[] numbers;

    public void setNumbers(int[] nums) {
        this.numbers = nums;
    }

    public int countEvens() {
        int count = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countOdds() {
        return numbers.length - countEvens();
    }

    public int calculateSum() {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}

class ShoppingCart {
    private double[] itemPrices = new double[10];
    private int count = 0;

    public void addItem(double price) {
        if (count < itemPrices.length) {
            itemPrices[count] = price;
            count++;
        } else {
            System.out.println("Кошик заповнений!");
        }
    }

    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += itemPrices[i];
        }
        return total;
    }

    public void applyDiscount(double percent) {
        for (int i = 0; i < count; i++) {
            itemPrices[i] = itemPrices[i] * (1 - percent / 100);
        }
    }

    public void printReceipt() {
        System.out.println("--- ЧЕК ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + String.format(Locale.US, "%.2f", itemPrices[i]) + " грн");
        }
    }
}

class TemperatureTracker {
    private double[] dailyTemps = new double[7];

    public void setTemps(double[] temps) {
        this.dailyTemps = temps;
    }

    public int countDaysAbove(double threshold) {
        int count = 0;
        for (double t : dailyTemps) {
            if (t > threshold) {
                count++;
            }
        }
        return count;
    }

    public void printWeeklyReport() {
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        int hottestIndex = 0;
        for (int i = 0; i < dailyTemps.length; i++) {
            System.out.println(days[i] + ": " + dailyTemps[i] + "°C");
            if (dailyTemps[i] > dailyTemps[hottestIndex]) {
                hottestIndex = i;
            }
        }
        System.out.println("Найтепліший день: " + days[hottestIndex] + " (" + dailyTemps[hottestIndex] + "°C)");
    }
}

class ArraySearcher {
    private int[] data;

    public void setData(int[] data) {
        this.data = data;
    }

    public boolean contains(int target) {
        return findIndex(target) != -1;
    }

    public int findIndex(int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

class Vector3D {
    private double[] coords = new double[3];

    public void setCoords(double x, double y, double z) {
        coords[0] = x;
        coords[1] = y;
        coords[2] = z;
    }

    public double getMagnitude() {
        return Math.sqrt(coords[0] * coords[0] + coords[1] * coords[1] + coords[2] * coords[2]);
    }

    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < coords.length; i++) {
            coords[i] *= scalar;
        }
    }

    public void printVector() {
        System.out.println("(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ")");
    }
}

class Matrix2D {
    private int[][] grid;

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void printMatrix() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public int getTotalSum() {
        int sum = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                sum += grid[row][col];
            }
        }
        return sum;
    }

    public int getRowSum(int rowIndex) {
        int sum = 0;
        for (int col = 0; col < grid[rowIndex].length; col++) {
            sum += grid[rowIndex][col];
        }
        return sum;
    }
}

class MatrixDiagonals {
    private int[][] matrix;

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getMainDiagonalSum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public int getAntiDiagonalSum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    public boolean isDiagonalSymmetric() {
        return getMainDiagonalSum() == getAntiDiagonalSum();
    }
}
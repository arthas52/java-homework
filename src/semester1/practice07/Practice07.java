package semester1.practice07;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Practice07 {

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

    static String fmt(double value) {
        return String.format(Locale.US, "%.2f", value);
    }

    // ===== Блок 1: Поля класу та базові конструктори =====

    // Завдання 1
    private static void task1() {
        Book book1 = new Book();
        Book book2 = new Book("Кобзар", "Тарас Шевченко", 1840, 250.0);
        Book book3 = new Book("Тест", "Автор", -5, -100.0);
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }

    // Завдання 2
    private static void task2() {
        Student valid = new Student("Олена", 19, 4.8);
        Student invalid = new Student("Максим", 10, 6.5);
        Student regular = new Student("Ірина", 20, 3.9);
        valid.printStudent();
        invalid.printStudent();
        regular.printStudent();
    }

    // Завдання 3
    private static void task3() {
        BankAccount account = new BankAccount("UA12345", "Іван Петренко", 1000);
        account.printAccount();
        account.deposit(500);
        boolean ok = account.withdraw(5000);
        System.out.println("Зняття 5000 вдалося: " + ok);
        ok = account.withdraw(300);
        System.out.println("Зняття 300 вдалося: " + ok);
        account.printAccount();
    }

    // Завдання 4
    private static void task4() {
        Point2D origin = new Point2D();
        Point2D point = new Point2D(3, 4);
        origin.printPoint();
        point.printPoint();
        System.out.println("Відстань до початку координат: " + point.distanceToOrigin());
        System.out.println("Відстань від (0; 0) до (6; 8): " + origin.distanceTo(6, 8));
        System.out.println("Відстань від (3; 4) до (6; 8): " + point.distanceTo(6, 8));
    }

    // Завдання 5
    private static void task5() {
        Product product = new Product("Ноутбук", 25000, 4, "Електроніка");
        product.printProduct();
        System.out.println("Вартість партії: " + fmt(product.getTotalValue()) + " грн");
        product.applyDiscount(20);
        product.printProduct();
        System.out.println("Вартість партії після знижки: " + fmt(product.getTotalValue()) + " грн");
    }

    // Завдання 6
    private static void task6() {
        Time time = new Time(23, 59, 58);
        for (int i = 0; i < 4; i++) {
            System.out.println(time.toUniversalString() + "  |  " + time.toStandardString());
            time.tick();
        }
        Time invalid = new Time(30, 70, 99);
        System.out.println("Некоректний час: " + invalid.toUniversalString());
    }

    // Завдання 7
    private static void task7() {
        Rectangle unit = new Rectangle();
        Rectangle square = new Rectangle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Одиничний: S = " + unit.getArea() + ", P = " + unit.getPerimeter()
                + ", квадрат: " + unit.isSquare());
        System.out.println("Квадрат: S = " + square.getArea() + ", P = " + square.getPerimeter()
                + ", квадрат: " + square.isSquare());
        System.out.println("Прямокутник: S = " + rectangle.getArea() + ", P = " + rectangle.getPerimeter()
                + ", квадрат: " + rectangle.isSquare());
    }

    // Завдання 8
    private static void task8() {
        Employee employee = new Employee(101, "Олег Коваль", "Розробник", 30000);
        employee.printBadge();
        employee.raiseSalary(15);
        employee.printBadge();
        System.out.println("Річний дохід: " + fmt(employee.getAnnualSalary()) + " грн");
    }

    // ===== Блок 2: this та this(...) =====

    // Завдання 9
    private static void task9() {
        User master = new User("alex", "alex@mail.com", "ADMIN", false);
        User withEmail = new User("maria", "maria@mail.com");
        User loginOnly = new User("petro");
        User guest = new User();
        master.printProfile();
        withEmail.printProfile();
        loginOnly.printProfile();
        guest.printProfile();
    }

    // Завдання 10
    private static void task10() {
        Fraction first = new Fraction(8, 12);
        Fraction whole = new Fraction(5);
        Fraction empty = new Fraction();
        Fraction negative = new Fraction(3, -6);
        Fraction[] fractions = {first, whole, empty, negative};
        for (int i = 0; i < fractions.length; i++) {
            fractions[i].print();
            System.out.println(" = " + fractions[i].toDouble());
        }
        new Fraction(1, 0).print();
        System.out.println();
    }

    // Завдання 11
    private static void task11() {
        Car newCar = new Car("Toyota", "Camry", 2024);
        Car defaultCar = new Car();
        newCar.drive(50);
        newCar.startEngine();
        newCar.drive(150);
        newCar.stopEngine();
        newCar.printCar();
        defaultCar.printCar();
    }

    // Завдання 12
    private static void task12() {
        SmartBulb master = new SmartBulb(80, 3000, true);
        SmartBulb brightnessOnly = new SmartBulb(30);
        SmartBulb defaultBulb = new SmartBulb();
        SmartBulb outOfRange = new SmartBulb(150, 9000, true);
        master.printStatus();
        brightnessOnly.printStatus();
        defaultBulb.printStatus();
        outOfRange.printStatus();
    }

    // Завдання 13
    private static void task13() {
        String sql = new QueryBuilder("users").select("id, name, email").where("age >= 18").build();
        System.out.println(sql);
        System.out.println(new QueryBuilder("orders").build());
    }

    // Завдання 14
    private static void task14() {
        CoffeeOrder full = new CoffeeOrder("Лате", "Large", 2, true);
        CoffeeOrder withSize = new CoffeeOrder("Капучино", "Small");
        CoffeeOrder basic = new CoffeeOrder("Еспресо");
        full.printReceipt();
        withSize.printReceipt();
        basic.printReceipt();
    }

    // Завдання 15
    private static void task15() {
        Box cube = new Box(10, "Картон");
        Box copy = new Box(cube);
        Box custom = new Box(10, 20, 5, "Пластик");
        cube.printBox();
        copy.printBox();
        custom.printBox();
        System.out.println("Об'єми куба і копії рівні: " + (cube.getVolume() == copy.getVolume()));
        System.out.println("Це той самий об'єкт (==): " + (cube == copy));
    }

    // Завдання 16
    private static void task16() {
        FlightTicket ticket = new FlightTicket("T-1001", "Іван Петренко", "PS101", "Київ", "Львів");
        ticket.printBoardingPass();
        ticket.assignSeat("12A");
        ticket.printBoardingPass();
    }

    // ===== Блок 3: Перевантаження методів =====

    // Завдання 17
    private static void task17() {
        MathOperations ops = new MathOperations();
        System.out.println("add(int, int): " + ops.add(2, 3));
        System.out.println("add(double, double): " + ops.add(2.5, 3.5));
        System.out.println("add(int, int, int): " + ops.add(1, 2, 3));
        System.out.println("add(String, String): " + ops.add("Привіт", "світе"));
        System.out.println("multiply(int, int): " + ops.multiply(4, 5));
        System.out.println("multiply(double, double): " + ops.multiply(1.5, 4.0));
        System.out.println("multiply(String, int): " + ops.multiply("ab", 3));
    }

    // Завдання 18
    private static void task18() {
        DocumentPrinter printer = new DocumentPrinter();
        printer.print("Звичайний рядок");
        printer.print(123);
        printer.print(3.14159265, 3);
        printer.print(new String[]{"перший", "другий", "третій"});
        printer.print("великими літерами", true);
    }

    // Завдання 19
    private static void task19() {
        AreaCalculator calc = new AreaCalculator();
        System.out.println("Квадрат (сторона 4): " + calc.calculateArea(4.0));
        System.out.println("Прямокутник (3 x 5): " + calc.calculateArea(3.0, 5.0));
        System.out.println("Круг (радіус 2): " + calc.calculateArea(2.0, true));
        System.out.println("Трикутник (3, 4, 5): " + calc.calculateArea(3.0, 4.0, 5.0));
        System.out.println("Трапеція (основи 4 і 6, висота 5): " + calc.calculateArea(4.0, 6.0, 5.0, true));
    }

    // Завдання 20
    private static void task20() {
        Logger logger = new Logger();
        logger.log("Програму запущено");
        logger.log("WARN", "Мало вільної пам'яті");
        logger.log("ERROR", 404, "Ресурс не знайдено");
        logger.log("DB", "Запит виконано", true);
    }

    // Завдання 21
    private static void task21() {
        ArraySearcher searcher = new ArraySearcher();
        int[] numbers = {5, 8, 12, 8, 20};
        String[] words = {"Java", "Python", "Kotlin"};
        System.out.println("find(8): " + searcher.find(numbers, 8));
        System.out.println("find(8) з індексу 2: " + searcher.find(numbers, 8, 2));
        System.out.println("find(100): " + searcher.find(numbers, 100));
        System.out.println("find(\"Python\"): " + searcher.find(words, "Python"));
        System.out.println("find(\"python\"): " + searcher.find(words, "python"));
        System.out.println("find(\"python\", ignoreCase): " + searcher.find(words, "python", true));
    }

    // Завдання 22
    private static void task22() {
        DateService date = new DateService(15, 3, 2024);
        date.printDate();
        date.add(20);
        date.printDate();
        date.add(0, 3);
        date.printDate();
        date.add(10, 2, 1);
        date.printDate();
    }

    // Завдання 23
    private static void task23() {
        SalaryCalculator calc = new SalaryCalculator();
        System.out.println("Лише ставка: " + fmt(calc.calculate(20000.0)));
        System.out.println("Ставка + премія 3000: " + fmt(calc.calculate(20000.0, 3000.0)));
        System.out.println("Ставка + 10% бонус, з податком: " + fmt(calc.calculate(20000.0, 10.0, true)));
        System.out.println("Ставка + 10% бонус, без податку: " + fmt(calc.calculate(20000.0, 10.0, false)));
        System.out.println("Ставка + 12 год понаднормових по 150: " + fmt(calc.calculate(20000.0, 12, 150.0)));
    }

    // Завдання 24
    private static void task24() {
        ArrayFilter filter = new ArrayFilter();
        int[] data = {12, 5, 8, 19, 24, 3, 16};
        System.out.println("Початковий масив: " + Arrays.toString(data));
        System.out.println("Більші за 10: " + Arrays.toString(filter.filter(data, 10)));
        System.out.println("У діапазоні [5; 16]: " + Arrays.toString(filter.filter(data, 5, 16)));
        System.out.println("Парні: " + Arrays.toString(filter.filter(data, true)));
        System.out.println("Непарні: " + Arrays.toString(filter.filter(data, false)));
    }

    // ===== Блок 4: static =====

    // Завдання 25
    private static void task25() {
        UserAccount.resetIdSequence(1001);
        UserAccount a = new UserAccount("olena", "olena@mail.com");
        UserAccount b = new UserAccount("maksym", "maksym@mail.com");
        UserAccount c = new UserAccount("iryna", "iryna@mail.com");
        a.print();
        b.print();
        c.print();
        System.out.println("Наступний вільний ID: " + UserAccount.getNextAvailableId());
    }

    // Завдання 26
    private static void task26() {
        for (int i = 1; i <= 6; i++) {
            boolean connected = ServerConfig.connect();
            System.out.println("Користувач " + i + (connected ? ": підключено" : ": ВІДМОВА, ліміт вичерпано"));
        }
        ServerConfig.printServerStatus();
        for (int i = 0; i < ServerConfig.MAX_CONNECTIONS; i++) {
            ServerConfig.disconnect();
        }
    }

    // Завдання 27
    private static void task27() {
        System.out.println("PI = " + MathUtils.PI + ", E = " + MathUtils.E);
        System.out.println("5! = " + MathUtils.factorial(5));
        System.out.println("2^10 = " + MathUtils.power(2, 10));
        System.out.println("2^-2 = " + MathUtils.power(2, -2));
        System.out.println("НСД(48, 18) = " + MathUtils.gcd(48, 18));
        System.out.println("clamp(150, 0, 100) = " + MathUtils.clamp(150, 0, 100));
        System.out.println("clamp(-5, 0, 100) = " + MathUtils.clamp(-5, 0, 100));
    }

    // Завдання 28
    private static void task28() {
        CurrencyExchange.updateRates(41.5, 45.2);
        System.out.println("10000 грн = " + fmt(CurrencyExchange.uahToUsd(10000)) + " USD");
        System.out.println("100 USD = " + fmt(CurrencyExchange.usdToUah(100)) + " грн");
        System.out.println("100 EUR = " + fmt(CurrencyExchange.eurToUah(100)) + " грн");
        CurrencyExchange.updateRates(42.0, 46.0);
        System.out.println("Після оновлення курсів:");
        System.out.println("100 USD = " + fmt(CurrencyExchange.usdToUah(100)) + " грн");
        System.out.println("100 EUR = " + fmt(CurrencyExchange.eurToUah(100)) + " грн");
        CurrencyExchange.updateRates(-1, 0);
    }

    // Завдання 29
    private static void task29() {
        FleetCar.resetStatistics();
        FleetCar car1 = new FleetCar("VIN001", 12000);
        FleetCar car2 = new FleetCar("VIN002", 5000);
        FleetCar car3 = new FleetCar("VIN003", 0);
        car1.addTrip(300);
        car2.addTrip(150);
        car3.addTrip(80);
        car3.addTrip(20);
        FleetCar.printFleetSummary();
    }

    // Завдання 30
    private static void task30() {
        System.out.println("\"Рівно\" - паліндром: " + StringUtils.isPalindrome("Рівно"));
        System.out.println("\"А роза упала на лапу Азора\" - паліндром: "
                + StringUtils.isPalindrome("А роза упала на лапу Азора"));
        System.out.println("Reverse \"Java\": " + StringUtils.reverse("Java"));
        System.out.println("Голосних у \"Програмування\": " + StringUtils.countVowels("Програмування"));
        System.out.println("Маска картки: " + StringUtils.maskCardNumber("4276 1234 5678 9012"));
    }

    // Завдання 31
    private static void task31() {
        GameSession[] sessions = new GameSession[4];
        for (int i = 0; i < sessions.length; i++) {
            sessions[i] = GameSession.createSession("Player" + (i + 1));
            if (sessions[i] != null) {
                System.out.println("Створено сесію: " + sessions[i].getSessionToken());
            }
        }
        System.out.println("Четверта сесія дорівнює null: " + (sessions[3] == null));
        for (int i = 0; i < sessions.length; i++) {
            if (sessions[i] != null) {
                sessions[i].terminate();
            }
        }
        GameSession again = GameSession.createSession("Player5");
        System.out.println("Після завершення сесій нова створюється: " + (again != null));
        again.terminate();
    }

    // Завдання 32
    private static void task32() {
        System.out.println("Енергія спокою 1 г матерії: " + PhysicsEngine.restEnergy(0.001) + " Дж");
        System.out.println("Відстань падіння за 5 с: " + fmt(PhysicsEngine.freeFallDistance(5)) + " м");
        System.out.println("Кінетична енергія (10 кг, 20 м/с): " + PhysicsEngine.kineticEnergy(10, 20) + " Дж");
    }

    // ===== Блок 5: Взаємодія об'єктів =====

    // Завдання 33
    private static void task33() {
        LineSegment segment = new LineSegment(0, 0, 6, 8);
        segment.printSegment();
        System.out.println("Довжина: " + segment.getLength());
        Point mid = segment.getMidPoint();
        System.out.println("Середина: (" + mid.getX() + "; " + mid.getY() + ")");
        LineSegment fromPoints = new LineSegment(new Point(1, 1), new Point(4, 5));
        System.out.println("Довжина другого відрізка: " + fromPoints.getLength());
    }

    // Завдання 34
    private static void task34() {
        ClientAccount ivan = new ClientAccount("UA001", "Іван", 10000);
        ClientAccount maria = new ClientAccount("UA002", "Марія", 2000);
        boolean ok = ivan.transferTo(maria, 3500);
        System.out.println("Переказ 3500 успішний: " + ok);
        ok = ivan.transferTo(ivan, 100);
        System.out.println("Переказ самому собі успішний: " + ok);
        ok = ivan.transferTo(maria, 100000);
        System.out.println("Переказ 100000 успішний: " + ok);
        ivan.printAccount();
        maria.printAccount();
    }

    // Завдання 35
    private static void task35() {
        Engine engine = new Engine("ENG-2024-01", 250);
        CarWithEngine car = new CarWithEngine("BMW", "M3", engine);
        car.printSpecs();
        car.startCar();
        System.out.println("Двигун працює: " + engine.isRunning());
        car.turnOff();
        System.out.println("Двигун працює: " + engine.isRunning());
    }

    // Завдання 36
    private static void task36() {
        Processor cpu = new Processor("Intel Core i5", 3.4, 9000);
        Memory ram = new Memory(16, 3200, 2500);
        Computer computer = new Computer("Домашній ПК", cpu, ram, 3000);
        computer.printSpecs();
        System.out.println("Вартість: " + fmt(computer.calculateTotalPrice()) + " грн");
        computer.upgradeMemory(new Memory(32, 3600, 5000));
        computer.printSpecs();
        System.out.println("Нова вартість: " + fmt(computer.calculateTotalPrice()) + " грн");
    }

    // Завдання 37
    private static void task37() {
        Hero knight = new Hero("Лицар", 100, 25, 10);
        Hero orc = new Hero("Орк", 120, 20, 5);
        int round = 1;
        while (knight.isAlive() && orc.isAlive()) {
            System.out.println("--- Раунд " + round + " ---");
            knight.attack(orc);
            if (orc.isAlive()) {
                orc.attack(knight);
            }
            round++;
        }
        if (knight.isAlive()) {
            System.out.println("Переможець: " + knight.getName());
        } else {
            System.out.println("Переможець: " + orc.getName());
        }
    }

    // Завдання 38
    private static void task38() {
        StoreProduct keyboard = new StoreProduct(1, "Клавіатура", 1200);
        StoreProduct mouse = new StoreProduct(2, "Миша", 650);
        StoreProduct monitor = new StoreProduct(3, "Монітор", 8500);

        Customer rich = new Customer("Олег", 20000);
        Order order1 = new Order(rich, 5);
        order1.addProduct(keyboard);
        order1.addProduct(mouse);
        order1.addProduct(monitor);
        order1.checkout();

        Customer poor = new Customer("Андрій", 1000);
        Order order2 = new Order(poor, 5);
        order2.addProduct(keyboard);
        order2.addProduct(monitor);
        order2.checkout();
    }

    // Завдання 39
    private static void task39() {
        Vector3D i = new Vector3D(1, 0, 0);
        Vector3D j = new Vector3D(0, 1, 0);
        Vector3D sum = i.add(j);
        Vector3D cross = i.crossProduct(j);
        System.out.println("Сума: " + sum);
        System.out.println("Скалярний добуток: " + i.dotProduct(j));
        System.out.println("Векторний добуток: " + cross);
        System.out.println("Ортогональні: " + i.isOrthogonalTo(j));
        System.out.println("Рівні: " + i.isEqualTo(j));
        System.out.println("Рівні копії: " + i.isEqualTo(new Vector3D(1, 0, 0)));
        System.out.println("Нульовий вектор: " + new Vector3D());
    }

    // Завдання 40
    private static void task40() {
        LibraryCatalog catalog = new LibraryCatalog(5);
        catalog.addBook(new BookItem("111", "Кобзар", "Тарас Шевченко"));
        catalog.addBook(new BookItem("222", "Лісова пісня", "Леся Українка"));
        catalog.addBook(new BookItem("333", "Тіні забутих предків", "Михайло Коцюбинський"));
        catalog.printCatalog();
        System.out.println("Взяти \"Кобзар\": " + catalog.borrowBook("Кобзар"));
        System.out.println("Взяти \"Кобзар\" ще раз: " + catalog.borrowBook("Кобзар"));
        System.out.println("Взяти \"Невідома книга\": " + catalog.borrowBook("Невідома книга"));
        catalog.printCatalog();
    }
}

// ===================== Блок 1 =====================

class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    public Book() {
        this.title = "Невідомо";
        this.author = "Невідомий";
        this.year = 2000;
        this.price = 0.0;
    }

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        if (year < 0 || price < 0.0) {
            this.year = 2000;
            this.price = 0.0;
        } else {
            this.year = year;
            this.price = price;
        }
    }

    public void printInfo() {
        System.out.println("\"" + title + "\", " + author + ", " + year + " р., " + Practice07.fmt(price) + " грн");
    }
}

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = (age < 15 || age > 80) ? 18 : age;
        this.gpa = (gpa < 0.0 || gpa > 5.0) ? 0.0 : gpa;
    }

    public boolean isHonorStudent() {
        return gpa >= 4.5;
    }

    public void printStudent() {
        String status = isHonorStudent() ? "Відмінник" : "Звичайний студент";
        System.out.println(name + ", " + age + " р., середній бал: " + gpa + " (" + status + ")");
    }
}

class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = (initialBalance < 0) ? 0.0 : initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void printAccount() {
        System.out.println("Рахунок " + accountNumber + ", власник: " + ownerName
                + ", баланс: " + Practice07.fmt(balance) + " грн");
    }
}

class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceTo(double targetX, double targetY) {
        return Math.sqrt(Math.pow(targetX - x, 2) + Math.pow(targetY - y, 2));
    }

    public void printPoint() {
        System.out.println("Point(" + x + "; " + y + ")");
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = (price < 0) ? 0.0 : price;
        this.quantity = (quantity < 0) ? 0 : quantity;
        this.category = category;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            price = price * (1 - percent / 100);
        }
    }

    public void printProduct() {
        System.out.println("Товар: " + name + " [" + category + "], ціна: " + Practice07.fmt(price)
                + " грн, кількість: " + quantity);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = (hours < 0 || hours > 23) ? 0 : hours;
        this.minutes = (minutes < 0 || minutes > 59) ? 0 : minutes;
        this.seconds = (seconds < 0 || seconds > 59) ? 0 : seconds;
    }

    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0;
                }
            }
        }
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public String toStandardString() {
        int displayHour = (hours % 12 == 0) ? 12 : hours % 12;
        String suffix = (hours < 12) ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", displayHour, minutes, seconds, suffix);
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double size) {
        this.width = size;
        this.height = size;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }
}

class Employee {
    private int id;
    private String fullName;
    private String position;
    private double monthlySalary;

    public Employee(int id, String fullName, String position, double monthlySalary) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.monthlySalary = monthlySalary;
    }

    public void raiseSalary(double percent) {
        monthlySalary = monthlySalary * (1 + percent / 100);
    }

    public double getAnnualSalary() {
        return 12 * monthlySalary;
    }

    public void printBadge() {
        System.out.println("[#" + id + "] " + fullName + ", " + position
                + ", зарплата: " + Practice07.fmt(monthlySalary) + " грн/міс");
    }
}

// ===================== Блок 2 =====================

class User {
    private String login;
    private String email;
    private String role;
    private boolean isActive;

    public User(String login, String email, String role, boolean isActive) {
        this.login = login;
        this.email = email;
        this.role = role;
        this.isActive = isActive;
    }

    public User(String login, String email) {
        this(login, email, "USER", true);
    }

    public User(String login) {
        this(login, login + "@domain.com");
    }

    public User() {
        this("guest");
    }

    public void printProfile() {
        System.out.println("Логін: " + login + ", email: " + email + ", роль: " + role + ", активний: " + isActive);
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            denominator = 1;
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        int divisor = gcd(numerator, denominator);
        if (divisor != 0) {
            numerator /= divisor;
            denominator /= divisor;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int wholeNumber) {
        this(wholeNumber, 1);
    }

    public Fraction() {
        this(0, 1);
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

    public void print() {
        if (denominator == 1) {
            System.out.print(numerator);
        } else {
            System.out.print(numerator + "/" + denominator);
        }
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }
}

class Car {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private boolean engineStarted;

    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public Car(String brand, String model, int year) {
        this(brand, model, year, 0.0);
    }

    public Car() {
        this("Unknown", "Standard", 2024);
    }

    public void startEngine() {
        engineStarted = true;
        System.out.println("Двигун заведено.");
    }

    public void stopEngine() {
        engineStarted = false;
        System.out.println("Двигун заглушено.");
    }

    public void drive(double distance) {
        if (engineStarted) {
            mileage += distance;
            System.out.println("Проїхали " + distance + " км.");
        } else {
            System.out.println("Спершу заведіть двигун!");
        }
    }

    public void printCar() {
        System.out.println(brand + " " + model + " (" + year + "), пробіг: " + mileage + " км");
    }
}

class SmartBulb {
    private int brightness;
    private int colorTemp;
    private boolean isOn;

    public SmartBulb(int brightness, int colorTemp, boolean isOn) {
        this.brightness = Math.max(0, Math.min(100, brightness));
        this.colorTemp = Math.max(2700, Math.min(6500, colorTemp));
        this.isOn = isOn;
    }

    public SmartBulb(int brightness) {
        this(brightness, 4000, true);
    }

    public SmartBulb() {
        this(50);
    }

    public void printStatus() {
        System.out.println("Лампочка: яскравість " + brightness + "%, температура " + colorTemp
                + " K, " + (isOn ? "увімкнена" : "вимкнена"));
    }
}

class QueryBuilder {
    private String table;
    private String fields = "*";
    private String whereClause = "";

    public QueryBuilder(String table) {
        this.table = table;
    }

    public QueryBuilder select(String fields) {
        this.fields = fields;
        return this;
    }

    public QueryBuilder where(String condition) {
        this.whereClause = condition;
        return this;
    }

    public String build() {
        return "SELECT " + fields + " FROM " + table
                + (whereClause.isEmpty() ? "" : " WHERE " + whereClause) + ";";
    }
}

class CoffeeOrder {
    private String type;
    private String size;
    private int sugarCount;
    private boolean withSyrup;
    private double finalPrice;

    public CoffeeOrder(String type, String size, int sugarCount, boolean withSyrup) {
        this.type = type;
        this.size = size;
        this.sugarCount = sugarCount;
        this.withSyrup = withSyrup;
        this.finalPrice = calculatePrice();
    }

    public CoffeeOrder(String type, String size) {
        this(type, size, 0, false);
    }

    public CoffeeOrder(String type) {
        this(type, "Medium");
    }

    private double calculatePrice() {
        double basePrice = switch (type) {
            case "Еспресо" -> 40;
            case "Капучино" -> 55;
            case "Лате" -> 60;
            default -> 0;
        };
        double sizeFactor = switch (size) {
            case "Small" -> 1.0;
            case "Medium" -> 1.3;
            case "Large" -> 1.6;
            default -> 1.0;
        };
        double price = basePrice * sizeFactor;
        if (withSyrup) {
            price += 15;
        }
        return price;
    }

    public void printReceipt() {
        System.out.println("Замовлення: " + type + ", " + size + ", цукор: " + sugarCount
                + ", сироп: " + (withSyrup ? "так" : "ні") + " -> " + Practice07.fmt(finalPrice) + " грн");
    }
}

class Box {
    private double width;
    private double height;
    private double depth;
    private String material;

    public Box(double width, double height, double depth, String material) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.material = material;
    }

    public Box(double size, String material) {
        this(size, size, size, material);
    }

    public Box(Box other) {
        this(other.width, other.height, other.depth, other.material);
    }

    public double getVolume() {
        return width * height * depth;
    }

    public double getSurfaceArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    public void printBox() {
        System.out.println("Коробка " + width + "x" + height + "x" + depth + " (" + material + "), об'єм: "
                + getVolume() + ", площа поверхні: " + getSurfaceArea());
    }
}

class FlightTicket {
    private String ticketNumber;
    private String passengerName;
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private String seatNumber;
    private boolean hasBaggage;

    public FlightTicket(String ticketNumber, String passengerName, String flightNumber,
                        String departureCity, String arrivalCity, String seatNumber, boolean hasBaggage) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.seatNumber = seatNumber;
        this.hasBaggage = hasBaggage;
    }

    public FlightTicket(String ticketNumber, String passengerName, String flightNumber,
                        String departureCity, String arrivalCity) {
        this(ticketNumber, passengerName, flightNumber, departureCity, arrivalCity, "UNASSIGNED", false);
    }

    public void assignSeat(String seat) {
        this.seatNumber = seat;
    }

    public void printBoardingPass() {
        System.out.println("ПОСАДКОВИЙ ТАЛОН " + ticketNumber + ": " + passengerName + ", рейс " + flightNumber
                + ", " + departureCity + " -> " + arrivalCity + ", місце: " + seatNumber
                + ", багаж: " + (hasBaggage ? "є" : "немає"));
    }
}

// ===================== Блок 3 =====================

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + " " + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public String multiply(String text, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += text;
        }
        return result;
    }
}

class DocumentPrinter {
    public void print(String message) {
        System.out.println(message);
    }

    public void print(int number) {
        System.out.println("[INT]: " + number);
    }

    public void print(double number, int decimals) {
        System.out.println(String.format(Locale.US, "%." + decimals + "f", number));
    }

    public void print(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println((i + 1) + ". " + lines[i]);
        }
    }

    public void print(String message, boolean uppercase) {
        System.out.println(uppercase ? message.toUpperCase() : message);
    }
}

class AreaCalculator {
    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double width, double height) {
        return width * height;
    }

    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }

    // Трикутник за формулою Герона
    public double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // Трапеція: сигнатура (double, double, double) уже зайнята трикутником,
    // тому додано четвертий параметр-прапорець, як і в методі для круга
    public double calculateArea(double base1, double base2, double height, boolean isTrapezoid) {
        return (base1 + base2) / 2 * height;
    }
}

class Logger {
    public void log(String message) {
        System.out.println("[INFO] " + message);
    }

    public void log(String level, String message) {
        System.out.println("[" + level + "] " + message);
    }

    public void log(String level, int errorCode, String message) {
        System.out.println("[" + level + "] (Code: " + errorCode + "): " + message);
    }

    public void log(String tag, String message, boolean timestamp) {
        if (timestamp) {
            System.out.println("[" + tag + "] " + message + " (time: " + System.currentTimeMillis() + ")");
        } else {
            System.out.println("[" + tag + "] " + message);
        }
    }
}

class ArraySearcher {
    public int find(int[] arr, int target) {
        return find(arr, target, 0);
    }

    public int find(int[] arr, int target, int startIndex) {
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int find(String[] arr, String target) {
        return find(arr, target, false);
    }

    public int find(String[] arr, String target, boolean ignoreCase) {
        for (int i = 0; i < arr.length; i++) {
            boolean matches = ignoreCase ? arr[i].equalsIgnoreCase(target) : arr[i].equals(target);
            if (matches) {
                return i;
            }
        }
        return -1;
    }
}

class DateService {
    private int day;
    private int month;
    private int year;

    public DateService(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void add(int days) {
        add(days, 0, 0);
    }

    public void add(int days, int months) {
        add(days, months, 0);
    }

    // Спрощено: у кожному місяці 30 днів
    public void add(int days, int months, int years) {
        day += days;
        month += months;
        year += years;
        while (day > 30) {
            day -= 30;
            month++;
        }
        while (month > 12) {
            month -= 12;
            year++;
        }
    }

    public void printDate() {
        System.out.println(String.format("%02d.%02d.%04d", day, month, year));
    }
}

class SalaryCalculator {
    public double calculate(double baseRate) {
        return baseRate;
    }

    public double calculate(double baseRate, double fixedBonus) {
        return baseRate + fixedBonus;
    }

    public double calculate(double baseRate, double bonusPercent, boolean isTaxDeducted) {
        double total = baseRate * (1 + bonusPercent / 100);
        if (isTaxDeducted) {
            total = total * (1 - 0.195);
        }
        return total;
    }

    public double calculate(double baseRate, int overtimeHours, double overtimeHourlyRate) {
        return baseRate + overtimeHours * overtimeHourlyRate;
    }
}

class ArrayFilter {
    public int[] filter(int[] arr, int threshold) {
        return filter(arr, threshold + 1, Integer.MAX_VALUE);
    }

    public int[] filter(int[] arr, int min, int max) {
        int count = 0;
        for (int value : arr) {
            if (value >= min && value <= max) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if (value >= min && value <= max) {
                result[index] = value;
                index++;
            }
        }
        return result;
    }

    public int[] filter(int[] arr, boolean keepEvens) {
        int count = 0;
        for (int value : arr) {
            if ((value % 2 == 0) == keepEvens) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if ((value % 2 == 0) == keepEvens) {
                result[index] = value;
                index++;
            }
        }
        return result;
    }
}

// ===================== Блок 4 =====================

class UserAccount {
    private static int nextId = 1001;

    private int id;
    private String username;
    private String email;

    public UserAccount(String username, String email) {
        this.id = nextId++;
        this.username = username;
        this.email = email;
    }

    public static int getNextAvailableId() {
        return nextId;
    }

    public static void resetIdSequence(int startId) {
        nextId = startId;
    }

    public void print() {
        System.out.println("ID: " + id + ", " + username + ", " + email);
    }
}

class ServerConfig {
    public static final String SERVER_NAME = "AlphaEnterprise";
    public static final int MAX_CONNECTIONS = 5;
    private static int activeConnections = 0;

    public static boolean connect() {
        if (activeConnections < MAX_CONNECTIONS) {
            activeConnections++;
            return true;
        }
        return false;
    }

    public static void disconnect() {
        if (activeConnections > 0) {
            activeConnections--;
        }
    }

    public static void printServerStatus() {
        System.out.println("Сервер " + SERVER_NAME + ": підключень " + activeConnections + " з "
                + MAX_CONNECTIONS + ", вільних слотів: " + (MAX_CONNECTIONS - activeConnections));
    }
}

class MathUtils {
    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;

    private MathUtils() {
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double power(double base, int exp) {
        double result = 1;
        for (int i = 0; i < Math.abs(exp); i++) {
            result *= base;
        }
        return exp < 0 ? 1 / result : result;
    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int clamp(int val, int min, int max) {
        if (val < min) {
            return min;
        }
        if (val > max) {
            return max;
        }
        return val;
    }
}

class CurrencyExchange {
    private static double usdToUahRate = 41.5;
    private static double eurToUahRate = 45.2;

    public static void updateRates(double newUsd, double newEur) {
        if (newUsd > 0) {
            usdToUahRate = newUsd;
        }
        if (newEur > 0) {
            eurToUahRate = newEur;
        }
    }

    public static double uahToUsd(double uah) {
        return uah / usdToUahRate;
    }

    public static double usdToUah(double usd) {
        return usd * usdToUahRate;
    }

    public static double eurToUah(double eur) {
        return eur * eurToUahRate;
    }
}

class FleetCar {
    private static int totalCars = 0;
    private static double totalCompanyMileage = 0.0;

    private String vinCode;
    private double currentMileage;

    public FleetCar(String vinCode, double initialMileage) {
        this.vinCode = vinCode;
        this.currentMileage = initialMileage;
        totalCars++;
        totalCompanyMileage += initialMileage;
    }

    public void addTrip(double km) {
        this.currentMileage += km;
        totalCompanyMileage += km;
        System.out.println(vinCode + ": рейс " + km + " км, пробіг тепер " + currentMileage + " км");
    }

    public static void resetStatistics() {
        totalCars = 0;
        totalCompanyMileage = 0.0;
    }

    public static void printFleetSummary() {
        System.out.println("Автомобілів у парку: " + totalCars);
        System.out.println("Загальний пробіг парку: " + totalCompanyMileage + " км");
    }
}

class StringUtils {
    private StringUtils() {
    }

    public static boolean isPalindrome(String s) {
        String cleaned = s.replace(" ", "").toLowerCase();
        return cleaned.equals(reverse(cleaned));
    }

    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static int countVowels(String s) {
        String vowels = "аоуеиіяюєїaeiou";
        String lower = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < lower.length(); i++) {
            if (vowels.indexOf(lower.charAt(i)) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static String maskCardNumber(String cardNumber) {
        String result = "";
        for (int i = 0; i < cardNumber.length(); i++) {
            char ch = cardNumber.charAt(i);
            if (i < cardNumber.length() - 4 && Character.isDigit(ch)) {
                result += '*';
            } else {
                result += ch;
            }
        }
        return result;
    }
}

class GameSession {
    public static final int MAX_SESSIONS = 3;
    private static int activeSessionsCount = 0;
    private static int tokenCounter = 1;

    private String sessionToken;
    private String hostPlayer;
    private boolean isActive;

    private GameSession(String host) {
        this.hostPlayer = host;
        this.sessionToken = "SES-" + tokenCounter++;
        this.isActive = true;
    }

    public static GameSession createSession(String host) {
        if (activeSessionsCount >= MAX_SESSIONS) {
            System.out.println("Помилка: усі сервера перевантажені!");
            return null;
        }
        activeSessionsCount++;
        return new GameSession(host);
    }

    public String getSessionToken() {
        return sessionToken + " (хост: " + hostPlayer + ")";
    }

    public void terminate() {
        if (isActive) {
            isActive = false;
            activeSessionsCount--;
        }
    }
}

class PhysicsEngine {
    public static final double G = 9.80665;
    public static final double SPEED_OF_LIGHT = 299792458.0;

    private PhysicsEngine() {
    }

    public static double freeFallDistance(double seconds) {
        return G * seconds * seconds / 2;
    }

    public static double kineticEnergy(double massKg, double velocityMs) {
        return massKg * velocityMs * velocityMs / 2;
    }

    public static double restEnergy(double massKg) {
        return massKg * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
    }
}

// ===================== Блок 5 =====================

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class LineSegment {
    private Point start;
    private Point end;

    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public LineSegment(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public Point getMidPoint() {
        return new Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
    }

    public void printSegment() {
        System.out.println("Відрізок: (" + start.getX() + "; " + start.getY() + ") -> ("
                + end.getX() + "; " + end.getY() + ")");
    }
}

class ClientAccount {
    private String iban;
    private String owner;
    private double balance;

    public ClientAccount(String iban, String owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public boolean transferTo(ClientAccount recipient, double amount) {
        if (recipient == null || recipient == this) {
            return false;
        }
        if (amount <= 0 || this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        recipient.balance += amount;
        return true;
    }

    public void printAccount() {
        System.out.println(iban + ", " + owner + ", баланс: " + Practice07.fmt(balance) + " грн");
    }
}

class Engine {
    private String serialNumber;
    private int horsePower;
    private boolean isRunning;

    public Engine(String serialNumber, int horsePower) {
        this.serialNumber = serialNumber;
        this.horsePower = horsePower;
    }

    public void start() {
        isRunning = true;
        System.out.println("Двигун " + serialNumber + " заведено!");
    }

    public void stop() {
        isRunning = false;
        System.out.println("Двигун " + serialNumber + " заглушено.");
    }

    public boolean isRunning() {
        return isRunning;
    }

    public int getHorsePower() {
        return horsePower;
    }
}

class CarWithEngine {
    private String brand;
    private String model;
    private Engine engine;

    public CarWithEngine(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        this.engine.start();
        System.out.println(brand + " готовий до руху!");
    }

    public void turnOff() {
        this.engine.stop();
    }

    public void printSpecs() {
        System.out.println(brand + " " + model + ", потужність двигуна: " + engine.getHorsePower() + " к.с.");
    }
}

class Processor {
    private String model;
    private double frequencyGHz;
    private double price;

    public Processor(String model, double frequencyGHz, double price) {
        this.model = model;
        this.frequencyGHz = frequencyGHz;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String describe() {
        return model + " (" + frequencyGHz + " ГГц)";
    }
}

class Memory {
    private int sizeGB;
    private int frequencyMHz;
    private double price;

    public Memory(int sizeGB, int frequencyMHz, double price) {
        this.sizeGB = sizeGB;
        this.frequencyMHz = frequencyMHz;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String describe() {
        return sizeGB + " ГБ (" + frequencyMHz + " МГц)";
    }
}

class Computer {
    private String title;
    private Processor cpu;
    private Memory ram;
    private double casePrice;

    public Computer(String title, Processor cpu, Memory ram, double casePrice) {
        this.title = title;
        this.cpu = cpu;
        this.ram = ram;
        this.casePrice = casePrice;
    }

    public double calculateTotalPrice() {
        return cpu.getPrice() + ram.getPrice() + casePrice;
    }

    public void upgradeMemory(Memory newRam) {
        System.out.println("Апгрейд пам'яті: " + ram.describe() + " -> " + newRam.describe());
        this.ram = newRam;
    }

    public void printSpecs() {
        System.out.println(title + ": процесор " + cpu.describe() + ", пам'ять " + ram.describe());
    }
}

class Hero {
    private String name;
    private int health;
    private int attackPower;
    private int defense;

    public Hero(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public void attack(Hero target) {
        int damage = this.attackPower - target.defense;
        if (damage <= 0) {
            damage = 1;
        }
        target.health -= damage;
        if (target.health < 0) {
            target.health = 0;
        }
        System.out.println(this.name + " б'є " + target.name + " на " + damage
                + ". Залишилось HP у " + target.name + ": " + target.health);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }
}

// У завданні 5 вже використано клас Product (товар складу), тому товар магазину названо StoreProduct
class StoreProduct {
    private int id;
    private String title;
    private double price;

    public StoreProduct(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

class Customer {
    private String name;
    private double walletBalance;

    public Customer(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public boolean pay(double amount) {
        if (amount <= walletBalance) {
            walletBalance -= amount;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public double getWalletBalance() {
        return walletBalance;
    }
}

class Order {
    private Customer customer;
    private StoreProduct[] items;
    private int itemCount;

    public Order(Customer customer, int maxItems) {
        this.customer = customer;
        this.items = new StoreProduct[maxItems];
    }

    public void addProduct(StoreProduct p) {
        if (itemCount < items.length) {
            items[itemCount] = p;
            itemCount++;
        } else {
            System.out.println("Замовлення заповнене!");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    public boolean checkout() {
        double total = calculateTotal();
        if (customer.pay(total)) {
            System.out.println("--- ЧЕК для " + customer.getName() + " ---");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(items[i].getTitle() + ": " + Practice07.fmt(items[i].getPrice()) + " грн");
            }
            System.out.println("Разом: " + Practice07.fmt(total) + " грн. Залишок на рахунку: "
                    + Practice07.fmt(customer.getWalletBalance()) + " грн");
            return true;
        }
        System.out.println(customer.getName() + ": недостатньо коштів (потрібно "
                + Practice07.fmt(total) + " грн, є " + Practice07.fmt(customer.getWalletBalance()) + " грн)");
        return false;
    }
}

class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        this(0, 0, 0);
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(x + other.x, y + other.y, z + other.z);
    }

    public double dotProduct(Vector3D other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector3D crossProduct(Vector3D other) {
        return new Vector3D(
                y * other.z - z * other.y,
                z * other.x - x * other.z,
                x * other.y - y * other.x);
    }

    public boolean isOrthogonalTo(Vector3D other) {
        return Math.abs(dotProduct(other)) < 1e-9;
    }

    public boolean isEqualTo(Vector3D other) {
        return x == other.x && y == other.y && z == other.z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

class BookItem {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public BookItem(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void printBook() {
        System.out.println("[" + isbn + "] \"" + title + "\", " + author + " - "
                + (isAvailable ? "у фонді" : "видана"));
    }
}

class LibraryCatalog {
    private BookItem[] books;
    private int size;

    public LibraryCatalog(int capacity) {
        this.books = new BookItem[capacity];
    }

    public void addBook(BookItem book) {
        if (size < books.length) {
            books[size] = book;
            size++;
        } else {
            System.out.println("Фонд заповнений!");
        }
    }

    public BookItem findBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean borrowBook(String title) {
        BookItem book = findBookByTitle(title);
        if (book == null || !book.isAvailable()) {
            return false;
        }
        book.borrowBook();
        return true;
    }

    public void printCatalog() {
        System.out.println("--- КАТАЛОГ ---");
        for (int i = 0; i < size; i++) {
            books[i].printBook();
        }
    }
}
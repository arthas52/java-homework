package semester1.practice08;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Practice08 {

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

    static String f(double value) {
        return String.format(Locale.US, "%.2f", value);
    }

    static String healthBar(int hp, int maxHp) {
        int filled = (maxHp <= 0) ? 0 : (int) (((double) hp / maxHp) * 10);
        String bar = "[";
        for (int i = 0; i < 10; i++) {
            bar += (i < filled) ? "█" : "░";
        }
        return bar + "]";
    }

    // ===== Блок 1 =====

    private static void task1() {
        Student student = new Student("Олена", 3, 88.5);
        System.out.println(student);
        Student invalid = new Student("Максим", 9, 150);
        System.out.println(invalid);
        invalid.setGpa(-5);
        invalid.setCourse(0);
        System.out.println(invalid);
    }

    private static void task2() {
        Product monitor = new Product("A-101", "Монітор", 6499.50, 4);
        Product broken = new Product("B-202", "Миша", -100, -3);
        System.out.println(monitor);
        System.out.println(broken);
    }

    private static void task3() {
        Circle circle = new Circle(5.0);
        System.out.println(circle);
        Circle negative = new Circle(-3);
        System.out.println(negative);
        circle.setRadius(0);
        System.out.println(circle);
    }

    private static void task4() {
        CardWallet wallet = new CardWallet("4276123445674589", "1234", 12500);
        System.out.println(wallet);
        System.out.println("Зміна PIN з неправильним старим: " + wallet.changePin("0000", "5555"));
        System.out.println("Зміна PIN з правильним старим: " + wallet.changePin("1234", "5555"));
        System.out.println(wallet);
    }

    private static void task5() {
        SensorNode sensor = new SensorNode("S-01", 21.4, 0.6);
        System.out.println(sensor);
        System.out.println("Відкалібрований показник: " + sensor.getCalibratedValue());
    }

    private static void task6() {
        double[] temps = {12.5, 14.0, 18.5, 21.0, 19.5, 15.0};
        WeatherDay day = new WeatherDay("2026-06-15", temps);
        temps[0] = 999;
        System.out.println(day);
        System.out.println("Мін: " + day.getMinTemp() + ", Макс: " + day.getMaxTemp());
    }

    private static void task7() {
        IntRange range = new IntRange(10, 3);
        System.out.println(range);
        System.out.println("Містить 5: " + range.contains(5));
        System.out.println("Містить 20: " + range.contains(20));
        range.setRange(50, 20);
        System.out.println(range);
    }

    private static void task8() {
        InvoiceItem item = new InvoiceItem("Клавіатура", 3, 1200.0, 10);
        System.out.println("Позиція чека: " + item);
    }

    // ===== Блок 2 =====

    private static void task9() {
        Employee employee = new Employee("Олег", 20000);
        Developer developer = new Developer("Поліна", 30000, "Java");
        System.out.println(employee);
        System.out.println(developer);
    }

    private static void task10() {
        Dog dog = new Dog("Барбос", 4, 18.5, "Лабрадор");
        Cat cat = new Cat("Мурка", 2, 4.2, true);
        System.out.println(dog);
        System.out.println(dog.fetchStick());
        System.out.println(cat);
        System.out.println(cat.purr());
    }

    private static void task11() {
        PassengerCar car = new PassengerCar("Toyota", 200, 55, 5);
        CargoTruck truck = new CargoTruck("MAN", 120, 400, 12.5);
        System.out.println(car);
        System.out.println(truck);
        System.out.println("Витрата вантажівки при повному завантаженні: "
                + Practice08.f(truck.getFuelConsumptionFullLoad()) + " л/100 км");
    }

    private static void task12() {
        Rectangle rectangle = new Rectangle(4, 5);
        Box3D box = new Box3D(4, 5, 3);
        System.out.println(rectangle);
        System.out.println(box);
    }

    private static void task13() {
        UniversityStudent student = new UniversityStudent("Денис Мельник", 2005, "ST-1001", "Інформатика", 2000);
        Professor professor = new Professor("Ірина Савчук", 1975, "Доцент", 42);
        System.out.println(student + ", вік: " + student.getAge(2026));
        System.out.println(professor + ", вік: " + professor.getAge(2026));
    }

    private static void task14() {
        Smartphone full = new Smartphone("Samsung", 25000, 256, true);
        Smartphone medium = new Smartphone("Xiaomi", 12000, 128);
        Smartphone minimal = new Smartphone("Nokia");
        System.out.println(full);
        System.out.println(medium);
        System.out.println(minimal);
    }

    private static void task15() {
        PrintedBook book = new PrintedBook("Кобзар", "Тарас Шевченко", 1840, 320, "Тверда");
        AudioBook audio = new AudioBook("Майстер і Маргарита", "Михайло Булгаков", 1967, 745, "Іван Іванов");
        System.out.println(book);
        System.out.println(audio);
    }

    private static void task16() {
        Gamer gamer = new Gamer("NoobMaster", 1200);
        ProEsportsPlayer pro = new ProEsportsPlayer("Zeus", 15000, "Navi", 240000.0, 6);
        ProEsportsPlayer rookie = new ProEsportsPlayer("Rookie", 300, "Newbies", 0.0, 0);
        System.out.println(gamer);
        System.out.println(pro);
        System.out.println(rookie);
        System.out.println("Середній приз за перемогу (Zeus): " + Practice08.f(pro.getAveragePrizePerWin()));
        System.out.println("Середній приз за перемогу (Rookie): " + Practice08.f(rookie.getAveragePrizePerWin()));
    }

    // ===== Блок 3 =====

    private static void task17() {
        StaffMember staff = new StaffMember("Анна", 20000);
        Manager manager = new Manager("Богдан", 30000, 8000);
        SalesPerson sales = new SalesPerson("Віка", 15000, 200000, 5);
        System.out.println(staff);
        System.out.println(manager);
        System.out.println(sales);
    }

    private static void task18() {
        StandardTransfer standard = new StandardTransfer(1000);
        InternationalTransfer international = new InternationalTransfer(1000, "PL");
        System.out.println(standard);
        System.out.println(international);
    }

    private static void task19() {
        Ticket ticket = new Ticket("Концерт", 800);
        StudentTicket student = new StudentTicket("Концерт", 800, "STU-777");
        VipTicket vip = new VipTicket("Концерт", 800, true, 300);
        System.out.println(ticket);
        System.out.println(student);
        System.out.println(vip);
    }

    private static void task20() {
        Weapon weapon = new Weapon("Кинджал", 40);
        EnchantedSword sword = new EnchantedSword("Меч Світла", 60, "Світло", 15, 4);
        System.out.println(weapon);
        System.out.println(sword);
    }

    private static void task21() {
        Parcel parcel = new Parcel("UA123", 2.5);
        FragileParcel fragile = new FragileParcel("UA456", 2.5, true, 5000);
        System.out.println(parcel);
        System.out.println(fragile);
    }

    private static void task22() {
        Appliance heater = new Appliance("Heater-1", 2000);
        EcoHeater eco = new EcoHeater("Eco-2", 2000, true);
        System.out.println(heater + ", споживання за 5 год: " + Practice08.f(heater.getDailyConsumptionKWh(5)) + " кВт·год");
        System.out.println(eco + ", споживання за 5 год: " + Practice08.f(eco.getDailyConsumptionKWh(5)) + " кВт·год");
    }

    private static void task23() {
        Point2D p2 = new Point2D(3, 4);
        Point3D p3 = new Point3D(2, 3, 6);
        System.out.println(p2 + ", відстань до початку: " + p2.distanceToOrigin());
        System.out.println(p3 + ", відстань до початку: " + p3.distanceToOrigin());
    }

    private static void task24() {
        Coffee coffee = new Coffee("Арабіка", 250, 50);
        LatteWithAddons latte = new LatteWithAddons("Арабіка", 300, 60, "Рослинне", 2);
        System.out.println(coffee);
        System.out.println(latte);
    }

    // ===== Блок 4 =====

    private static void task25() {
        DotaHero hero = new DotaHero("Generic", "Універсал", 500);
        StrengthHero strengthHero = new StrengthHero("Axe", 580, 25);
        AlchemistHero alchemist = new AlchemistHero("Alchemist", 560, 28, 150);
        System.out.println(hero);
        System.out.println(strengthHero);
        System.out.println(alchemist);
        alchemist.chemicalRage();
    }

    private static void task26() {
        ElectricCar car = new ElectricCar("Tesla", 2024, 450, 4, 75.0, 500);
        System.out.println(car);
    }

    private static void task27() {
        CashbackPlatinumCard card = new CashbackPlatinumCard("Олена Коваль", 20000, 5000, 3.0);
        System.out.println("Покупка 2000: " + card.pay(2000));
        System.out.println("Покупка 6000 (вище ліміту): " + card.pay(6000));
        System.out.println("Покупка 1000: " + card.pay(1000));
        System.out.println(card);
    }

    private static void task28() {
        CustomTerminal terminal = new CustomTerminal();
        System.out.println(terminal.getWelcomeBanner());
        System.out.println(terminal.generateAuthHash("alex"));
        // Спроба написати @Override public String generateAuthHash(String user) у CustomTerminal
        // не скомпілюється: метод у SecurityTerminal оголошено як final, а final-методи
        // заборонено перевизначати у класах-нащадках.
    }

    private static void task29() {
        ImmutableServerCredentials credentials = new ImmutableServerCredentials("api.example.com", 443, "abc-123-xyz");
        System.out.println(credentials);
        // class Fake extends ImmutableServerCredentials {} // помилка компіляції: клас оголошено як final
    }

    private static void task30() {
        Segment1D segment = new Segment1D(4);
        Square2D square = new Square2D(4);
        Cube3D cube = new Cube3D(4);
        System.out.println(segment);
        System.out.println(square);
        System.out.println(cube);
    }

    private static void task31() {
        PostgraduateStudent ready = new PostgraduateStudent(1, "a@uni.edu", "KN-41", 91.5, "Машинне навчання", "Проф. Петренко");
        PostgraduateStudent notReady = new PostgraduateStudent(2, "b@uni.edu", "KN-42", 70.0, "", "Проф. Іваненко");
        System.out.println(ready);
        System.out.println("Допуск до захисту: " + ready.canDefendThesis());
        System.out.println(notReady);
        System.out.println("Допуск до захисту: " + notReady.canDefendThesis());
    }

    private static void task32() {
        Medicine aspirin = new Medicine("Аспірин", 45.0, false);
        PrescriptionMedicine antibiotic = new PrescriptionMedicine("Амоксицилін", 180.0, false, "LIC-777");
        ControlledSubstance strong = new ControlledSubstance("Морфін", 900.0, false, "LIC-999", 30);
        ControlledSubstance underage = new ControlledSubstance("Морфін", 900.0, false, "LIC-999", 16);
        System.out.println(aspirin);
        System.out.println(antibiotic + " -> продаж з рецептом: " + antibiotic.canSell(true)
                + ", без рецепта: " + antibiotic.canSell(false));
        System.out.println(strong + " -> продаж з рецептом: " + strong.canSell(true));
        System.out.println(underage + " -> продаж з рецептом: " + underage.canSell(true));
    }

    // ===== Блок 5 =====

    private static void task33() {
        ArithmeticProgression arithmetic = new ArithmeticProgression(2, 3);
        GeometricProgression geometric = new GeometricProgression(2, 3);
        System.out.println(arithmetic);
        System.out.println(geometric);
        System.out.println("Арифметична, 10-й член: " + arithmetic.getTerm(10));
        System.out.println("Геометрична, 10-й член: " + geometric.getTerm(10));
    }

    private static void task34() {
        GradeSheet plain = new GradeSheet("Денис", new int[]{90, 70, 80});
        WeightedGradeSheet weighted = new WeightedGradeSheet("Денис", new int[]{90, 70, 80}, new double[]{1, 3, 2});
        System.out.println(plain);
        System.out.println(weighted);
    }

    private static void task35() {
        LinearFunction linear = new LinearFunction(2, 1);
        QuadraticFunction quadratic = new QuadraticFunction(1, -4, 3);
        System.out.println(linear + ", f(3) = " + linear.evaluate(3));
        System.out.println(quadratic + ", f(3) = " + quadratic.evaluate(3));
        System.out.println("Вершина параболи: x0 = " + quadratic.getVertexX());
    }

    private static void task36() {
        WarehouseItem item = new WarehouseItem("Ноутбук", 5, new double[]{20000, 21000, 19000});
        DiscountedWarehouseItem discounted = new DiscountedWarehouseItem("Ноутбук (вітрина)", 2,
                new double[]{20000, 21000, 19000}, "Пошкоджена упаковка", 15);
        System.out.println(item);
        System.out.println(discounted);
    }

    private static void task37() {
        CinemaHall hall = new CinemaHall("Зал №1", 3, 4, 180);
        VipCinemaHall vip = new VipCinemaHall("VIP зал", 3, 4, 300, 100);
        hall.bookSeat(0, 1);
        hall.bookSeat(2, 3);
        vip.bookSeat(0, 1);
        vip.bookSeat(2, 3);
        vip.bookSeat(2, 0);
        System.out.println(hall);
        System.out.println(vip);
    }

    private static void task38() {
        TeamLead lead = new TeamLead("Марко", 50000, "Java", 5);
        lead.addTeamMember(new Developer("Андрій", 30000, "Java"));
        lead.addTeamMember(new Developer("Софія", 32000, "Kotlin"));
        lead.addTeamMember(new Developer("Тарас", 28000, "Python"));
        System.out.println(lead);
    }

    private static void task39() {
        CharacterUnit warrior = new CharacterUnit("Воїн", 100, 10);
        ShieldedPaladin paladin = new ShieldedPaladin("Паладин", 100, 10, 60);
        System.out.println(warrior);
        System.out.println(paladin);
        System.out.println("--- Удар на 50 ---");
        warrior.takeDamage(50);
        paladin.takeDamage(50);
        System.out.println(warrior);
        System.out.println(paladin);
        System.out.println("--- Удар на 50 ---");
        warrior.takeDamage(50);
        paladin.takeDamage(50);
        System.out.println(warrior);
        System.out.println(paladin);
    }

    private static void task40() {
        System.out.println("Завдання 40: коміт та Push у GitHub.");
        System.out.println("1. IntelliJ: Ctrl+K, зняти галочку Amend, вибрати файли, ввести повідомлення, Commit.");
        System.out.println("2. Ctrl+Shift+K -> Push.");
        System.out.println("3. Перевірити файли в репозиторії у браузері.");
    }
}

// ===================== Блок 1 =====================

class Student {
    private String name;
    private int course;
    private double gpa;

    public Student(String name, int course, double gpa) {
        this.name = name;
        setCourse(course);
        setGpa(gpa);
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = (course < 1 || course > 6) ? 1 : course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = (gpa < 0.0 || gpa > 100.0) ? 60.0 : gpa;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', course=" + course + ", gpa=" + gpa + "}";
    }
}

class Product {
    private String sku;
    private String title;
    private double price;
    private int stock;

    public Product(String sku, String title, double price, int stock) {
        this.sku = sku;
        this.title = title;
        setPrice(price);
        setStock(stock);
    }

    public void setPrice(double price) {
        this.price = (price < 0.0) ? 0.0 : price;
    }

    public void setStock(int stock) {
        this.stock = (stock < 0) ? 0 : stock;
    }

    public double getTotalCost() {
        return price * stock;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "[SKU: %s] %s | Ціна: %.2f грн | Залишок: %d шт. | Разом: %.2f грн",
                sku, title, price, stock, getTotalCost());
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius <= 0) ? 1.0 : radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Circle[r=%.2f, S=%.2f, C=%.2f]", radius, getArea(), getCircumference());
    }
}

class CardWallet {
    private String cardNumber;
    private String pinCode;
    private double balance;

    public CardWallet(String cardNumber, String pinCode, double balance) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public boolean changePin(String oldPin, String newPin) {
        if (pinCode.equals(oldPin)) {
            pinCode = newPin;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String last4 = cardNumber.substring(cardNumber.length() - 4);
        return "CardWallet{card='**** **** **** " + last4 + "', balance=" + Practice08.f(balance) + " UAH}";
    }
}

class SensorNode {
    private String sensorId;
    protected double calibrationOffset;
    private double rawValue;

    public SensorNode(String sensorId, double rawValue, double calibrationOffset) {
        this.sensorId = sensorId;
        this.rawValue = rawValue;
        this.calibrationOffset = calibrationOffset;
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getCalibratedValue() {
        return rawValue + calibrationOffset;
    }

    @Override
    public String toString() {
        return "SensorNode{id='" + sensorId + "', raw=" + rawValue + ", calibrated=" + getCalibratedValue() + "}";
    }
}

class WeatherDay {
    private String date;
    private double[] hourlyTemps;

    public WeatherDay(String date, double[] hourlyTemps) {
        this.date = date;
        this.hourlyTemps = new double[hourlyTemps.length];
        for (int i = 0; i < hourlyTemps.length; i++) {
            this.hourlyTemps[i] = hourlyTemps[i];
        }
    }

    public double getMinTemp() {
        double min = hourlyTemps[0];
        for (double t : hourlyTemps) {
            if (t < min) {
                min = t;
            }
        }
        return min;
    }

    public double getMaxTemp() {
        double max = hourlyTemps[0];
        for (double t : hourlyTemps) {
            if (t > max) {
                max = t;
            }
        }
        return max;
    }

    public double getAverageTemp() {
        double sum = 0;
        for (double t : hourlyTemps) {
            sum += t;
        }
        return sum / hourlyTemps.length;
    }

    @Override
    public String toString() {
        return "WeatherDay{date=" + date + ", temps=" + Arrays.toString(hourlyTemps)
                + ", avg=" + Practice08.f(getAverageTemp()) + "}";
    }
}

class IntRange {
    private int min;
    private int max;

    public IntRange(int min, int max) {
        setRange(min, max);
    }

    public void setRange(int min, int max) {
        if (min > max) {
            this.min = max;
            this.max = min;
        } else {
            this.min = min;
            this.max = max;
        }
    }

    public boolean contains(int value) {
        return value >= min && value <= max;
    }

    public int getLength() {
        return max - min;
    }

    @Override
    public String toString() {
        return "[" + min + " .. " + max + "] (довжина: " + getLength() + ")";
    }
}

class InvoiceItem {
    private String description;
    private int quantity;
    private double unitPrice;
    private double discountPercent;

    public InvoiceItem(String description, int quantity, double unitPrice, double discountPercent) {
        this.description = description;
        this.quantity = Math.max(0, quantity);
        this.unitPrice = Math.max(0.0, unitPrice);
        this.discountPercent = Math.max(0.0, Math.min(50.0, discountPercent));
    }

    public double getFinalAmount() {
        return quantity * unitPrice * (1 - discountPercent / 100.0);
    }

    @Override
    public String toString() {
        return description + " x" + quantity + " по " + Practice08.f(unitPrice) + " грн, знижка "
                + discountPercent + "% = " + Practice08.f(getFinalAmount()) + " грн";
    }
}

// ===================== Блок 2 =====================

class Employee {
    private String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + Practice08.f(salary) + "}";
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" + super.toString() + ", language='" + programmingLanguage + "'}";
    }
}

class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    public String fetchStick() {
        return getName() + " приносить палицю!";
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", breed='" + breed + "'}";
    }
}

class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, double weight, boolean isIndoor) {
        super(name, age, weight);
        this.isIndoor = isIndoor;
    }

    public String purr() {
        return getName() + " муркоче: мур-мур...";
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() + ", indoor=" + isIndoor + "}";
    }
}

class Vehicle {
    protected String brand;
    protected int maxSpeed;
    protected double fuelTankCapacity;

    public Vehicle(String brand, int maxSpeed, double fuelTankCapacity) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{brand='" + brand + "', maxSpeed=" + maxSpeed + ", tank=" + fuelTankCapacity + " л}";
    }
}

class PassengerCar extends Vehicle {
    private int passengerSeats;

    public PassengerCar(String brand, int maxSpeed, double fuelTankCapacity, int passengerSeats) {
        super(brand, maxSpeed, fuelTankCapacity);
        this.passengerSeats = passengerSeats;
    }

    @Override
    public String toString() {
        return "PassengerCar{" + super.toString() + ", seats=" + passengerSeats + "}";
    }
}

class CargoTruck extends Vehicle {
    private double maxLoadTons;

    public CargoTruck(String brand, int maxSpeed, double fuelTankCapacity, double maxLoadTons) {
        super(brand, maxSpeed, fuelTankCapacity);
        this.maxLoadTons = maxLoadTons;
    }

    // Умовна модель: 20 л/100 км порожня + 2 л/100 км на кожну тонну вантажу
    public double getFuelConsumptionFullLoad() {
        return 20 + 2 * maxLoadTons;
    }

    @Override
    public String toString() {
        return "CargoTruck{" + super.toString() + ", maxLoad=" + maxLoadTons + " т}";
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + width + " x " + height + ", S=" + getArea() + "}";
    }
}

class Box3D extends Rectangle {
    private double depth;

    public Box3D(double width, double height, double depth) {
        super(width, height);
        this.depth = depth;
    }

    public double getVolume() {
        return super.getArea() * depth;
    }

    @Override
    public String toString() {
        return "Box3D{" + super.toString() + ", depth=" + depth + ", V=" + getVolume() + "}";
    }
}

class Person {
    private String fullName;
    private int birthYear;

    public Person(String fullName, int birthYear) {
        this.fullName = fullName;
        this.birthYear = birthYear;
    }

    public int getAge(int currentYear) {
        return currentYear - birthYear;
    }

    @Override
    public String toString() {
        return "Person{" + fullName + ", " + birthYear + " р.н.}";
    }
}

class UniversityStudent extends Person {
    private String studentId;
    private String major;
    private int scholarship;

    public UniversityStudent(String fullName, int birthYear, String studentId, String major, int scholarship) {
        super(fullName, birthYear);
        this.studentId = studentId;
        this.major = major;
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "UniversityStudent{" + super.toString() + ", id=" + studentId + ", major=" + major
                + ", scholarship=" + scholarship + "}";
    }
}

class Professor extends Person {
    private String academicTitle;
    private int publicationsCount;

    public Professor(String fullName, int birthYear, String academicTitle, int publicationsCount) {
        super(fullName, birthYear);
        this.academicTitle = academicTitle;
        this.publicationsCount = publicationsCount;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + ", title=" + academicTitle
                + ", publications=" + publicationsCount + "}";
    }
}

class Gadget {
    private String brand;
    private double price;

    public Gadget(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gadget{brand='" + brand + "', price=" + Practice08.f(price) + "}";
    }
}

class Smartphone extends Gadget {
    private int memoryGb;
    private boolean has5G;

    public Smartphone(String brand, double price, int memoryGb, boolean has5G) {
        super(brand, price);
        this.memoryGb = memoryGb;
        this.has5G = has5G;
    }

    public Smartphone(String brand, double price, int memoryGb) {
        this(brand, price, memoryGb, true);
    }

    public Smartphone(String brand) {
        this(brand, 9999.0, 128, false);
    }

    @Override
    public String toString() {
        return "Smartphone{" + super.toString() + ", memory=" + memoryGb + " ГБ, 5G=" + has5G + "}";
    }
}

class Publication {
    private String title;
    private String author;
    private int releaseYear;

    public Publication(String title, String author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "\"" + title + "\", " + author + ", " + releaseYear;
    }
}

class PrintedBook extends Publication {
    private int pageCount;
    private String coverType;

    public PrintedBook(String title, String author, int releaseYear, int pageCount, String coverType) {
        super(title, author, releaseYear);
        this.pageCount = pageCount;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "PrintedBook{" + super.toString() + ", " + pageCount + " стор., обкладинка: " + coverType + "}";
    }
}

class AudioBook extends Publication {
    private int durationMinutes;
    private String narrator;

    public AudioBook(String title, String author, int releaseYear, int durationMinutes, String narrator) {
        super(title, author, releaseYear);
        this.durationMinutes = durationMinutes;
        this.narrator = narrator;
    }

    public String formatDuration() {
        return (durationMinutes / 60) + " год " + (durationMinutes % 60) + " хв";
    }

    @Override
    public String toString() {
        return "AudioBook{" + super.toString() + ", тривалість: " + formatDuration() + ", читає: " + narrator + "}";
    }
}

class Gamer {
    private String nickname;
    private int hoursPlayed;

    public Gamer(String nickname, int hoursPlayed) {
        this.nickname = nickname;
        this.hoursPlayed = hoursPlayed;
    }

    @Override
    public String toString() {
        return "Gamer{nickname='" + nickname + "', hours=" + hoursPlayed + "}";
    }
}

class ProEsportsPlayer extends Gamer {
    private String teamName;
    private double prizeMoneyUSD;
    private int tournamentsWon;

    public ProEsportsPlayer(String nickname, int hoursPlayed, String teamName,
                            double prizeMoneyUSD, int tournamentsWon) {
        super(nickname, hoursPlayed);
        this.teamName = teamName;
        this.prizeMoneyUSD = prizeMoneyUSD;
        this.tournamentsWon = tournamentsWon;
    }

    public double getAveragePrizePerWin() {
        if (tournamentsWon == 0) {
            return 0.0;
        }
        return prizeMoneyUSD / tournamentsWon;
    }

    @Override
    public String toString() {
        return "ProEsportsPlayer{" + super.toString() + ", team=" + teamName + ", prize=$"
                + Practice08.f(prizeMoneyUSD) + ", wins=" + tournamentsWon + "}";
    }
}

// ===================== Блок 3 =====================

class StaffMember {
    private String name;
    private double baseSalary;

    public StaffMember(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateMonthlyPay() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "StaffMember{name='" + name + "', база=" + Practice08.f(baseSalary)
                + ", до виплати=" + Practice08.f(calculateMonthlyPay()) + "}";
    }
}

class Manager extends StaffMember {
    private double teamBonus;

    public Manager(String name, double baseSalary, double teamBonus) {
        super(name, baseSalary);
        this.teamBonus = teamBonus;
    }

    @Override
    public double calculateMonthlyPay() {
        return super.calculateMonthlyPay() + teamBonus;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + ", командний бонус=" + Practice08.f(teamBonus) + "}";
    }
}

class SalesPerson extends StaffMember {
    private double salesVolume;
    private double commissionRate;

    public SalesPerson(String name, double baseSalary, double salesVolume, double commissionRate) {
        super(name, baseSalary);
        this.salesVolume = salesVolume;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateMonthlyPay() {
        return super.calculateMonthlyPay() + salesVolume * (commissionRate / 100.0);
    }

    @Override
    public String toString() {
        return "SalesPerson{" + super.toString() + ", продажі=" + Practice08.f(salesVolume)
                + ", комісія=" + commissionRate + "%}";
    }
}

class StandardTransfer {
    protected double amount;

    public StandardTransfer(double amount) {
        this.amount = amount;
    }

    public double getFee() {
        return amount * 0.01;
    }

    public double getTotalWithFee() {
        return amount + getFee();
    }

    @Override
    public String toString() {
        return "StandardTransfer{сума=" + Practice08.f(amount) + ", комісія=" + Practice08.f(getFee())
                + ", разом=" + Practice08.f(getTotalWithFee()) + "}";
    }
}

class InternationalTransfer extends StandardTransfer {
    private String countryCode;

    public InternationalTransfer(double amount, String countryCode) {
        super(amount);
        this.countryCode = countryCode;
    }

    @Override
    public double getFee() {
        return super.getFee() * 2 + 15.0;
    }

    @Override
    public String toString() {
        return "InternationalTransfer[" + countryCode + "]{" + super.toString() + "}";
    }
}

class Ticket {
    private String eventName;
    private double basePrice;

    public Ticket(String eventName, double basePrice) {
        this.eventName = eventName;
        this.basePrice = basePrice;
    }

    public double getFinalPrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Ticket{" + eventName + ", базова ціна=" + Practice08.f(basePrice)
                + ", до сплати=" + Practice08.f(getFinalPrice()) + "}";
    }
}

class StudentTicket extends Ticket {
    private String studentCardNumber;

    public StudentTicket(String eventName, double basePrice, String studentCardNumber) {
        super(eventName, basePrice);
        this.studentCardNumber = studentCardNumber;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() * 0.5;
    }

    @Override
    public String toString() {
        return "StudentTicket{" + super.toString() + ", квиток студента " + studentCardNumber + "}";
    }
}

class VipTicket extends Ticket {
    private boolean includesBackstage;
    private double loungeFee;

    public VipTicket(String eventName, double basePrice, boolean includesBackstage, double loungeFee) {
        super(eventName, basePrice);
        this.includesBackstage = includesBackstage;
        this.loungeFee = loungeFee;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + loungeFee;
    }

    @Override
    public String toString() {
        return "VipTicket{" + super.toString() + ", backstage=" + includesBackstage
                + ", лаунж=" + Practice08.f(loungeFee) + "}";
    }
}

class Weapon {
    private String title;
    private int baseDamage;

    public Weapon(String title, int baseDamage) {
        this.title = title;
        this.baseDamage = baseDamage;
    }

    public int calculateDamage() {
        return baseDamage;
    }

    @Override
    public String toString() {
        return "Weapon{" + title + ", шкода=" + calculateDamage() + "}";
    }
}

class EnchantedSword extends Weapon {
    private String element;
    private int magicPower;
    private int enchantmentLevel;

    public EnchantedSword(String title, int baseDamage, String element, int magicPower, int enchantmentLevel) {
        super(title, baseDamage);
        this.element = element;
        this.magicPower = magicPower;
        this.enchantmentLevel = enchantmentLevel;
    }

    @Override
    public int calculateDamage() {
        return super.calculateDamage() + magicPower * enchantmentLevel;
    }

    @Override
    public String toString() {
        return "EnchantedSword{" + super.toString() + ", стихія=" + element + ", магічна шкода="
                + (magicPower * enchantmentLevel) + " (" + magicPower + " x " + enchantmentLevel + ")}";
    }
}

class Parcel {
    private String trackingCode;
    private double weightKg;

    public Parcel(String trackingCode, double weightKg) {
        this.trackingCode = trackingCode;
        this.weightKg = weightKg;
    }

    public double calculateShippingCost() {
        return 50.0 + weightKg * 12.0;
    }

    @Override
    public String toString() {
        return "Parcel{" + trackingCode + ", " + weightKg + " кг, доставка=" + Practice08.f(calculateShippingCost()) + " грн}";
    }
}

class FragileParcel extends Parcel {
    private boolean requiresWoodenBox;
    private double insuranceValue;

    public FragileParcel(String trackingCode, double weightKg, boolean requiresWoodenBox, double insuranceValue) {
        super(trackingCode, weightKg);
        this.requiresWoodenBox = requiresWoodenBox;
        this.insuranceValue = insuranceValue;
    }

    @Override
    public double calculateShippingCost() {
        double cost = super.calculateShippingCost() + insuranceValue * 0.015;
        if (requiresWoodenBox) {
            cost += 120.0;
        }
        return cost;
    }

    @Override
    public String toString() {
        return "FragileParcel{" + super.toString() + ", страхування=" + Practice08.f(insuranceValue)
                + ", обрешітка=" + requiresWoodenBox + "}";
    }
}

class Appliance {
    private String model;
    private double powerWatts;

    public Appliance(String model, double powerWatts) {
        this.model = model;
        this.powerWatts = powerWatts;
    }

    public double getDailyConsumptionKWh(int hours) {
        return (powerWatts * hours) / 1000.0;
    }

    @Override
    public String toString() {
        return "Appliance{" + model + ", " + powerWatts + " Вт}";
    }
}

class EcoHeater extends Appliance {
    private boolean ecoModeActive;

    public EcoHeater(String model, double powerWatts, boolean ecoModeActive) {
        super(model, powerWatts);
        this.ecoModeActive = ecoModeActive;
    }

    @Override
    public double getDailyConsumptionKWh(int hours) {
        double base = super.getDailyConsumptionKWh(hours);
        return ecoModeActive ? base * 0.75 : base;
    }

    @Override
    public String toString() {
        return "EcoHeater{" + super.toString() + ", еко-режим=" + (ecoModeActive ? "увімкнено (-25%)" : "вимкнено") + "}";
    }
}

class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
}

class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double distanceToOrigin() {
        return Math.sqrt(Math.pow(super.distanceToOrigin(), 2) + z * z);
    }

    @Override
    public String toString() {
        return "(" + getX() + "; " + getY() + "; " + z + ")";
    }
}

class Coffee {
    private String roastType;
    private int volumeMl;
    private double basePrice;

    public Coffee(String roastType, int volumeMl, double basePrice) {
        this.roastType = roastType;
        this.volumeMl = volumeMl;
        this.basePrice = basePrice;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public double calculateCalories() {
        return volumeMl / 10.0;
    }

    public double calculatePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Coffee{" + roastType + ", " + volumeMl + " мл, калорії=" + Practice08.f(calculateCalories())
                + ", ціна=" + Practice08.f(calculatePrice()) + " грн}";
    }
}

class LatteWithAddons extends Coffee {
    private String milkType;
    private int syrupPumps;

    public LatteWithAddons(String roastType, int volumeMl, double basePrice, String milkType, int syrupPumps) {
        super(roastType, volumeMl, basePrice);
        this.milkType = milkType;
        this.syrupPumps = syrupPumps;
    }

    @Override
    public double calculateCalories() {
        double milkCalories = milkType.equalsIgnoreCase("Рослинне") ? 60 : 100;
        return super.calculateCalories() + milkCalories + syrupPumps * 20;
    }

    @Override
    public double calculatePrice() {
        double price = super.calculatePrice() + syrupPumps * 12;
        if (milkType.equalsIgnoreCase("Рослинне")) {
            price += 20;
        }
        return price;
    }

    @Override
    public String toString() {
        return "LatteWithAddons{" + super.toString() + ", молоко=" + milkType + ", сироп=" + syrupPumps + " порц.}";
    }
}

// ===================== Блок 4 =====================

class DotaHero {
    private String name;
    private String primaryAttribute;
    private int baseHp;

    public DotaHero(String name, String primaryAttribute, int baseHp) {
        this.name = name;
        this.primaryAttribute = primaryAttribute;
        this.baseHp = baseHp;
    }

    public String getName() {
        return name;
    }

    public int getMaxHp() {
        return baseHp;
    }

    @Override
    public String toString() {
        return "DotaHero{" + name + ", атрибут=" + primaryAttribute + ", maxHP=" + getMaxHp() + "}";
    }
}

class StrengthHero extends DotaHero {
    private int strength;

    public StrengthHero(String name, int baseHp, int strength) {
        super(name, "Сила", baseHp);
        this.strength = strength;
    }

    @Override
    public int getMaxHp() {
        return super.getMaxHp() + strength * 22;
    }

    @Override
    public String toString() {
        return "StrengthHero{" + super.toString() + ", сила=" + strength + "}";
    }
}

class AlchemistHero extends StrengthHero {
    private int greevilsGreedBonusGold;

    public AlchemistHero(String name, int baseHp, int strength, int greevilsGreedBonusGold) {
        super(name, baseHp, strength);
        this.greevilsGreedBonusGold = greevilsGreedBonusGold;
    }

    public void chemicalRage() {
        System.out.println(getName() + " активує Chemical Rage!");
    }

    @Override
    public String toString() {
        return "AlchemistHero{" + super.toString() + ", бонусне золото=" + greevilsGreedBonusGold + "}";
    }
}

class BaseVehicle {
    private String brand;
    private int year;

    public BaseVehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return "BaseVehicle{" + brand + ", " + year + "}";
    }
}

class MotorCar extends BaseVehicle {
    private int horsePower;
    private int doorsCount;

    public MotorCar(String brand, int year, int horsePower, int doorsCount) {
        super(brand, year);
        this.horsePower = horsePower;
        this.doorsCount = doorsCount;
    }

    @Override
    public String toString() {
        return "MotorCar{" + super.toString() + ", " + horsePower + " к.с., дверей: " + doorsCount + "}";
    }
}

class ElectricCar extends MotorCar {
    private double batteryCapacityKWh;
    private int rangeKm;

    public ElectricCar(String brand, int year, int horsePower, int doorsCount,
                       double batteryCapacityKWh, int rangeKm) {
        super(brand, year, horsePower, doorsCount);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.rangeKm = rangeKm;
    }

    @Override
    public String toString() {
        return "ElectricCar{" + super.toString() + ", батарея=" + batteryCapacityKWh + " кВт·год, запас ходу="
                + rangeKm + " км}";
    }
}

class PaymentCard {
    private String cardHolder;
    protected double balance;

    public PaymentCard(String cardHolder, double balance) {
        this.cardHolder = cardHolder;
        this.balance = balance;
    }

    public boolean pay(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "PaymentCard{" + cardHolder + ", баланс=" + Practice08.f(balance) + "}";
    }
}

class DebitCard extends PaymentCard {
    private double dailyLimit;

    public DebitCard(String cardHolder, double balance, double dailyLimit) {
        super(cardHolder, balance);
        this.dailyLimit = dailyLimit;
    }

    @Override
    public boolean pay(double amount) {
        if (amount > dailyLimit) {
            return false;
        }
        return super.pay(amount);
    }

    @Override
    public String toString() {
        return "DebitCard{" + super.toString() + ", ліміт=" + Practice08.f(dailyLimit) + "}";
    }
}

class CashbackPlatinumCard extends DebitCard {
    private double cashbackPercent;
    private double accumulatedCashback;

    public CashbackPlatinumCard(String cardHolder, double balance, double dailyLimit, double cashbackPercent) {
        super(cardHolder, balance, dailyLimit);
        this.cashbackPercent = cashbackPercent;
    }

    @Override
    public boolean pay(double amount) {
        boolean success = super.pay(amount);
        if (success) {
            accumulatedCashback += amount * cashbackPercent / 100.0;
        }
        return success;
    }

    @Override
    public String toString() {
        return "CashbackPlatinumCard{" + super.toString() + ", кешбек " + cashbackPercent
                + "%, накопичено=" + Practice08.f(accumulatedCashback) + "}";
    }
}

class SecurityTerminal {
    public final String generateAuthHash(String user) {
        return "AUTH-SHA-" + user.toUpperCase();
    }
}

class CustomTerminal extends SecurityTerminal {
    public String getWelcomeBanner() {
        return "Ласкаво просимо! Ваш підпис: " + generateAuthHash("guest");
    }
}

final class ImmutableServerCredentials {
    private final String host;
    private final int port;
    private final String apiKey;

    public ImmutableServerCredentials(String host, int port, String apiKey) {
        this.host = host;
        this.port = port;
        this.apiKey = apiKey;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String toString() {
        return "ServerCredentials{host=" + host + ", port=" + port + ", apiKey=SECRET}";
    }
}

class Segment1D {
    protected double length;

    public Segment1D(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Segment1D{length=" + length + "}";
    }
}

class Square2D extends Segment1D {
    public Square2D(double side) {
        super(side);
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public double getArea() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Square2D{" + super.toString() + ", P=" + getPerimeter() + ", S=" + getArea() + "}";
    }
}

class Cube3D extends Square2D {
    public Cube3D(double side) {
        super(side);
    }

    @Override
    public double getArea() {
        return 6 * super.getArea();
    }

    public double getVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "Cube3D{" + super.toString() + ", V=" + getVolume() + "}";
    }
}

class User {
    private int id;
    private String email;

    public User(int id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", email=" + email + "}";
    }
}

class StudentUser extends User {
    private String groupCode;
    protected double gpa;

    public StudentUser(int id, String email, String groupCode, double gpa) {
        super(id, email);
        this.groupCode = groupCode;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "StudentUser{" + super.toString() + ", група=" + groupCode + ", gpa=" + gpa + "}";
    }
}

class PostgraduateStudent extends StudentUser {
    private String thesisTopic;
    private String supervisorName;

    public PostgraduateStudent(int id, String email, String groupCode, double gpa,
                               String thesisTopic, String supervisorName) {
        super(id, email, groupCode, gpa);
        this.thesisTopic = thesisTopic;
        this.supervisorName = supervisorName;
    }

    public boolean canDefendThesis() {
        return gpa >= 85.0 && !thesisTopic.isBlank();
    }

    @Override
    public String toString() {
        return "PostgraduateStudent{" + super.toString() + ", тема='" + thesisTopic
                + "', керівник=" + supervisorName + "}";
    }
}

class Medicine {
    private String name;
    private double price;
    private boolean isExpired;

    public Medicine(String name, double price, boolean isExpired) {
        this.name = name;
        this.price = price;
        this.isExpired = isExpired;
    }

    public boolean isExpired() {
        return isExpired;
    }

    @Override
    public String toString() {
        return "Medicine{" + name + ", " + Practice08.f(price) + " грн, прострочено=" + isExpired + "}";
    }
}

class PrescriptionMedicine extends Medicine {
    private String doctorLicense;

    public PrescriptionMedicine(String name, double price, boolean isExpired, String doctorLicense) {
        super(name, price, isExpired);
        this.doctorLicense = doctorLicense;
    }

    public boolean canSell(boolean hasPrescription) {
        return !isExpired() && hasPrescription;
    }

    @Override
    public String toString() {
        return "PrescriptionMedicine{" + super.toString() + ", ліцензія лікаря=" + doctorLicense + "}";
    }
}

class ControlledSubstance extends PrescriptionMedicine {
    private int patientAge;

    public ControlledSubstance(String name, double price, boolean isExpired, String doctorLicense, int patientAge) {
        super(name, price, isExpired, doctorLicense);
        this.patientAge = patientAge;
    }

    @Override
    public boolean canSell(boolean hasPrescription) {
        return super.canSell(hasPrescription) && patientAge >= 18;
    }

    @Override
    public String toString() {
        return "ControlledSubstance{" + super.toString() + ", вік пацієнта=" + patientAge + "}";
    }
}

// ===================== Блок 5 =====================

class Progression {
    protected double firstTerm;
    protected double step;

    public Progression(double firstTerm, double step) {
        this.firstTerm = firstTerm;
        this.step = step;
    }

    public double getTerm(int n) {
        return firstTerm;
    }

    public double[] generateFirstN(int n) {
        double[] terms = new double[n];
        for (int i = 1; i <= n; i++) {
            terms[i - 1] = getTerm(i);
        }
        return terms;
    }

    @Override
    public String toString() {
        return "Progression{перші члени=" + Arrays.toString(generateFirstN(5)) + "}";
    }
}

class ArithmeticProgression extends Progression {
    public ArithmeticProgression(double firstTerm, double difference) {
        super(firstTerm, difference);
    }

    @Override
    public double getTerm(int n) {
        return firstTerm + (n - 1) * step;
    }

    @Override
    public String toString() {
        return "Арифметична (a_n = " + firstTerm + " + (n-1)*" + step + "): " + super.toString();
    }
}

class GeometricProgression extends Progression {
    public GeometricProgression(double firstTerm, double ratio) {
        super(firstTerm, ratio);
    }

    @Override
    public double getTerm(int n) {
        return firstTerm * Math.pow(step, n - 1);
    }

    @Override
    public String toString() {
        return "Геометрична (b_n = " + firstTerm + " * " + step + "^(n-1)): " + super.toString();
    }
}

class GradeSheet {
    private String studentName;
    protected int[] grades;

    public GradeSheet(String studentName, int[] grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    public double calculateScore() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    @Override
    public String toString() {
        return "GradeSheet{" + studentName + ", оцінки=" + Arrays.toString(grades)
                + ", середній=" + Practice08.f(calculateScore()) + "}";
    }
}

class WeightedGradeSheet extends GradeSheet {
    private double[] weights;

    public WeightedGradeSheet(String studentName, int[] grades, double[] weights) {
        super(studentName, grades);
        this.weights = weights;
    }

    @Override
    public double calculateScore() {
        double weightedSum = 0;
        double weightsSum = 0;
        for (int i = 0; i < grades.length; i++) {
            weightedSum += grades[i] * weights[i];
            weightsSum += weights[i];
        }
        return weightedSum / weightsSum;
    }

    @Override
    public String toString() {
        return "Weighted" + super.toString().replace("середній=", "зважений=") + ", ваги=" + Arrays.toString(weights);
    }
}

class LinearFunction {
    protected double k;
    protected double b;

    public LinearFunction(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public double evaluate(double x) {
        return k * x + b;
    }

    @Override
    public String toString() {
        return "f(x) = " + k + "x + " + b;
    }
}

class QuadraticFunction extends LinearFunction {
    private double a;

    public QuadraticFunction(double a, double k, double b) {
        super(k, b);
        this.a = a;
    }

    @Override
    public double evaluate(double x) {
        return a * x * x + super.evaluate(x);
    }

    public double getVertexX() {
        if (a == 0) {
            return Double.NaN;
        }
        return -k / (2 * a);
    }

    @Override
    public String toString() {
        return "f(x) = " + a + "x^2 + " + k + "x + " + b;
    }
}

class WarehouseItem {
    private String name;
    protected int quantity;
    private double[] priceHistory;

    public WarehouseItem(String name, int quantity, double[] priceHistory) {
        this.name = name;
        this.quantity = quantity;
        this.priceHistory = priceHistory;
    }

    public double getAveragePurchasePrice() {
        double sum = 0;
        for (double price : priceHistory) {
            sum += price;
        }
        return sum / priceHistory.length;
    }

    @Override
    public String toString() {
        return "WarehouseItem{" + name + ", кількість=" + quantity + ", середня закупівельна ціна="
                + Practice08.f(getAveragePurchasePrice()) + "}";
    }
}

class DiscountedWarehouseItem extends WarehouseItem {
    private String markdownReason;
    private double discountPercent;

    public DiscountedWarehouseItem(String name, int quantity, double[] priceHistory,
                                   String markdownReason, double discountPercent) {
        super(name, quantity, priceHistory);
        this.markdownReason = markdownReason;
        this.discountPercent = discountPercent;
    }

    public double getClearanceValue() {
        return quantity * getAveragePurchasePrice() * (1 - discountPercent / 100.0);
    }

    @Override
    public String toString() {
        return "DiscountedWarehouseItem{" + super.toString() + ", причина='" + markdownReason + "', знижка="
                + discountPercent + "%, вартість розпродажу=" + Practice08.f(getClearanceValue()) + "}";
    }
}

class CinemaHall {
    private String hallName;
    protected boolean[][] seats;
    protected double baseTicketPrice;

    public CinemaHall(String hallName, int rows, int cols, double baseTicketPrice) {
        this.hallName = hallName;
        this.seats = new boolean[rows][cols];
        this.baseTicketPrice = baseTicketPrice;
    }

    public boolean bookSeat(int row, int col) {
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length || seats[row][col]) {
            return false;
        }
        seats[row][col] = true;
        return true;
    }

    public int getOccupiedCount() {
        int count = 0;
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[r].length; c++) {
                if (seats[r][c]) {
                    count++;
                }
            }
        }
        return count;
    }

    public double calculateRevenue() {
        return getOccupiedCount() * baseTicketPrice;
    }

    @Override
    public String toString() {
        String result = hallName + " (зайнято " + getOccupiedCount() + ", виручка " + Practice08.f(calculateRevenue()) + " грн)\n";
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[r].length; c++) {
                result += seats[r][c] ? "[X]" : "[O]";
            }
            result += "\n";
        }
        return result;
    }
}

class VipCinemaHall extends CinemaHall {
    private double complimentaryBarCost;

    public VipCinemaHall(String hallName, int rows, int cols, double baseTicketPrice, double complimentaryBarCost) {
        super(hallName, rows, cols, baseTicketPrice);
        this.complimentaryBarCost = complimentaryBarCost;
    }

    // Націнка: кожен квиток останнього ряду дорожчий на вартість напоїв
    @Override
    public double calculateRevenue() {
        int lastRow = seats.length - 1;
        int lastRowOccupied = 0;
        for (int c = 0; c < seats[lastRow].length; c++) {
            if (seats[lastRow][c]) {
                lastRowOccupied++;
            }
        }
        return super.calculateRevenue() + lastRowOccupied * complimentaryBarCost;
    }
}

class TeamLead extends Developer {
    private Developer[] teamMembers;
    private int memberCount;

    public TeamLead(String name, double salary, String programmingLanguage, int maxTeamSize) {
        super(name, salary, programmingLanguage);
        this.teamMembers = new Developer[maxTeamSize];
    }

    public void addTeamMember(Developer dev) {
        if (memberCount < teamMembers.length) {
            teamMembers[memberCount] = dev;
            memberCount++;
        } else {
            System.out.println("Команда заповнена!");
        }
    }

    public double getTotalTeamBudget() {
        double total = getSalary();
        for (int i = 0; i < memberCount; i++) {
            total += teamMembers[i].getSalary();
        }
        return total;
    }

    @Override
    public String toString() {
        String result = "TeamLead{" + super.toString() + ", бюджет команди=" + Practice08.f(getTotalTeamBudget()) + " грн}\n";
        for (int i = 0; i < memberCount; i++) {
            result += "  " + (i + 1) + ". " + teamMembers[i] + "\n";
        }
        return result;
    }
}

class CharacterUnit {
    private String name;
    protected int hp;
    protected int maxHp;
    protected int armor;

    public CharacterUnit(String name, int maxHp, int armor) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.armor = armor;
    }

    public void takeDamage(int rawDamage) {
        int actual = Math.max(1, rawDamage - armor);
        hp -= actual;
        if (hp < 0) {
            hp = 0;
        }
    }

    @Override
    public String toString() {
        return name + " " + Practice08.healthBar(hp, maxHp) + " " + hp + "/" + maxHp + " HP, броня " + armor;
    }
}

class ShieldedPaladin extends CharacterUnit {
    private int shieldPoints;

    public ShieldedPaladin(String name, int maxHp, int armor, int shieldPoints) {
        super(name, maxHp, armor);
        this.shieldPoints = shieldPoints;
    }

    @Override
    public void takeDamage(int rawDamage) {
        if (shieldPoints >= rawDamage) {
            shieldPoints -= rawDamage;
            return;
        }
        int remainingDamage = rawDamage - shieldPoints;
        shieldPoints = 0;
        super.takeDamage(remainingDamage);
    }

    @Override
    public String toString() {
        return super.toString() + " | щит: " + shieldPoints;
    }
}
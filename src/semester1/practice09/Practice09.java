package semester1.practice09;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Practice09 {

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

    // ===== Блок 1: Інкапсуляція та захисне копіювання =====

    private static void task1() {
        ImmutableGeoPoint kyiv = new ImmutableGeoPoint(50.45, 30.52);
        ImmutableGeoPoint shifted = kyiv.shift(1.5, -2.0);
        ImmutableGeoPoint clamped = new ImmutableGeoPoint(95, 200);
        System.out.println("Київ: " + kyiv);
        System.out.println("Зі зсувом: " + shifted);
        System.out.println("Оригінал не змінився: " + kyiv);
        System.out.println("Обмежені координати: " + clamped);
    }

    private static void task2() {
        double[] source = {1.5, 2.5, 3.5};
        LabMeasurement measurement = new LabMeasurement("Дослід №1", source);
        source[0] = 999;
        System.out.println("Після зміни вхідного масиву: " + measurement);
        double[] leaked = measurement.getSamples();
        leaked[1] = -500;
        System.out.println("Після зміни масиву з геттера: " + measurement);
    }

    private static void task3() {
        CryptoVault vault = new CryptoVault("0xABC123", "secret phrase", 2.5);
        System.out.println(vault);
        System.out.println("Відправка заблокованого гаманця: " + vault.sendBtc(1.0, "0xDEST"));
        System.out.println("Розблокування неправильною фразою: " + vault.unlock("wrong"));
        System.out.println("Розблокування правильною фразою: " + vault.unlock("secret phrase"));
        System.out.println("Відправка 1.0 BTC: " + vault.sendBtc(1.0, "0xDEST"));
        System.out.println("Відправка 5.0 BTC: " + vault.sendBtc(5.0, "0xDEST"));
        vault.lock();
        System.out.println(vault);
    }

    private static void task4() {
        ClosedInterval interval = new ClosedInterval(10, 2);
        System.out.println(interval);
        ClosedInterval other = new ClosedInterval(8, 15);
        System.out.println(other);
        System.out.println("Перетинаються: " + interval.overlaps(other));
        interval.resize(20, 25);
        System.out.println(interval);
        System.out.println("Перетинаються: " + interval.overlaps(other));
    }

    private static void task5() {
        RgbColor orange = new RgbColor(255, 140, 0);
        RgbColor overflow = new RgbColor(300, -20, 128);
        System.out.println(orange);
        System.out.println(overflow);
        System.out.println("Інверсія: " + orange.invert());
        System.out.println("Змішування: " + orange.mixWith(new RgbColor(0, 0, 255)));
    }

    private static void task6() {
        HighSecuritySafe safe = new HighSecuritySafe(1234, 1000);
        System.out.println("Покласти 500 (правильний PIN): " + safe.putCash(1234, 500));
        System.out.println("Взяти 200 (неправильний PIN): " + safe.takeCash(1111, 200));
        System.out.println("Взяти 200 (неправильний PIN): " + safe.takeCash(2222, 200));
        System.out.println("Взяти 200 (неправильний PIN): " + safe.takeCash(3333, 200));
        System.out.println("Взяти 200 (правильний PIN, але сейф заблоковано): " + safe.takeCash(1234, 200));
    }

    private static void task7() {
        double[] coeffs = {1, 2, 3};
        EncapsulatedPolynomial polynomial = new EncapsulatedPolynomial(coeffs);
        coeffs[0] = 100;
        System.out.println("P(x) = " + polynomial);
        System.out.println("Степінь: " + polynomial.getDegree());
        System.out.println("Коефіцієнт при x^2: " + polynomial.getCoefficient(2));
        System.out.println("P(2) = " + polynomial.evaluate(2));
    }

    private static void task8() {
        MedicalRecord record = new MedicalRecord("P-001", "Іван Петренко", 2, true,
                new String[]{"Пеніцилін", "Пилок"});
        System.out.println(record);
        System.out.println("Алергія на пеніцилін: " + record.hasAllergyTo("пеніцилін"));
        System.out.println("Алергія на арахіс: " + record.hasAllergyTo("арахіс"));
    }

    // ===== Блок 2: Композиція (HAS-A) =====

    private static void task9() {
        CompositeCircle circle = new CompositeCircle(0, 0, 5);
        System.out.println(circle);
        System.out.println("Містить (3; 4): " + circle.containsPoint(new Point2D(3, 4)));
        System.out.println("Містить (5; 5): " + circle.containsPoint(new Point2D(5, 5)));
    }

    private static void task10() {
        Automobile car = new Automobile("Toyota Camry", "Бензин", 2500);
        car.accelerate(30);
        car.startEngine();
        car.accelerate(30);
        car.accelerate(40);
        System.out.println(car);
    }

    private static void task11() {
        SmartDevice device = new SmartDevice(4000, 10, 6.5, 80);
        System.out.println(device);
        device.watchVideo(60);
        System.out.println(device);
        device.watchVideo(60);
        System.out.println(device);
    }

    private static void task12() {
        Point2D a = new Point2D(0, 0);
        Point2D b = new Point2D(6, 8);
        LineSegment segment = new LineSegment(a, b);
        a.translate(100, 100);
        System.out.println("Відрізок після зміни зовнішньої точки: " + segment);
        System.out.println("Довжина: " + segment.getLength());
        System.out.println("Середина: " + segment.getMidpoint());
    }

    private static void task13() {
        BankAccount family = new BankAccount("UA-FAMILY", 5000);
        PlasticCard card1 = new PlasticCard("4111111111111111", "12/28", family);
        PlasticCard card2 = new PlasticCard("5222222222222222", "01/29", family);
        System.out.println("Оплата карткою 1 (1500): " + card1.payAtTerminal(1500));
        System.out.println("Оплата карткою 2 (2000): " + card2.payAtTerminal(2000));
        card2.setBlocked(true);
        System.out.println("Оплата заблокованою карткою 2 (100): " + card2.payAtTerminal(100));
        System.out.println("Залишок на спільному рахунку: " + f(family.getBalance()) + " грн");
    }

    private static void task14() {
        HeroCharacter hero = new HeroCharacter("Артур", 20);
        System.out.println("Без зброї: " + hero.attack());
        hero.equip(new WeaponItem("Меч", 30, 30));
        for (int i = 1; i <= 4; i++) {
            System.out.println("Удар " + i + ": " + hero.attack());
        }
        hero.unequip();
        System.out.println("Знову без зброї: " + hero.attack());
    }

    private static void task15() {
        ParcelOrder order = new ParcelOrder("ORD-1", 2.5, new DeliveryAddress("Київ", "Хрещатик", 12));
        System.out.println(order);
        System.out.println("Зміна адреси до відправки: "
                + order.changeDestination(new DeliveryAddress("Львів", "Городоцька", 5)));
        order.markAsShipped();
        System.out.println("Зміна адреси після відправки: "
                + order.changeDestination(new DeliveryAddress("Одеса", "Дерибасівська", 1)));
        System.out.println(order);
    }

    private static void task16() {
        ClimateController controller = new ClimateController(22.0, 18.0);
        controller.regulate();
        System.out.println(controller);
        controller.updateTemperature(22.5);
        controller.regulate();
        System.out.println(controller);
    }

    // ===== Блок 3: Композиція з масивами (HAS-MANY) =====

    private static void task17() {
        Polyline polyline = new Polyline(5);
        polyline.addVertex(0, 0);
        polyline.addVertex(3, 0);
        polyline.addVertex(3, 4);
        System.out.println("Довжина ламаної: " + polyline.getTotalLength());
        System.out.println("Периметр замкненої: " + polyline.getClosedPerimeter());
    }

    private static void task18() {
        ShoppingOrder order = new ShoppingOrder(10);
        order.addItem("Клавіатура", 1200, 1);
        order.addItem("Миша", 650, 2);
        order.addItem("Клавіатура", 1200, 1);
        System.out.println(order);
    }

    private static void task19() {
        Bookshelf shelf = new Bookshelf("Фантастика", 3);
        shelf.putBook(new BookItem("Дюна", "Френк Герберт", 704));
        shelf.putBook(new BookItem("Соляріс", "Станіслав Лем", 256));
        shelf.putBook(new BookItem("Фундація", "Айзек Азімов", 320));
        System.out.println("Четверта книга додана: " + shelf.putBook(new BookItem("Тест", "Автор", 100)));
        System.out.println("Найдовша книга: " + shelf.findLongestBook());
        System.out.println("Всього сторінок на полиці: " + shelf.getTotalPagesOnShelf());
    }

    private static void task20() {
        Playlist playlist = new Playlist("Ранкова", 5);
        playlist.addTrack(new AudioTrack("Intro", "Band A", 185));
        playlist.addTrack(new AudioTrack("Sunrise", "Band B", 240));
        playlist.addTrack(new AudioTrack("Coffee", "Band C", 215));
        System.out.println(playlist);
    }

    private static void task21() {
        DataCenterCluster cluster = new DataCenterCluster("Київ-1", 3);
        cluster.addNode(new ServerNode("10.0.0.1", 16, 12, true));
        cluster.addNode(new ServerNode("10.0.0.2", 32, 4, true));
        cluster.addNode(new ServerNode("10.0.0.3", 64, 0, false));
        System.out.println("Контейнер 8 ГБ: " + cluster.deployContainer(8));
        System.out.println("Контейнер 20 ГБ: " + cluster.deployContainer(20));
        System.out.println("Контейнер 20 ГБ ще раз (немає ресурсів): " + cluster.deployContainer(20));
        System.out.println(cluster);
    }

    private static void task22() {
        UniversityCourse course = new UniversityCourse("Програмування Java", 3);
        course.addModule(new CourseModule("Основи", 30, 30, 30));
        course.addModule(new CourseModule("ООП", 40, 40, 40));
        course.addModule(new CourseModule("Колекції", 20, 20, 30));
        System.out.println("Кредитів ЄКТС: " + Practice09.f(course.getEctsCredits()));
        System.out.println("Сума балів дорівнює 100: " + course.isScoreValid());
    }

    private static void task23() {
        PassengerTrain train = new PassengerTrain("Київ - Львів", 3);
        train.attachCarriage(new TrainCarriage(1, "Купе", 36));
        train.attachCarriage(new TrainCarriage(2, "Плацкарт", 54));
        train.attachCarriage(new TrainCarriage(3, "Інтерсіті", 60));
        System.out.println("Вільних місць: " + train.getTotalFreeSeats());
        System.out.println("Бронь 10 місць у вагоні 2: " + train.bookTicketsInCarriage(2, 10));
        System.out.println("Бронь 100 місць у вагоні 1: " + train.bookTicketsInCarriage(1, 100));
        System.out.println("Вільних місць: " + train.getTotalFreeSeats());
    }

    private static void task24() {
        EquationSystem system = new EquationSystem(3);
        system.addEquation(new LinearEquation(2, 3, 8));
        system.addEquation(new LinearEquation(4, -1, 2));
        System.out.println("(1; 2) є розв'язком: " + system.checkSolution(1, 2));
        System.out.println("(2; 1) є розв'язком: " + system.checkSolution(2, 1));
    }

    // ===== Блок 4: Абстрактні класи =====

    private static void task25() {
        // AbstractShape shape = new AbstractShape("Red"); // помилка: 'AbstractShape' is abstract
        AbstractShape circle = new CircleShape("Червоний", 5);
        AbstractShape rectangle = new RectangleShape("Синій", 4, 6);
        System.out.println(circle);
        System.out.println(rectangle);
    }

    private static void task26() {
        AbstractPowerPlant solar = new SolarPowerPlant("Сонячна-1", 100, 0.6);
        AbstractPowerPlant wind = new WindPowerPlant("Вітрова-1", 80, 9);
        AbstractPowerPlant calm = new WindPowerPlant("Вітрова-2", 80, 1);
        AbstractPowerPlant[] plants = {solar, wind, calm};
        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i].getName() + ": " + f(plants[i].generateMegawatts())
                    + " МВт, прибуток за добу при тарифі 50: " + f(plants[i].calculateDailyProfit(50)));
        }
    }

    private static void task27() {
        AbstractEmployee salaried = new SalariedEmployee(1, "Ольга", 30000, 5000);
        AbstractEmployee hourly = new HourlyContractor(2, "Тарас", 180, 200);
        System.out.println(salaried.getName() + ": брутто " + f(salaried.calculateGrossSalary())
                + ", нетто " + f(salaried.calculateNetSalary()));
        System.out.println(hourly.getName() + ": брутто " + f(hourly.calculateGrossSalary())
                + ", нетто " + f(hourly.calculateNetSalary()));
    }

    private static void task28() {
        AbstractSequence harmonic = new HarmonicSequence();
        AbstractSequence squares = new SquareNumbersSequence();
        System.out.println(harmonic.getTitle() + ", сума перших 5: " + harmonic.sumFirstN(5));
        System.out.println(squares.getTitle() + ", сума перших 5: " + squares.sumFirstN(5));
    }

    private static void task29() {
        AbstractTransaction domestic = new DomesticTransfer("TX-1", 10000);
        AbstractTransaction small = new DomesticTransfer("TX-2", 100);
        AbstractTransaction crypto = new CryptoTransfer("TX-3", 5000, 25);
        AbstractTransaction[] transactions = {domestic, small, crypto};
        for (int i = 0; i < transactions.length; i++) {
            System.out.println(transactions[i].getTxId() + ": комісія " + f(transactions[i].calculateCommission())
                    + ", всього до списання " + f(transactions[i].getTotalDebit()));
        }
    }

    private static void task30() {
        Solid3D steelSphere = new Sphere3D("Сталь", 7850, 0.5);
        Solid3D goldCylinder = new Cylinder3D("Золото", 19320, 0.1, 0.3);
        System.out.println(steelSphere.getMaterialName() + " куля: V=" + steelSphere.getVolume()
                + ", S=" + steelSphere.getSurfaceArea() + ", маса=" + f(steelSphere.getMassKg()) + " кг");
        System.out.println(goldCylinder.getMaterialName() + " циліндр: V=" + goldCylinder.getVolume()
                + ", S=" + goldCylinder.getSurfaceArea() + ", маса=" + f(goldCylinder.getMassKg()) + " кг");
    }

    private static void task31() {
        AbstractSensor pressure = new PressureSensor("Котельня", 1.0, 5.0, 6.2, 1.0);
        AbstractSensor radiation = new RadiationSensor("Лабораторія", 0.0, 0.3, 0.12);
        System.out.println(pressure.getLocation() + ": " + pressure.readValue() + " " + pressure.getUnit()
                + ", тривога: " + pressure.isAlarmTriggered());
        System.out.println(radiation.getLocation() + ": " + radiation.readValue() + " " + radiation.getUnit()
                + ", тривога: " + radiation.isAlarmTriggered());
    }

    private static void task32() {
        AbstractCompressor zip = new ZipCompressor();
        AbstractCompressor lzma = new UltraLzmaCompressor();
        int original = 10000;
        System.out.println(zip.getAlgorithmName() + ": " + zip.estimateCompressedSize(original)
                + " байт, стиснення " + f(zip.getCompressionRatio(original)) + "%");
        System.out.println(lzma.getAlgorithmName() + ": " + lzma.estimateCompressedSize(original)
                + " байт, стиснення " + f(lzma.getCompressionRatio(original)) + "%");
    }

    // ===== Блок 5: Синергія =====

    private static void task33() {
        AbstractPcPart[] parts = {
                new ProcessorPart("Ryzen 9", 21900, 16, 170),
                new VideoCardPart("RTX 4080", 47000, 16, 320)
        };
        DesktopPC okPc = new DesktopPC(750, parts);
        DesktopPC weakPc = new DesktopPC(500, parts);
        System.out.println("Потужність деталей: " + okPc.getTotalPowerWatts() + " Вт");
        System.out.println("БЖ 750 Вт, система стабільна: " + okPc.isStable());
        System.out.println("БЖ 500 Вт, система стабільна: " + weakPc.isStable());
    }

    private static void task34() {
        Spacecraft ship = new Spacecraft("Орел", 50, 4);
        ship.addThruster(new ChemicalThruster("CH-1", 400, 12.5));
        ship.addThruster(new ChemicalThruster("CH-2", 400, 12.5));
        ship.addThruster(new IonThruster("ION-1", 0.5, 0.01));
        System.out.println("Сумарна тяга: " + ship.getTotalThrustKn() + " кН");
        System.out.println("Початкове прискорення: " + f(ship.getInitialAcceleration()) + " м/с²");
    }

    private static void task35() {
        LandPlot plot = new LandPlot(1000, 5);
        System.out.println("Будинок 12x20 (240 м²): " + plot.addStructure(new RectangleShape("Будинок", 12, 20)));
        System.out.println("Клумба r=5 (≈78.5 м²): " + plot.addStructure(new CircleShape("Клумба", 5)));
        System.out.println("Гараж 20x20 (400 м²): " + plot.addStructure(new RectangleShape("Гараж", 20, 20)));
        System.out.println("Вільна площа газону: " + f(plot.getFreeGreenArea()) + " м²");
    }

    private static void task36() {
        InvestmentPortfolio portfolio = new InvestmentPortfolio("Олена", 5);
        portfolio.addAsset(new GovernmentBond("ОВДП-2027", 100000, 15.5));
        portfolio.addAsset(new DividendStock("AAPL", 50000, 8.0, 2.0));
        System.out.println("Вартість портфеля: " + f(portfolio.getTotalInvested()) + " грн");
        System.out.println("Очікуваний річний прибуток: " + f(portfolio.getTotalAnnualReturn()) + " грн");
    }

    private static void task37() {
        RaidParty party = new RaidParty("Фенікс", 4);
        party.addMember(new ArcaneMage("Мерлін", 800, 90, 150));
        System.out.println("Без танка загін готовий: " + party.isReadyForRaid(100));
        party.addMember(new TankWarrior("Конан", 2000, 80));
        System.out.println("Із танком, складність 100: " + party.isReadyForRaid(100));
        System.out.println("Із танком, складність 1000: " + party.isReadyForRaid(1000));
    }

    private static void task38() {
        AbstractSensor[] sensors = {
                new PressureSensor("Котельня", 1.0, 5.0, 3.2, 1.0),
                new RadiationSensor("Лабораторія", 0.0, 0.3, 0.12)
        };
        SmartLab safeLab = new SmartLab(sensors);
        safeLab.runDiagnostics();

        AbstractSensor[] dangerous = {
                new PressureSensor("Котельня", 1.0, 5.0, 7.5, 1.0),
                new RadiationSensor("Лабораторія", 0.0, 0.3, 0.12)
        };
        SmartLab dangerLab = new SmartLab(dangerous);
        dangerLab.runDiagnostics();
    }

    private static void task39() {
        AbstractFilter[] pipeline = {new AmplifierFilter(2.0), new ClippingFilter(5.0)};
        SignalProcessor processor = new SignalProcessor(pipeline);
        double[] signal = {1.0, 2.0, -3.0, 4.0};
        double[] result = processor.process(signal);
        System.out.println("Вхідний сигнал: " + Arrays.toString(signal));
        System.out.println("Після підсилення x2 та обрізання ±5: " + Arrays.toString(result));
    }

    private static void task40() {
        System.out.println("Завдання 40: коміт та Push у GitHub.");
        System.out.println("1. IntelliJ: Ctrl+K, зняти галочку Amend, вибрати файли, ввести повідомлення, Commit.");
        System.out.println("2. Ctrl+Shift+K -> Push.");
        System.out.println("3. Перевірити файли в репозиторії у браузері.");
    }
}

// ===================== Блок 1 =====================

final class ImmutableGeoPoint {
    private final double latitude;
    private final double longitude;

    public ImmutableGeoPoint(double latitude, double longitude) {
        this.latitude = Math.max(-90.0, Math.min(90.0, latitude));
        this.longitude = Math.max(-180.0, Math.min(180.0, longitude));
    }

    public ImmutableGeoPoint shift(double dLat, double dLon) {
        return new ImmutableGeoPoint(latitude + dLat, longitude + dLon);
    }

    @Override
    public String toString() {
        return "GeoPoint(" + Practice09.f(latitude) + "; " + Practice09.f(longitude) + ")";
    }
}

class LabMeasurement {
    private final String experimentName;
    private final double[] samples;

    public LabMeasurement(String experimentName, double[] samples) {
        this.experimentName = experimentName;
        this.samples = (samples == null) ? new double[0] : Arrays.copyOf(samples, samples.length);
    }

    public double[] getSamples() {
        return Arrays.copyOf(samples, samples.length);
    }

    @Override
    public String toString() {
        return experimentName + " " + Arrays.toString(samples);
    }
}

class CryptoVault {
    private final String walletAddress;
    private final String secretRecoveryPhrase;
    private double btcBalance;
    private boolean locked = true;

    public CryptoVault(String walletAddress, String secretRecoveryPhrase, double btcBalance) {
        this.walletAddress = walletAddress;
        this.secretRecoveryPhrase = secretRecoveryPhrase;
        this.btcBalance = Math.max(0, btcBalance);
    }

    public boolean unlock(String phrase) {
        if (secretRecoveryPhrase.equals(phrase)) {
            locked = false;
            return true;
        }
        return false;
    }

    public void lock() {
        locked = true;
    }

    public boolean sendBtc(double amount, String destination) {
        if (!locked && amount > 0 && btcBalance >= amount) {
            btcBalance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CryptoVault{address=" + walletAddress + ", locked=" + locked + ", balance=" + btcBalance + " BTC}";
    }
}

class ClosedInterval {
    private double start;
    private double end;

    public ClosedInterval(double start, double end) {
        resize(start, end);
    }

    public void resize(double newStart, double newEnd) {
        if (newStart > newEnd) {
            this.start = newEnd;
            this.end = newStart;
        } else {
            this.start = newStart;
            this.end = newEnd;
        }
    }

    public double getLength() {
        return end - start;
    }

    public double getMidpoint() {
        return (start + end) / 2;
    }

    public boolean overlaps(ClosedInterval other) {
        return this.start <= other.end && other.start <= this.end;
    }

    @Override
    public String toString() {
        return "[" + start + "; " + end + "] (центр: " + getMidpoint() + ", довжина: " + getLength() + ")";
    }
}

final class RgbColor {
    private final int red;
    private final int green;
    private final int blue;

    public RgbColor(int red, int green, int blue) {
        this.red = clamp(red);
        this.green = clamp(green);
        this.blue = clamp(blue);
    }

    private static int clamp(int val) {
        return Math.max(0, Math.min(255, val));
    }

    public String toHex() {
        return String.format("#%02X%02X%02X", red, green, blue);
    }

    public RgbColor invert() {
        return new RgbColor(255 - red, 255 - green, 255 - blue);
    }

    public RgbColor mixWith(RgbColor other) {
        return new RgbColor((red + other.red) / 2, (green + other.green) / 2, (blue + other.blue) / 2);
    }

    @Override
    public String toString() {
        return "RgbColor(" + red + ", " + green + ", " + blue + ") " + toHex();
    }
}

class HighSecuritySafe {
    private final int pinCode;
    private double storedCash;
    private int failedAttempts;
    private boolean permanentlyBlocked;

    public HighSecuritySafe(int pinCode, double storedCash) {
        this.pinCode = pinCode;
        this.storedCash = storedCash;
    }

    private boolean checkAccess(int enteredPin) {
        if (permanentlyBlocked) {
            return false;
        }
        if (enteredPin != pinCode) {
            failedAttempts++;
            if (failedAttempts >= 3) {
                permanentlyBlocked = true;
            }
            return false;
        }
        failedAttempts = 0;
        return true;
    }

    public boolean putCash(int pin, double amount) {
        if (checkAccess(pin) && amount > 0) {
            storedCash += amount;
            return true;
        }
        return false;
    }

    public boolean takeCash(int pin, double amount) {
        if (checkAccess(pin) && amount > 0 && amount <= storedCash) {
            storedCash -= amount;
            return true;
        }
        return false;
    }
}

class EncapsulatedPolynomial {
    private final double[] coeffs;

    public EncapsulatedPolynomial(double[] coeffs) {
        this.coeffs = Arrays.copyOf(coeffs, coeffs.length);
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double getCoefficient(int power) {
        if (power < 0 || power >= coeffs.length) {
            return 0.0;
        }
        return coeffs[power];
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result = result * x + coeffs[i];
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < coeffs.length; i++) {
            if (coeffs[i] == 0) {
                continue;
            }
            if (!result.isEmpty()) {
                result += " + ";
            }
            if (i == 0) {
                result += coeffs[i];
            } else if (i == 1) {
                result += coeffs[i] + "x";
            } else {
                result += coeffs[i] + "x^" + i;
            }
        }
        return result.isEmpty() ? "0" : result;
    }
}

class MedicalRecord {
    private final String patientId;
    private String fullName;
    private int bloodGroup;
    private boolean rhPositive;
    private String[] allergies;

    public MedicalRecord(String patientId, String fullName, int bloodGroup, boolean rhPositive, String[] allergies) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.bloodGroup = (bloodGroup < 1 || bloodGroup > 4) ? 1 : bloodGroup;
        this.rhPositive = rhPositive;
        this.allergies = (allergies == null) ? new String[0] : Arrays.copyOf(allergies, allergies.length);
    }

    public String[] getAllergies() {
        return Arrays.copyOf(allergies, allergies.length);
    }

    public boolean hasAllergyTo(String substance) {
        for (String allergy : allergies) {
            if (allergy.equalsIgnoreCase(substance)) {
                return true;
            }
        }
        return false;
    }

    private String bloodGroupName() {
        return switch (bloodGroup) {
            case 1 -> "I (O)";
            case 2 -> "II (A)";
            case 3 -> "III (B)";
            default -> "IV (AB)";
        };
    }

    @Override
    public String toString() {
        return "MedicalRecord{" + patientId + ", " + fullName + ", кров: " + bloodGroupName()
                + " Rh" + (rhPositive ? "+" : "-") + ", алергії: " + Arrays.toString(allergies) + "}";
    }
}

// ===================== Блок 2 =====================

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

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distanceTo(Point2D other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }

    @Override
    public String toString() {
        return "(" + Practice09.f(x) + "; " + Practice09.f(y) + ")";
    }
}

class CompositeCircle {
    private double radius;
    private final Point2D center;

    public CompositeCircle(double centerX, double centerY, double radius) {
        this.center = new Point2D(centerX, centerY);
        this.radius = (radius > 0) ? radius : 1.0;
    }

    public boolean containsPoint(Point2D p) {
        return center.distanceTo(p) <= radius;
    }

    @Override
    public String toString() {
        return "CompositeCircle{center=" + center + ", r=" + radius + "}";
    }
}

class Engine {
    private final String fuelType;
    private final int volumeCc;
    private int rpm;
    private boolean started;

    public Engine(String fuelType, int volumeCc) {
        this.fuelType = fuelType;
        this.volumeCc = volumeCc;
    }

    public void start() {
        started = true;
        rpm = 800;
    }

    public void stop() {
        started = false;
        rpm = 0;
    }

    public boolean isStarted() {
        return started;
    }

    public void setRpm(int rpm) {
        this.rpm = Math.max(0, Math.min(7000, rpm));
    }

    @Override
    public String toString() {
        return "Engine{" + fuelType + ", " + volumeCc + " см³, " + rpm + " об/хв, started=" + started + "}";
    }
}

class Automobile {
    private final String model;
    private double speed;
    private final Engine engine;

    public Automobile(String model, String fuelType, int volumeCc) {
        this.model = model;
        this.engine = new Engine(fuelType, volumeCc);
    }

    public void startEngine() {
        engine.start();
    }

    public void accelerate(double deltaSpeed) {
        if (!engine.isStarted()) {
            System.out.println("Спершу заведіть двигун!");
            return;
        }
        speed += deltaSpeed;
        engine.setRpm(800 + (int) (speed * 30));
    }

    @Override
    public String toString() {
        return "Automobile{" + model + ", " + speed + " км/год, " + engine + "}";
    }
}

class Battery {
    private final int capacityMah;
    private int chargePercent;

    public Battery(int capacityMah, int chargePercent) {
        this.capacityMah = capacityMah;
        this.chargePercent = Math.max(0, Math.min(100, chargePercent));
    }

    public void drain(int percent) {
        chargePercent = Math.max(0, chargePercent - percent);
    }

    public void charge(int percent) {
        chargePercent = Math.min(100, chargePercent + percent);
    }

    public int getChargePercent() {
        return chargePercent;
    }

    @Override
    public String toString() {
        return capacityMah + " мА·год, заряд " + chargePercent + "%";
    }
}

class Display {
    private final double diagonalInches;
    private int brightnessPercent;

    public Display(double diagonalInches, int brightnessPercent) {
        this.diagonalInches = diagonalInches;
        this.brightnessPercent = Math.max(10, Math.min(100, brightnessPercent));
    }

    public int getBrightnessPercent() {
        return brightnessPercent;
    }

    @Override
    public String toString() {
        return diagonalInches + "\", яскравість " + brightnessPercent + "%";
    }
}

class SmartDevice {
    private final Battery battery;
    private final Display display;
    private boolean poweredOn = true;

    public SmartDevice(int capacityMah, int chargePercent, double diagonalInches, int brightnessPercent) {
        this.battery = new Battery(capacityMah, chargePercent);
        this.display = new Display(diagonalInches, brightnessPercent);
    }

    public void watchVideo(int minutes) {
        if (!poweredOn) {
            System.out.println("Пристрій вимкнено.");
            return;
        }
        int drainPerTenMinutes = (display.getBrightnessPercent() > 70) ? 2 : 1;
        battery.drain((minutes / 10) * drainPerTenMinutes);
        if (battery.getChargePercent() == 0) {
            poweredOn = false;
        }
    }

    @Override
    public String toString() {
        return "SmartDevice{батарея: " + battery + ", дисплей: " + display + ", увімкнений: " + poweredOn + "}";
    }
}

class LineSegment {
    private final Point2D start;
    private final Point2D end;

    public LineSegment(Point2D start, Point2D end) {
        this.start = new Point2D(start.getX(), start.getY());
        this.end = new Point2D(end.getX(), end.getY());
    }

    public double getLength() {
        return start.distanceTo(end);
    }

    public Point2D getMidpoint() {
        return new Point2D((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
    }

    @Override
    public String toString() {
        return "LineSegment{" + start + " -> " + end + "}";
    }
}

class BankAccount {
    private final String iban;
    private double balance;

    public BankAccount(String iban, double balance) {
        this.iban = iban;
        this.balance = Math.max(0, balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

class PlasticCard {
    private final String cardNumber;
    private final String expiryDate;
    private boolean blocked;
    private final BankAccount linkedAccount;

    public PlasticCard(String cardNumber, String expiryDate, BankAccount linkedAccount) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.linkedAccount = linkedAccount;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean payAtTerminal(double amount) {
        if (blocked) {
            return false;
        }
        return linkedAccount.withdraw(amount);
    }
}

class WeaponItem {
    private final String name;
    private final int bonusDamage;
    private int durability;

    public WeaponItem(String name, int bonusDamage, int durability) {
        this.name = name;
        this.bonusDamage = bonusDamage;
        this.durability = Math.max(0, Math.min(100, durability));
    }

    public void useWeapon() {
        durability = Math.max(0, durability - 10);
    }

    public int getBonusDamage() {
        return (durability == 0) ? 0 : bonusDamage;
    }
}

class HeroCharacter {
    private final String nickname;
    private int baseStrength;
    private WeaponItem equippedWeapon;

    public HeroCharacter(String nickname, int baseStrength) {
        this.nickname = nickname;
        this.baseStrength = baseStrength;
    }

    public void equip(WeaponItem newWeapon) {
        this.equippedWeapon = newWeapon;
    }

    public void unequip() {
        this.equippedWeapon = null;
    }

    public int attack() {
        int damage = baseStrength;
        if (equippedWeapon != null) {
            damage += equippedWeapon.getBonusDamage();
            equippedWeapon.useWeapon();
        }
        return damage;
    }
}

class DeliveryAddress {
    private final String city;
    private final String street;
    private final int postOfficeNumber;

    public DeliveryAddress(String city, String street, int postOfficeNumber) {
        this.city = city;
        this.street = street;
        this.postOfficeNumber = Math.max(1, postOfficeNumber);
    }

    @Override
    public String toString() {
        return city + ", " + street + ", відділення №" + postOfficeNumber;
    }
}

class ParcelOrder {
    private final String orderId;
    private double weightKg;
    private DeliveryAddress destination;
    private boolean shipped;

    public ParcelOrder(String orderId, double weightKg, DeliveryAddress destination) {
        this.orderId = orderId;
        this.weightKg = weightKg;
        this.destination = destination;
    }

    public boolean changeDestination(DeliveryAddress newAddress) {
        if (shipped || newAddress == null) {
            return false;
        }
        this.destination = newAddress;
        return true;
    }

    public void markAsShipped() {
        shipped = true;
    }

    @Override
    public String toString() {
        return "ParcelOrder{" + orderId + ", " + weightKg + " кг, адреса: " + destination + ", відправлено: " + shipped + "}";
    }
}

class TemperatureSensor {
    private double currentTemp;

    public TemperatureSensor(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    public double getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(double currentTemp) {
        this.currentTemp = currentTemp;
    }
}

class HeatingUnit {
    private boolean heatingOn;
    private final double powerKw;

    public HeatingUnit(double powerKw) {
        this.powerKw = powerKw;
    }

    public void turnOn() {
        heatingOn = true;
    }

    public void turnOff() {
        heatingOn = false;
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }

    @Override
    public String toString() {
        return "обігрівач " + powerKw + " кВт, увімкнено: " + heatingOn;
    }
}

class ClimateController {
    private final TemperatureSensor sensor;
    private final HeatingUnit heatingUnit;
    private double targetTemp;

    public ClimateController(double targetTemp, double currentTemp) {
        this.targetTemp = targetTemp;
        this.sensor = new TemperatureSensor(currentTemp);
        this.heatingUnit = new HeatingUnit(2.0);
    }

    public void updateTemperature(double temp) {
        sensor.setCurrentTemp(temp);
    }

    public void regulate() {
        double current = sensor.getCurrentTemp();
        if (current < targetTemp - 0.5) {
            heatingUnit.turnOn();
        } else if (current >= targetTemp) {
            heatingUnit.turnOff();
        }
    }

    @Override
    public String toString() {
        return "ClimateController{поточна " + sensor.getCurrentTemp() + "°C, ціль " + targetTemp + "°C, " + heatingUnit + "}";
    }
}

// ===================== Блок 3 =====================

class Polyline {
    private final Point2D[] vertices;
    private int count;

    public Polyline(int capacity) {
        this.vertices = new Point2D[capacity];
    }

    public void addVertex(double x, double y) {
        if (count < vertices.length) {
            vertices[count] = new Point2D(x, y);
            count++;
        }
    }

    public double getTotalLength() {
        double total = 0;
        for (int i = 0; i < count - 1; i++) {
            total += vertices[i].distanceTo(vertices[i + 1]);
        }
        return total;
    }

    public double getClosedPerimeter() {
        if (count < 2) {
            return 0;
        }
        return getTotalLength() + vertices[count - 1].distanceTo(vertices[0]);
    }
}

class OrderItem {
    private final String productName;
    private final double unitPrice;
    private int quantity;

    public OrderItem(String productName, double unitPrice, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void addQuantity(int extra) {
        quantity += extra;
    }

    public double getItemTotal() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return productName + " x" + quantity + " по " + Practice09.f(unitPrice) + " = " + Practice09.f(getItemTotal());
    }
}

class ShoppingOrder {
    private final OrderItem[] items;
    private int itemCount;

    public ShoppingOrder(int capacity) {
        this.items = new OrderItem[capacity];
    }

    public void addItem(String name, double price, int qty) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getProductName().equals(name)) {
                items[i].addQuantity(qty);
                return;
            }
        }
        if (itemCount < items.length) {
            items[itemCount] = new OrderItem(name, price, qty);
            itemCount++;
        }
    }

    public double calculateGrandTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getItemTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        String result = "--- ЧЕК ---\n";
        for (int i = 0; i < itemCount; i++) {
            result += (i + 1) + ". " + items[i] + " грн\n";
        }
        result += "РАЗОМ: " + Practice09.f(calculateGrandTotal()) + " грн";
        return result;
    }
}

class BookItem {
    private final String title;
    private final String author;
    private final int pages;

    public BookItem(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "\"" + title + "\", " + author + ", " + pages + " стор.";
    }
}

class Bookshelf {
    private final String genre;
    private final BookItem[] books;
    private int bookCount;

    public Bookshelf(String genre, int capacity) {
        this.genre = genre;
        this.books = new BookItem[capacity];
    }

    public boolean putBook(BookItem book) {
        if (book == null || bookCount >= books.length) {
            return false;
        }
        books[bookCount] = book;
        bookCount++;
        return true;
    }

    public BookItem findLongestBook() {
        if (bookCount == 0) {
            return null;
        }
        BookItem longest = books[0];
        for (int i = 1; i < bookCount; i++) {
            if (books[i].getPages() > longest.getPages()) {
                longest = books[i];
            }
        }
        return longest;
    }

    public int getTotalPagesOnShelf() {
        int total = 0;
        for (int i = 0; i < bookCount; i++) {
            total += books[i].getPages();
        }
        return total;
    }
}

class AudioTrack {
    private final String title;
    private final String artist;
    private final int durationSeconds;

    public AudioTrack(String title, String artist, int durationSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public String formatDuration() {
        return String.format("%02d:%02d", durationSeconds / 60, durationSeconds % 60);
    }

    @Override
    public String toString() {
        return artist + " - " + title + " (" + formatDuration() + ")";
    }
}

class Playlist {
    private final String name;
    private final AudioTrack[] tracks;
    private int trackCount;

    public Playlist(String name, int capacity) {
        this.name = name;
        this.tracks = new AudioTrack[capacity];
    }

    public void addTrack(AudioTrack track) {
        if (track != null && trackCount < tracks.length) {
            tracks[trackCount] = track;
            trackCount++;
        }
    }

    public int getTotalDurationSeconds() {
        int total = 0;
        for (int i = 0; i < trackCount; i++) {
            total += tracks[i].getDurationSeconds();
        }
        return total;
    }

    @Override
    public String toString() {
        String result = "Плейлист '" + name + "':\n";
        for (int i = 0; i < trackCount; i++) {
            result += "  " + (i + 1) + ". " + tracks[i] + "\n";
        }
        int total = getTotalDurationSeconds();
        result += "Загальна тривалість: " + (total / 60) + " хв " + (total % 60) + " сек";
        return result;
    }
}

class ServerNode {
    private final String ipAddress;
    private final int totalRamGb;
    private int usedRamGb;
    private final boolean online;

    public ServerNode(String ipAddress, int totalRamGb, int usedRamGb, boolean online) {
        this.ipAddress = ipAddress;
        this.totalRamGb = totalRamGb;
        this.usedRamGb = usedRamGb;
        this.online = online;
    }

    public int getFreeRamGb() {
        return totalRamGb - usedRamGb;
    }

    public boolean isOnline() {
        return online;
    }

    public void allocate(int ramGb) {
        usedRamGb += ramGb;
    }

    @Override
    public String toString() {
        return ipAddress + " (" + (online ? "online" : "offline") + ", вільно " + getFreeRamGb() + " ГБ з " + totalRamGb + ")";
    }
}

class DataCenterCluster {
    private final String clusterLocation;
    private final ServerNode[] nodes;
    private int nodeCount;

    public DataCenterCluster(String clusterLocation, int capacity) {
        this.clusterLocation = clusterLocation;
        this.nodes = new ServerNode[capacity];
    }

    public void addNode(ServerNode node) {
        if (node != null && nodeCount < nodes.length) {
            nodes[nodeCount] = node;
            nodeCount++;
        }
    }

    public boolean deployContainer(int requiredRamGb) {
        for (int i = 0; i < nodeCount; i++) {
            if (nodes[i].isOnline() && nodes[i].getFreeRamGb() >= requiredRamGb) {
                nodes[i].allocate(requiredRamGb);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "Кластер " + clusterLocation + ":\n";
        for (int i = 0; i < nodeCount; i++) {
            result += "  " + nodes[i] + "\n";
        }
        return result;
    }
}

class CourseModule {
    private final String topic;
    private final int lectureHours;
    private final int practiceHours;
    private final double maxScore;

    public CourseModule(String topic, int lectureHours, int practiceHours, double maxScore) {
        this.topic = topic;
        this.lectureHours = lectureHours;
        this.practiceHours = practiceHours;
        this.maxScore = maxScore;
    }

    public int getTotalHours() {
        return lectureHours + practiceHours;
    }

    public double getMaxScore() {
        return maxScore;
    }
}

class UniversityCourse {
    private final String courseTitle;
    private final CourseModule[] modules;
    private int moduleCount;

    public UniversityCourse(String courseTitle, int capacity) {
        this.courseTitle = courseTitle;
        this.modules = new CourseModule[capacity];
    }

    public void addModule(CourseModule module) {
        if (module != null && moduleCount < modules.length) {
            modules[moduleCount] = module;
            moduleCount++;
        }
    }

    public double getEctsCredits() {
        int hours = 0;
        for (int i = 0; i < moduleCount; i++) {
            hours += modules[i].getTotalHours();
        }
        return hours / 30.0;
    }

    public boolean isScoreValid() {
        double sum = 0;
        for (int i = 0; i < moduleCount; i++) {
            sum += modules[i].getMaxScore();
        }
        return Math.abs(sum - 100.0) < 1e-9;
    }
}

class TrainCarriage {
    private final int carriageNumber;
    private final String type;
    private final int totalSeats;
    private int occupiedSeats;

    public TrainCarriage(int carriageNumber, String type, int totalSeats) {
        this.carriageNumber = carriageNumber;
        this.type = type;
        this.totalSeats = totalSeats;
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public int getFreeSeats() {
        return totalSeats - occupiedSeats;
    }

    public boolean book(int seats) {
        if (seats > 0 && seats <= getFreeSeats()) {
            occupiedSeats += seats;
            return true;
        }
        return false;
    }
}

class PassengerTrain {
    private final String route;
    private final TrainCarriage[] carriages;
    private int carriageCount;

    public PassengerTrain(String route, int capacity) {
        this.route = route;
        this.carriages = new TrainCarriage[capacity];
    }

    public void attachCarriage(TrainCarriage c) {
        if (c != null && carriageCount < carriages.length) {
            carriages[carriageCount] = c;
            carriageCount++;
        }
    }

    public int getTotalFreeSeats() {
        int total = 0;
        for (int i = 0; i < carriageCount; i++) {
            total += carriages[i].getFreeSeats();
        }
        return total;
    }

    public boolean bookTicketsInCarriage(int carriageNumber, int seatsToBook) {
        for (int i = 0; i < carriageCount; i++) {
            if (carriages[i].getCarriageNumber() == carriageNumber) {
                return carriages[i].book(seatsToBook);
            }
        }
        return false;
    }
}

class LinearEquation {
    private final double a;
    private final double b;
    private final double c;

    public LinearEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isSatisfiedBy(double x, double y) {
        return Math.abs(a * x + b * y - c) < 1e-6;
    }
}

class EquationSystem {
    private final LinearEquation[] equations;
    private int count;

    public EquationSystem(int capacity) {
        this.equations = new LinearEquation[capacity];
    }

    public void addEquation(LinearEquation equation) {
        if (equation != null && count < equations.length) {
            equations[count] = equation;
            count++;
        }
    }

    public boolean checkSolution(double x, double y) {
        for (int i = 0; i < count; i++) {
            if (!equations[i].isSatisfiedBy(x, y)) {
                return false;
            }
        }
        return count > 0;
    }
}

// ===================== Блок 4 =====================

abstract class AbstractShape {
    private String color;

    public AbstractShape(String color) {
        this.color = (color == null || color.isBlank()) ? "Білий" : color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format(Locale.US, "%s[color='%s', S=%.2f, P=%.2f]",
                getClass().getSimpleName(), color, getArea(), getPerimeter());
    }
}

class CircleShape extends AbstractShape {
    private final double radius;

    public CircleShape(String color, double radius) {
        super(color);
        this.radius = (radius > 0) ? radius : 1.0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class RectangleShape extends AbstractShape {
    private final double width;
    private final double height;

    public RectangleShape(String color, double width, double height) {
        super(color);
        this.width = (width > 0) ? width : 1.0;
        this.height = (height > 0) ? height : 1.0;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

abstract class AbstractPowerPlant {
    private final String stationName;
    protected double baseCapacityMw;

    public AbstractPowerPlant(String stationName, double baseCapacityMw) {
        this.stationName = stationName;
        this.baseCapacityMw = baseCapacityMw;
    }

    public String getName() {
        return stationName;
    }

    public abstract double generateMegawatts();

    public double calculateDailyProfit(double tariffPerMwh) {
        return generateMegawatts() * 24 * tariffPerMwh;
    }
}

class SolarPowerPlant extends AbstractPowerPlant {
    private final double sunIntensityFactor;

    public SolarPowerPlant(String name, double baseCapacityMw, double sunIntensityFactor) {
        super(name, baseCapacityMw);
        this.sunIntensityFactor = Math.max(0.0, Math.min(1.0, sunIntensityFactor));
    }

    @Override
    public double generateMegawatts() {
        return baseCapacityMw * sunIntensityFactor;
    }
}

class WindPowerPlant extends AbstractPowerPlant {
    private final double windSpeedMs;

    public WindPowerPlant(String name, double baseCapacityMw, double windSpeedMs) {
        super(name, baseCapacityMw);
        this.windSpeedMs = windSpeedMs;
    }

    // Умовна модель: повна потужність при вітрі від 12 м/с, нижче лінійно спадає
    @Override
    public double generateMegawatts() {
        if (windSpeedMs < 3 || windSpeedMs > 25) {
            return 0.0;
        }
        return baseCapacityMw * Math.min(1.0, windSpeedMs / 12.0);
    }
}

abstract class AbstractEmployee {
    private final int id;
    private final String name;
    protected double taxRate = 0.195;

    public AbstractEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateGrossSalary();

    public final double calculateNetSalary() {
        return calculateGrossSalary() * (1.0 - taxRate);
    }
}

class SalariedEmployee extends AbstractEmployee {
    private final double monthlySalary;
    private final double bonus;

    public SalariedEmployee(int id, String name, double monthlySalary, double bonus) {
        super(id, name);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateGrossSalary() {
        return monthlySalary + bonus;
    }
}

class HourlyContractor extends AbstractEmployee {
    private final int hoursWorked;
    private final double hourlyRate;

    public HourlyContractor(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateGrossSalary() {
        if (hoursWorked <= 160) {
            return hoursWorked * hourlyRate;
        }
        return 160 * hourlyRate + (hoursWorked - 160) * hourlyRate * 1.5;
    }
}

abstract class AbstractSequence {
    private final String title;

    public AbstractSequence(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getTerm(int index);

    public double sumFirstN(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += getTerm(i);
        }
        return sum;
    }
}

class HarmonicSequence extends AbstractSequence {
    public HarmonicSequence() {
        super("Гармонічна послідовність 1/n");
    }

    @Override
    public double getTerm(int index) {
        return 1.0 / index;
    }
}

class SquareNumbersSequence extends AbstractSequence {
    public SquareNumbersSequence() {
        super("Квадрати натуральних чисел n^2");
    }

    @Override
    public double getTerm(int index) {
        return (double) index * index;
    }
}

abstract class AbstractTransaction {
    private final String txId;
    protected final double amount;

    public AbstractTransaction(String txId, double amount) {
        this.txId = txId;
        this.amount = amount;
    }

    public String getTxId() {
        return txId;
    }

    public abstract double calculateCommission();

    public final double getTotalDebit() {
        return amount + calculateCommission();
    }
}

class DomesticTransfer extends AbstractTransaction {
    public DomesticTransfer(String txId, double amount) {
        super(txId, amount);
    }

    @Override
    public double calculateCommission() {
        return Math.max(5.0, amount * 0.005);
    }
}

class CryptoTransfer extends AbstractTransaction {
    private final double networkGasFee;

    public CryptoTransfer(String txId, double amount, double networkGasFee) {
        super(txId, amount);
        this.networkGasFee = networkGasFee;
    }

    @Override
    public double calculateCommission() {
        return networkGasFee;
    }
}

abstract class Solid3D {
    private final String materialName;
    private final double densityKgPerM3;

    public Solid3D(String materialName, double densityKgPerM3) {
        this.materialName = materialName;
        this.densityKgPerM3 = densityKgPerM3;
    }

    public String getMaterialName() {
        return materialName;
    }

    public abstract double getVolume();

    public abstract double getSurfaceArea();

    public final double getMassKg() {
        return densityKgPerM3 * getVolume();
    }
}

class Sphere3D extends Solid3D {
    private final double radius;

    public Sphere3D(String materialName, double density, double radius) {
        super(materialName, density);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}

class Cylinder3D extends Solid3D {
    private final double radius;
    private final double height;

    public Cylinder3D(String materialName, double density, double radius, double height) {
        super(materialName, density);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

abstract class AbstractSensor {
    private final String location;
    private final double minSafe;
    private final double maxSafe;

    public AbstractSensor(String location, double minSafe, double maxSafe) {
        this.location = location;
        this.minSafe = minSafe;
        this.maxSafe = maxSafe;
    }

    public String getLocation() {
        return location;
    }

    public abstract double readValue();

    public abstract String getUnit();

    public final boolean isAlarmTriggered() {
        double value = readValue();
        return value < minSafe || value > maxSafe;
    }
}

class PressureSensor extends AbstractSensor {
    private final double rawReading;
    private final double calibration;

    public PressureSensor(String location, double minSafe, double maxSafe, double rawReading, double calibration) {
        super(location, minSafe, maxSafe);
        this.rawReading = rawReading;
        this.calibration = calibration;
    }

    @Override
    public double readValue() {
        return rawReading * calibration;
    }

    @Override
    public String getUnit() {
        return "бар";
    }
}

class RadiationSensor extends AbstractSensor {
    private final double microSvPerHour;

    public RadiationSensor(String location, double minSafe, double maxSafe, double microSvPerHour) {
        super(location, minSafe, maxSafe);
        this.microSvPerHour = microSvPerHour;
    }

    @Override
    public double readValue() {
        return microSvPerHour;
    }

    @Override
    public String getUnit() {
        return "мкЗв/год";
    }
}

abstract class AbstractCompressor {
    private final String algorithmName;

    public AbstractCompressor(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public abstract int estimateCompressedSize(int originalSizeBytes);

    public double getCompressionRatio(int originalSizeBytes) {
        if (originalSizeBytes <= 0) {
            return 0.0;
        }
        return (1.0 - (double) estimateCompressedSize(originalSizeBytes) / originalSizeBytes) * 100.0;
    }
}

class ZipCompressor extends AbstractCompressor {
    public ZipCompressor() {
        super("ZIP");
    }

    @Override
    public int estimateCompressedSize(int originalSizeBytes) {
        return (int) (originalSizeBytes * 0.55);
    }
}

class UltraLzmaCompressor extends AbstractCompressor {
    public UltraLzmaCompressor() {
        super("Ultra LZMA");
    }

    @Override
    public int estimateCompressedSize(int originalSizeBytes) {
        return (int) (originalSizeBytes * 0.30) + 128;
    }
}

// ===================== Блок 5 =====================

abstract class AbstractPcPart {
    private final String model;
    private final double priceUah;

    public AbstractPcPart(String model, double priceUah) {
        this.model = model;
        this.priceUah = priceUah;
    }

    public String getModel() {
        return model;
    }

    public abstract int getPowerConsumptionWatts();
}

class ProcessorPart extends AbstractPcPart {
    private final int cores;
    private final int watts;

    public ProcessorPart(String model, double priceUah, int cores, int watts) {
        super(model, priceUah);
        this.cores = cores;
        this.watts = watts;
    }

    @Override
    public int getPowerConsumptionWatts() {
        return watts;
    }
}

class VideoCardPart extends AbstractPcPart {
    private final int vramGb;
    private final int watts;

    public VideoCardPart(String model, double priceUah, int vramGb, int watts) {
        super(model, priceUah);
        this.vramGb = vramGb;
        this.watts = watts;
    }

    @Override
    public int getPowerConsumptionWatts() {
        return watts;
    }
}

class DesktopPC {
    private final int psuMaxWatts;
    private final AbstractPcPart[] parts;

    public DesktopPC(int psuMaxWatts, AbstractPcPart[] parts) {
        this.psuMaxWatts = psuMaxWatts;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public int getTotalPowerWatts() {
        int total = 0;
        for (AbstractPcPart part : parts) {
            total += part.getPowerConsumptionWatts();
        }
        return total;
    }

    public boolean isStable() {
        return getTotalPowerWatts() * 1.2 <= psuMaxWatts;
    }
}

abstract class AbstractThruster {
    private final String thrusterId;

    public AbstractThruster(String thrusterId) {
        this.thrusterId = thrusterId;
    }

    public String getThrusterId() {
        return thrusterId;
    }

    public abstract double getThrustKn();

    public abstract double getFuelBurnRate();
}

class ChemicalThruster extends AbstractThruster {
    private final double thrustKn;
    private final double fuelBurnRate;

    public ChemicalThruster(String id, double thrustKn, double fuelBurnRate) {
        super(id);
        this.thrustKn = thrustKn;
        this.fuelBurnRate = fuelBurnRate;
    }

    @Override
    public double getThrustKn() {
        return thrustKn;
    }

    @Override
    public double getFuelBurnRate() {
        return fuelBurnRate;
    }
}

class IonThruster extends AbstractThruster {
    private final double thrustKn;
    private final double fuelBurnRate;

    public IonThruster(String id, double thrustKn, double fuelBurnRate) {
        super(id);
        this.thrustKn = thrustKn;
        this.fuelBurnRate = fuelBurnRate;
    }

    @Override
    public double getThrustKn() {
        return thrustKn;
    }

    @Override
    public double getFuelBurnRate() {
        return fuelBurnRate;
    }
}

class Spacecraft {
    private final String shipName;
    private final double dryMassTons;
    private final AbstractThruster[] thrusters;
    private int count;

    public Spacecraft(String shipName, double dryMassTons, int capacity) {
        this.shipName = shipName;
        this.dryMassTons = dryMassTons;
        this.thrusters = new AbstractThruster[capacity];
    }

    public void addThruster(AbstractThruster thruster) {
        if (thruster != null && count < thrusters.length) {
            thrusters[count] = thruster;
            count++;
        }
    }

    public double getTotalThrustKn() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += thrusters[i].getThrustKn();
        }
        return total;
    }

    // кН / т = м/с²
    public double getInitialAcceleration() {
        return getTotalThrustKn() / dryMassTons;
    }
}

class LandPlot {
    private final double totalPlotAreaM2;
    private final AbstractShape[] structures;
    private int count;

    public LandPlot(double totalPlotAreaM2, int capacity) {
        this.totalPlotAreaM2 = totalPlotAreaM2;
        this.structures = new AbstractShape[capacity];
    }

    private double getBuiltArea() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += structures[i].getArea();
        }
        return total;
    }

    public boolean addStructure(AbstractShape s) {
        if (s == null || count >= structures.length) {
            return false;
        }
        if (getBuiltArea() + s.getArea() > totalPlotAreaM2 * 0.6) {
            return false;
        }
        structures[count] = s;
        count++;
        return true;
    }

    public double getFreeGreenArea() {
        return totalPlotAreaM2 - getBuiltArea();
    }
}

abstract class AbstractAsset {
    private final String ticker;
    protected double investedAmount;

    public AbstractAsset(String ticker, double investedAmount) {
        this.ticker = ticker;
        this.investedAmount = investedAmount;
    }

    public double getInvestedAmount() {
        return investedAmount;
    }

    public abstract double calculateAnnualReturn();
}

class GovernmentBond extends AbstractAsset {
    private final double couponPercent;

    public GovernmentBond(String ticker, double investedAmount, double couponPercent) {
        super(ticker, investedAmount);
        this.couponPercent = couponPercent;
    }

    @Override
    public double calculateAnnualReturn() {
        return investedAmount * couponPercent / 100.0;
    }
}

class DividendStock extends AbstractAsset {
    private final double expectedGrowthPercent;
    private final double dividendPercent;

    public DividendStock(String ticker, double investedAmount, double expectedGrowthPercent, double dividendPercent) {
        super(ticker, investedAmount);
        this.expectedGrowthPercent = expectedGrowthPercent;
        this.dividendPercent = dividendPercent;
    }

    @Override
    public double calculateAnnualReturn() {
        double growth = investedAmount * expectedGrowthPercent / 100.0;
        double dividends = investedAmount * dividendPercent / 100.0 * (1 - 0.195);
        return growth + dividends;
    }
}

class InvestmentPortfolio {
    private final String investorName;
    private final AbstractAsset[] assets;
    private int count;

    public InvestmentPortfolio(String investorName, int capacity) {
        this.investorName = investorName;
        this.assets = new AbstractAsset[capacity];
    }

    public void addAsset(AbstractAsset asset) {
        if (asset != null && count < assets.length) {
            assets[count] = asset;
            count++;
        }
    }

    public double getTotalInvested() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += assets[i].getInvestedAmount();
        }
        return total;
    }

    public double getTotalAnnualReturn() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += assets[i].calculateAnnualReturn();
        }
        return total;
    }
}

abstract class AbstractHeroUnit {
    private final String name;
    protected int hp;

    public AbstractHeroUnit(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public abstract int getCombatPower();

    public abstract String getRole();
}

class TankWarrior extends AbstractHeroUnit {
    private final int armor;

    public TankWarrior(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }

    @Override
    public int getCombatPower() {
        return hp / 10 + armor * 3;
    }

    @Override
    public String getRole() {
        return "Tank";
    }
}

class ArcaneMage extends AbstractHeroUnit {
    private final int intellect;
    private final int spellPower;

    public ArcaneMage(String name, int hp, int intellect, int spellPower) {
        super(name, hp);
        this.intellect = intellect;
        this.spellPower = spellPower;
    }

    @Override
    public int getCombatPower() {
        return intellect * 2 + spellPower;
    }

    @Override
    public String getRole() {
        return "Mage";
    }
}

class RaidParty {
    private final String guildName;
    private final AbstractHeroUnit[] members;
    private int memberCount;

    public RaidParty(String guildName, int capacity) {
        this.guildName = guildName;
        this.members = new AbstractHeroUnit[capacity];
    }

    public void addMember(AbstractHeroUnit hero) {
        if (hero != null && memberCount < members.length) {
            members[memberCount] = hero;
            memberCount++;
        }
    }

    public int getTotalCombatPower() {
        int total = 0;
        for (int i = 0; i < memberCount; i++) {
            total += members[i].getCombatPower();
        }
        return total;
    }

    public boolean isReadyForRaid(int dungeonDifficulty) {
        boolean hasTank = false;
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getRole().equals("Tank")) {
                hasTank = true;
            }
        }
        return hasTank && getTotalCombatPower() > dungeonDifficulty;
    }
}

class EmergencySiren {
    private boolean sounding;

    public void activate() {
        sounding = true;
    }

    public boolean isSounding() {
        return sounding;
    }
}

class SmartLab {
    private final EmergencySiren siren = new EmergencySiren();
    private final AbstractSensor[] sensors;

    public SmartLab(AbstractSensor[] sensors) {
        this.sensors = Arrays.copyOf(sensors, sensors.length);
    }

    public void runDiagnostics() {
        boolean alarm = false;
        for (AbstractSensor sensor : sensors) {
            boolean triggered = sensor.isAlarmTriggered();
            System.out.println(sensor.getLocation() + ": " + sensor.readValue() + " " + sensor.getUnit()
                    + (triggered ? " -> ТРИВОГА!" : " -> норма"));
            if (triggered) {
                alarm = true;
            }
        }
        if (alarm) {
            siren.activate();
            System.out.println("🚨 Сирену увімкнено!");
        } else {
            System.out.println("Усі показники в нормі, сирена мовчить: " + !siren.isSounding());
        }
    }
}

abstract class AbstractFilter {
    private final String filterName;

    public AbstractFilter(String filterName) {
        this.filterName = filterName;
    }

    public String getFilterName() {
        return filterName;
    }

    public abstract double processSample(double x);
}

class AmplifierFilter extends AbstractFilter {
    private final double gain;

    public AmplifierFilter(double gain) {
        super("Amplifier");
        this.gain = gain;
    }

    @Override
    public double processSample(double x) {
        return x * gain;
    }
}

class ClippingFilter extends AbstractFilter {
    private final double threshold;

    public ClippingFilter(double threshold) {
        super("Clipping");
        this.threshold = Math.abs(threshold);
    }

    @Override
    public double processSample(double x) {
        return Math.max(-threshold, Math.min(threshold, x));
    }
}

class SignalProcessor {
    private final AbstractFilter[] pipeline;

    public SignalProcessor(AbstractFilter[] pipeline) {
        this.pipeline = Arrays.copyOf(pipeline, pipeline.length);
    }

    public double[] process(double[] signal) {
        double[] result = Arrays.copyOf(signal, signal.length);
        for (AbstractFilter filter : pipeline) {
            for (int i = 0; i < result.length; i++) {
                result[i] = filter.processSample(result[i]);
            }
        }
        return result;
    }
}
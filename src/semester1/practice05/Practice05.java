package semester1.practice05;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Practice05 {

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

    // ===== Допоміжні методи =====

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

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    private static boolean isSortedAscending(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    // ===== Блок 1: Оголошення, ініціалізація та доступ до 1D-масивів =====

    // Завдання 1
    private static void task1() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        numbers[0] = 10;
        numbers[2] = 30;
        numbers[numbers.length - 1] = 50;
        System.out.println(Arrays.toString(numbers));
    }

    // Завдання 2
    private static void task2() {
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        System.out.println("Кількість днів: " + days.length);
        System.out.println("Перший день: " + days[0]);
        System.out.println("Останній день: " + days[days.length - 1]);
        days[5] = "Вихідний (Сб)";
        days[6] = "Вихідний (Нд)";
        System.out.println(Arrays.toString(days));
    }

    // Завдання 3
    private static void task3() {
        double[] prices = {120.50, 45.00, 890.99, 15.30, 420.00};
        System.out.println("До знижки: " + Arrays.toString(prices));
        prices[2] = prices[2] * 0.8;
        System.out.println("Після знижки: " + Arrays.toString(prices));
    }

    // Завдання 4
    private static void task4() {
        int n = readInt("Введіть N (> 0): ");
        if (n <= 0) {
            System.out.println("Помилка: N має бути додатним!");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Завдання 5
    private static void task5() {
        int[] arr = {4, 8, 15, 16, 23, 42};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Завдання 6
    private static void task6() {
        int[] powers = new int[10];
        powers[0] = 1;
        for (int i = 1; i < powers.length; i++) {
            powers[i] = powers[i - 1] * 2;
        }
        System.out.println(Arrays.toString(powers));
    }

    // Завдання 7
    private static void task7() {
        int[] original = {3, 7, 1, 9, 4};
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        copy[0] = 999;
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copy:     " + Arrays.toString(copy));
    }

    // ===== Блок 2: Базові обчислення в 1D-масивах =====

    // Завдання 8
    private static void task8() {
        int[] grades = {95, 84, 70, 99, 65, 88, 92};
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.println("Сума: " + sum + ", Середній бал: " + fmt(average));
    }

    // Завдання 9
    private static void task9() {
        int[] temps = {18, 21, 15, 24, 13, 27, 20};
        int min = temps[0];
        int max = temps[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < min) {
                min = temps[i];
                minIndex = i;
            }
            if (temps[i] > max) {
                max = temps[i];
                maxIndex = i;
            }
        }
        System.out.println("Мінімум: " + min + " (індекс " + minIndex + ", день " + (minIndex + 1) + ")");
        System.out.println("Максимум: " + max + " (індекс " + maxIndex + ", день " + (maxIndex + 1) + ")");
    }

    // Завдання 10
    private static void task10() {
        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (int value : data) {
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        System.out.println("Додатних: " + positive);
        System.out.println("Від'ємних: " + negative);
        System.out.println("Нульових: " + zeros);
    }

    // Завдання 11
    private static void task11() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        int evenCount = 0;
        int oddSum = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddSum += value;
            }
        }
        System.out.println("Масив: " + Arrays.toString(arr));
        System.out.println("Кількість парних: " + evenCount);
        System.out.println("Сума непарних: " + oddSum);
    }

    // Завдання 12
    private static void task12() {
        int[] students = {1042, 2031, 3055, 4018, 5099};
        int target = readInt("Введіть номер залікової книжки: ");
        int foundIndex = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == target) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Студента знайдено на позиції " + foundIndex);
        } else {
            System.out.println("Студента з таким номером не знайдено");
        }
    }

    // Завдання 13
    private static void task13() {
        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};
        int target = readInt("Введіть число від 1 до 6: ");
        int count = 0;
        for (int roll : rolls) {
            if (roll == target) {
                count++;
            }
        }
        System.out.println("Число " + target + " випало " + count + " раз(ів)");
    }

    // Завдання 14
    private static void task14() {
        int[] salaries = {18000, 25000, 32000, 15000, 41000, 29000};
        int sum = 0;
        for (int salary : salaries) {
            sum += salary;
        }
        double average = (double) sum / salaries.length;
        System.out.println("Середня зарплата: " + fmt(average));
        System.out.print("Зарплати вище середньої: ");
        for (int salary : salaries) {
            if (salary > average) {
                System.out.print(salary + " ");
            }
        }
        System.out.println();
    }

    // Завдання 15
    private static void task15() {
        double[] prices = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};
        double min = prices[0];
        double max = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        System.out.println("Розмах коливань цін: " + fmt(max - min));
    }

    // ===== Блок 3: Перетворення, for-each та клас Arrays =====

    // Завдання 16
    private static void task16() {
        String[] cities = {"Київ", "Львів", "Харків", "Одеса", "Дніпро"};
        for (String city : cities) {
            System.out.println("Ласкаво просимо до міста " + city + "!");
        }
    }

    // Завдання 17
    private static void task17() {
        double[] salaries = {20000.0, 25000.0, 18000.0, 30000.0};
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] *= 1.10;
        }
        System.out.println(Arrays.toString(salaries));
    }

    // Завдання 18
    private static void task18() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Завдання 19
    private static void task19() {
        int[] base = {2, 4, 6, 8, 10};
        int[] squares = new int[base.length];
        for (int i = 0; i < base.length; i++) {
            squares[i] = base[i] * base[i];
        }
        System.out.println("base:    " + Arrays.toString(base));
        System.out.println("squares: " + Arrays.toString(squares));
    }

    // Завдання 20
    private static void task20() {
        int[] sorted = {1, 3, 5, 7, 9};
        int[] unsorted = {1, 5, 3, 8, 2};
        System.out.println(Arrays.toString(sorted) + " відсортований: " + isSortedAscending(sorted));
        System.out.println(Arrays.toString(unsorted) + " відсортований: " + isSortedAscending(unsorted));
    }

    // Завдання 21
    private static void task21() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        System.out.println(Arrays.toString(c));
    }

    // Завдання 22
    private static void task22() {
        int[] test = {45, 12, 89, 3, 27};
        System.out.println("Початковий: " + Arrays.toString(test));
        Arrays.sort(test);
        System.out.println("Відсортований: " + Arrays.toString(test));
        Arrays.fill(test, -1);
        System.out.println("Після fill: " + Arrays.toString(test));
    }

    // ===== Блок 4: Двовимірні масиви =====

    // Завдання 23
    private static void task23() {
        int[][] table = new int[3][3];
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = row * 3 + col + 1;
            }
        }
        printMatrix(table);
    }

    // Завдання 24
    private static void task24() {
        int[][] matrix = {
                {10, 20, 30, 40},
                {50, 60, 70, 80}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println("Рядків: " + rows);
        System.out.println("Стовпчиків: " + cols);
        System.out.println("Лівий верхній: " + matrix[0][0]);
        System.out.println("Правий верхній: " + matrix[0][cols - 1]);
        System.out.println("Лівий нижній: " + matrix[rows - 1][0]);
        System.out.println("Правий нижній: " + matrix[rows - 1][cols - 1]);
    }

    // Завдання 25
    private static void task25() {
        int[][] grid = new int[3][4];
        int counter = 1;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = counter;
                counter++;
            }
        }
        printMatrix(grid);
    }

    // Завдання 26
    private static void task26() {
        int[][] randomGrid = new int[4][3];
        for (int row = 0; row < randomGrid.length; row++) {
            for (int col = 0; col < randomGrid[row].length; col++) {
                randomGrid[row][col] = (int) (Math.random() * 90) + 10;
            }
        }
        System.out.println(Arrays.deepToString(randomGrid));
        System.out.println();
        printMatrix(randomGrid);
    }

    // Завдання 27
    private static void task27() {
        int[][] multTable = new int[9][9];
        for (int i = 0; i < multTable.length; i++) {
            for (int j = 0; j < multTable[i].length; j++) {
                multTable[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < multTable.length; i++) {
            for (int j = 0; j < multTable[i].length; j++) {
                System.out.print(String.format("%4d", multTable[i][j]));
            }
            System.out.println();
        }
    }

    // Завдання 28
    private static void task28() {
        int[][] identity = new int[5][5];
        for (int row = 0; row < identity.length; row++) {
            for (int col = 0; col < identity[row].length; col++) {
                identity[row][col] = (row == col) ? 1 : 0;
            }
        }
        printMatrix(identity);
    }

    // Завдання 29
    private static void task29() {
        int[][] matrix = new int[4][4];
        for (int row = 0; row < matrix.length; row++) {
            Arrays.fill(matrix[row], 1);
        }
        for (int col = 0; col < matrix[1].length; col++) {
            matrix[1][col] = 0;
        }
        for (int row = 0; row < matrix.length; row++) {
            matrix[row][2] = 7;
        }
        printMatrix(matrix);
    }

    // ===== Блок 5: Алгоритми в двовимірних масивах =====

    // Завдання 30
    private static void task30() {
        int[][] matrix = {
                {4, 8, 15},
                {16, 23, 42},
                {7, 9, 11}
        };
        int sum = 0;
        int count = matrix.length * matrix[0].length;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        System.out.println("Сума: " + sum);
        System.out.println("Кількість елементів: " + count);
        System.out.println("Середнє: " + fmt((double) sum / count));
    }

    // Завдання 31
    private static void task31() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] rowSums = new int[matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                rowSums[row] += matrix[row][col];
            }
            System.out.println("Рядок " + row + ": сума = " + rowSums[row]);
        }
    }

    // Завдання 32
    private static void task32() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printMatrix(matrix);
        System.out.println("------------------");
        for (int col = 0; col < matrix[0].length; col++) {
            int colSum = 0;
            for (int row = 0; row < matrix.length; row++) {
                colSum += matrix[row][col];
            }
            System.out.print(colSum + "\t");
        }
        System.out.println();
    }

    // Завдання 33
    private static void task33() {
        int[][] matrix = {
                {5, -3, 12, 7},
                {-8, 25, 0, 14},
                {9, -1, 18, 22}
        };
        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        System.out.println("Максимум: " + max + " у комірці [" + maxRow + ", " + maxCol + "]");
    }

    // Завдання 34
    private static void task34() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int mainSum = 0;
        int antiSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    mainSum += matrix[row][col];
                }
                if (row + col == matrix.length - 1) {
                    antiSum += matrix[row][col];
                }
            }
        }
        System.out.println("Сума головної діагоналі: " + mainSum);
        System.out.println("Сума побічної діагоналі: " + antiSum);
        if (mainSum > antiSum) {
            System.out.println("Головна діагональ більша.");
        } else if (mainSum < antiSum) {
            System.out.println("Побічна діагональ більша.");
        } else {
            System.out.println("Суми рівні.");
        }
    }

    // Завдання 35
    private static void task35() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transposed = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        System.out.println("Початкова:\t\t\tТранспонована:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\t");
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // ===== Блок 6: Зубчасті та багатовимірні масиви =====

    // Завдання 36
    private static void task36() {
        int[][] ladder = new int[4][];
        for (int row = 0; row < ladder.length; row++) {
            ladder[row] = new int[row + 1];
            for (int col = 0; col < ladder[row].length; col++) {
                ladder[row][col] = row;
            }
        }
        for (int row = 0; row < ladder.length; row++) {
            for (int col = 0; col < ladder[row].length; col++) {
                System.out.print(ladder[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Завдання 37
    private static void task37() {
        String[] dayNames = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця"};
        String[][] weekSchedule = new String[5][];
        weekSchedule[0] = new String[]{"Вища математика", "Основи програмування", "Фізика"};
        weekSchedule[1] = new String[]{"Англійська мова", "Історія України"};
        weekSchedule[2] = new String[]{"Основи програмування", "Основи програмування", "Бази даних", "Фізвиховання"};
        weekSchedule[3] = new String[]{"Дискретна математика"};
        weekSchedule[4] = new String[]{"Філософія", "Основи алгоритмізації", "Практикум"};
        for (int i = 0; i < weekSchedule.length; i++) {
            System.out.println(dayNames[i] + " (пар: " + weekSchedule[i].length + "):");
            for (int j = 0; j < weekSchedule[i].length; j++) {
                System.out.println("  " + (j + 1) + ". " + weekSchedule[i][j]);
            }
        }
    }

    // Завдання 38
    private static void task38() {
        int[][] pascal = new int[5][];
        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        for (int i = 0; i < pascal.length; i++) {
            for (int s = 0; s < (pascal.length - 1 - i) * 2; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(String.format("%4d", pascal[i][j]));
            }
            System.out.println();
        }
    }

    // Завдання 39
    private static void task39() {
        int[][][] cube = new int[3][3][3];
        for (int x = 0; x < cube.length; x++) {
            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    cube[x][y][z] = x + y + z;
                }
            }
        }
        for (int x = 0; x < cube.length; x++) {
            System.out.println("--- Шар " + x + " ---");
            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    System.out.print(cube[x][y][z] + "\t");
                }
                System.out.println();
            }
        }
    }

    // Завдання 40
    private static void task40() {
        String[] cities = {"Київ", "Львів", "Одеса"};
        double[][][] weather = new double[3][7][2];
        for (int city = 0; city < weather.length; city++) {
            for (int day = 0; day < weather[city].length; day++) {
                weather[city][day][0] = 15 + city * 2 + day;
                weather[city][day][1] = 7 + city * 2 + (day % 3);
            }
        }
        for (int city = 0; city < weather.length; city++) {
            double daySum = 0;
            for (int day = 0; day < weather[city].length; day++) {
                daySum += weather[city][day][0];
            }
            System.out.println(cities[city] + ": середня денна температура = "
                    + fmt(daySum / weather[city].length) + " °C");
        }
        double coldest = weather[0][0][1];
        int coldestCity = 0;
        int coldestDay = 0;
        for (int city = 0; city < weather.length; city++) {
            for (int day = 0; day < weather[city].length; day++) {
                if (weather[city][day][1] < coldest) {
                    coldest = weather[city][day][1];
                    coldestCity = city;
                    coldestDay = day;
                }
            }
        }
        System.out.println("Найхолодніша ніч: " + coldest + " °C (" + cities[coldestCity]
                + ", день " + (coldestDay + 1) + ")");
    }
}
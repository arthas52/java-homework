package semester1.practice02.homework;

public class Task2NumberAnalysis {

    public static void main(String[] args) {
        int number = 742;

        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int units = number % 10;

        int digitsSum = hundreds + tens + units;
        int digitsProduct = hundreds * tens * units;
        int reversedNumber = units * 100 + tens * 10 + hundreds;
        boolean isSumEven = digitsSum % 2 == 0;

        System.out.println("Початкове число:            " + number);
        System.out.println("Розряди:                    Сотні = " + hundreds
                + ", Десятки = " + tens + ", Одиниці = " + units);
        System.out.println("Сума цифр:                  " + digitsSum);
        System.out.println("Добуток цифр:               " + digitsProduct);
        System.out.println("Перевернуте число:          " + reversedNumber);
        System.out.println("Чи є сума цифр парною?      " + isSumEven);
    }
}
package semester1.practice02.homework;

import java.util.Locale;

public class Task1CurrencyExchange {

    public static void main(String[] args) {
        double usdAmount = 250.0;
        final double EXCHANGE_RATE = 41.25;
        final double COMMISSION_PERCENT = 1.5;

        double totalUah = usdAmount * EXCHANGE_RATE;
        double commissionUah = totalUah * COMMISSION_PERCENT / 100;
        double netUah = totalUah - commissionUah;
        long cashUah = Math.round(netUah);

        System.out.println("================ КВИТАНЦІЯ ОБМІНУ ================");
        System.out.println("Сума до обміну:             " + format(usdAmount) + " USD");
        System.out.println("Курс валют:                 " + format(EXCHANGE_RATE) + " UAH/USD");
        System.out.println("Нараховано до комісії:      " + format(totalUah) + " UAH");
        System.out.println("Комісія банку (" + COMMISSION_PERCENT + "%):       " + format(commissionUah) + " UAH");
        System.out.println("--------------------------------------------------");
        System.out.println("Чиста сума до видачі:       " + format(netUah) + " UAH");
        System.out.println("До видачі готівкою:         " + cashUah + " UAH");
        System.out.println("==================================================");
    }

    private static String format(double value) {
        return String.format(Locale.US, "%.2f", value);
    }
}
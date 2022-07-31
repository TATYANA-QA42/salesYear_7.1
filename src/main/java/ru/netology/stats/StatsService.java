package ru.netology.stats;


import org.apache.commons.math3.util.Precision;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double sumAverage(long[] sales) {
        double sumAver = 0;
        for (long sale : sales) {
            sumAver += sale;
        }
        return Precision.round(sumAver / sales.length, 2);
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        double middle = sumAverage(sales);
        int belowAverageSales = 0;
        for (long sale : sales) {
            if (sale < middle) {
                belowAverageSales++;
            }
        }
        return belowAverageSales;
    }

    public int aboveAverageSales(long[] sales) {
        double middle = sumAverage(sales);
        int aboveAverageSales = 0;
        for (long sale : sales) {
            if (sale > middle) {
                aboveAverageSales++;
            }
        }
        return aboveAverageSales;
    }
}


package ru.netology.stats;

public class StatsService {

    public long salesAmount(long[] sales) {
        long sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum += sales[(int) i];
        }
        return sum;
    }

    public long average(long[] sales) {
        long sum = salesAmount(sales);
        long getAverage = sum / sales.length;
        return getAverage;
    }

    public long maximumSales(long[] salse) {
        long MyMonth = 0;
        for (long i = 0; i < salse.length; i++) {
            if (salse[(int) i] >= salse[(int) MyMonth]) {
                MyMonth = i;
            }
        }
        return MyMonth;
    }

    public long minimumSales(long[] salse) {
        long MyMonthMinimum = 0;
        for (long i = 0; i < salse.length; i++) {
            if (salse[(int) i] <= salse[(int) MyMonthMinimum]) {
                MyMonthMinimum = i;
            }
        }
        return MyMonthMinimum;
    }

    public long LessThanAverage(long[] salse) {
        long average = average(salse);
        long Mounths = 0;
        for (long x : salse) {
            if (x < average) {
                Mounths++;
            }
        }
        return Mounths;
    }

    public long AboveThanAverage(long[] salse) {
        long average = average(salse);
        long Mounths = 0;
        for (long x : salse) {
            if (x > average) {
                Mounths++;
            }
        }
        return Mounths;
    }
}

package ru.netology.stats;
public class StatsService {
    public int calculateSumSale(long[] sales) {
        int sum = 0;
        for (long i : sales) {
            sum += i;
        }
        return sum;
    }

    public int averageSumSale(long[] sales) {
        return calculateSumSale(sales) / sales.length;

    }

    public int maxSumSale(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSumSale(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMinSale(long[] sales) {
        int minSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= averageSumSale(sales)) {
                minSale++;
            }
        }
        return minSale;
    }

    public int getMaxSale(long[] sales) {
        int maxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averageSumSale(sales)) {
                maxSale++;
            }
        }
        return maxSale;
    }
}


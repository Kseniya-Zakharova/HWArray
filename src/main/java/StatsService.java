public class StatsService {

    public long amount(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public long avg(long[] sales) {
        return amount(sales) / 12;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
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

    public int countHigherAvg(long[] sales) {
        int count = 0;
        long avg = avg(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }

        return count;
    }

    public int countAboveAvg(long[] sales) {
        int count = 0;
        long avg = avg(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }

        return count;
    }
}


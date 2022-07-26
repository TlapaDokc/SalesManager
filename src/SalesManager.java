public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long aver() {
        long max = -1;
        long min = 1000000000;
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }
            if (sales[i] < min) {
                min = sales[i];
            }
           sum += sales[i];
        }
        long aver = (sum - max - min) / (sales.length - 2);
        return  aver;
    }
}
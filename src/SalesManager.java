public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int aver() {
        int max = -1;
        int min = 1000000000;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }
            if (sales[i] < min) {
                min = sales[i];
            }
           sum += sales[i];
        }
        int aver = (sum - max - min) / (sales.length - 2);
        return  aver;
    }
}
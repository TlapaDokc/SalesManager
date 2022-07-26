public class Main {
    public static void main(String[] args) {
        long[] sales = {23, 54, 12, 45, 52, 37, 44};
        SalesManager julyFirstWeek = new SalesManager(sales);
        long maxSales = julyFirstWeek.max();
        long averSales = julyFirstWeek.aver();
        System.out.println("Максимальное количество продаж за день: " + maxSales + "\n" +
                "Среднее обрезанное количество продаж: " + averSales);
    }
}
public class Main {
    public static void main(String[] args) {
        int[] sales = {23, 54, 12, 45, 52, 37, 44};
        SalesManager julyFirstWeek = new SalesManager(sales);
        int maxSales = julyFirstWeek.max();
        int averSales = julyFirstWeek.aver();
        System.out.println("Максимальное количество продаж за день: " + maxSales + "\n" +
                "Среднее обрезанное количество продаж: " + averSales);
    }
}
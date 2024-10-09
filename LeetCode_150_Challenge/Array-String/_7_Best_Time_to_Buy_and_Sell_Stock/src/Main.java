public class Main {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Best best = new Best();
        System.out.println(best.maxProfit(prices));
    }
}
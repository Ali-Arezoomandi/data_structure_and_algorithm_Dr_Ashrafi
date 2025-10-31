public class Problem12 {

    public static void countCoins(int n, int c2, int c5, int c10, int maxCoin){
        if (n == 0) {
            System.out.println("c10: " + c10 + " c5: " + c5 + " c2: " + c2);
            return;
        }
        if (n >= 10 && maxCoin >= 10) {
            countCoins(n - 10, c2, c5, c10 + 1, 10);
        }
        if (n >= 5 && maxCoin >= 5) {
            countCoins(n - 5, c2, c5 + 1, c10, 5);
        }
        if (n >= 2 && maxCoin >= 2) {
            countCoins(n - 2, c2 + 1, c5, c10, 2);
        }
    }

    public static void main(String[] args) {
        int money = 17;
        int c2 = 0;
        int c5 = 0;
        int c10 = 0;
        int maxCoin = 10;

        countCoins(money, c2, c5, c10, maxCoin);
    }
}
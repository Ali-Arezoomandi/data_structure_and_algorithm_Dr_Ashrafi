public class Problem11 {

    public static void countCoins(int n, int c2, int c5, int c10){
        if (n == 0) {
            System.out.println("c10: " + c10 + " c5: " + c5 + " c2: " + c2);
            return;
        }
        if (n >= 10) {
            countCoins(n - 10, c2, c5, c10 + 1);
        }
        if (n >= 5) {
            countCoins(n - 5, c2, c5 + 1, c10);
        }
        if (n >= 2) {
            countCoins(n - 2, c2 + 1, c5, c10);
        }
    }

    public static void main(String[] args) {
        int money = 17;
        int c2 = 0;
        int c5 = 0;
        int c10 = 0;

        countCoins(money, c2, c5, c10);
    }
}

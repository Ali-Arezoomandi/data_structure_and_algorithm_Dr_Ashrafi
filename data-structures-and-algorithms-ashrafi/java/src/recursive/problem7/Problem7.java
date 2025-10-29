package recursive.problem7;

public class Problem7 {
    
    public static int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 12;

        System.out.printf("(%d, %d) = %d", num1, num2, gcd(num1, num2));
    }
}

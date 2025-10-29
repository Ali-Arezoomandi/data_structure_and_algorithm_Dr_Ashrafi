package recursive.problem10;

public class Problem10 {
    
    public static double sumOfFactorials(int n, double s, int i){
        if (i == n) {
            return (double)1 / s;
        }
        return (double)1 / s + sumOfFactorials(n, (double)s * (i + 1), i + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        double sum = 1;
        int i = 1;

        System.out.printf("(1 / 1)! +...+ (1 / %d)! = %.3f", n, sumOfFactorials(n, sum, i));
    }
}

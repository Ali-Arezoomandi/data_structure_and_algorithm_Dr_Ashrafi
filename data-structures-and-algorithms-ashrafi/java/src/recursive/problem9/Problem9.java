package recursive.problem9;

public class Problem9 {
    
    public static int sumOfFactorials(int n, int s, int i){
        if (i == n) {
            return s;
        }
        return s + sumOfFactorials(n, s * (i + 1), i + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = 1;
        int i = 1;

        System.out.printf("1! +...+ %d! = %d", n, sumOfFactorials(n, sum, i));
    }
}

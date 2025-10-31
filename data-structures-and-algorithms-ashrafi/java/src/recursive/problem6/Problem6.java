public class Problem6 {
    
    public static int multiply(int a, int b){
        if (b == 0) {
            return 0;
        }
        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        System.out.printf("%d x %d = %d", num1, num2, multiply(num1, num2));
    }
}

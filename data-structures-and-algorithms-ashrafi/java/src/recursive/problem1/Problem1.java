public class Problem1 {
    
    public static int devision(int a, int b){
        if (a < b) {
            return 0;
        }
        return 1 + devision(a - b, b);
    }

    public static void main(String[] args) {
        int a = 13;
        int b = 3;

        System.out.println(a + " / " + b + " = " + devision(a, b));
    }
}

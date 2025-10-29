package recursive.problem5;

public class Problem5 {

    // Method 1

    public static int maxFinder1(int[] a, int s, int e){
        if (s == e) {
            return a[s];
        }
        int mid = (s + e) / 2;
        int num1 = maxFinder1(a, s, mid);
        int num2 = maxFinder1(a, mid + 1, e);
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // Method 2

    public static int maxFinder2(int[] a, int l){
        if (l == 0) {
            return a[l];
        }
        int num1 = a[l - 1];
        int num2 = maxFinder2(a, l - 1);
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 20, 12, 16, 39, 2, 3};

        // For maxFinder1

        int s = 0;
        int e = nums.length - 1;

        // For maxFinder2

        int length = nums.length;   

        System.out.println("Maximum in nums is : " + maxFinder1(nums, s, e));
    }
}

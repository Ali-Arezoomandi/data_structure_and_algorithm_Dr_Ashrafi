import java.util.Arrays;

public class Problem3 {

    public static double[] reverse(double[] a, int s, int e){
        if (s >= e) {
            return a;
        }
        double x = a[s];
        a[s] = a[e];
        a[e] = x ;

        return reverse(a, s + 1, e - 1);

    }

    public static void main(String[] args) {
        double[] nums = {1.2, 5.3, 9.12, 24.5};
        int s = 0;
        int e = nums.length - 1;

        System.out.println("Reverse of " + Arrays.toString(nums) + " : " + Arrays.toString(reverse(nums, s, e)));
    }
}

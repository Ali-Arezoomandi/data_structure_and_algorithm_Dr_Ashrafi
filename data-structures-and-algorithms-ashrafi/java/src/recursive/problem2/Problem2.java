public class Problem2 {

    public static double average(int[] a, int l, int i){
        if (i == l - 1) {
            return (double)a[i] / l;
        }    
        return ((double)a[i] / l) + average(a, l, i + 1);
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3, 6, 5};
        int lenght = nums.length;
        int i = 0;

        System.out.printf("Average = %.2f", average(nums, lenght, i));
    }
}
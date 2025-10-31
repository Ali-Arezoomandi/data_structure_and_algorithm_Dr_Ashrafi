public class Problem14 {
    
    public static void printHanoi(int n, char S, char D, char A){
        if (n == 1) {
            System.out.println(S + " -> " + A);
            System.out.println(A + " -> " + D);
        } else {
            printHanoi(n - 1, S, D, A);
            System.out.println(S + " -> " + A);
            printHanoi(n - 1, D, S, A);
            System.out.println(A + " -> " + D);
            printHanoi(n - 1, S, D, A);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        char S = 'S';
        char D = 'D';
        char A = 'A';

        printHanoi(n, S, D, A);
    }
}

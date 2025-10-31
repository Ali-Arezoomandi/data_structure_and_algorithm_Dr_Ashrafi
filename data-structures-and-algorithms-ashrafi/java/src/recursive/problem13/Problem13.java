public class Problem13 {
    
    public static void printHanoi(int n, char S, char D, char A){
        if (n == 1) {
            System.out.println(S + " -> " + D);
        } else {
            printHanoi(n - 1, S, A, D);
            System.out.println(S + " -> " + D);
            printHanoi(n - 1, A, D, S);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        char S = 'S';
        char D = 'D';
        char A = 'A';

        printHanoi(n, S, D, A);
    }
}

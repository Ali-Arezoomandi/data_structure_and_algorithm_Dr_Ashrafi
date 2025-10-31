public class Problem15 {

    public static void chessBoard(int[] a, int num){
        if (num == 8) {
            for (int k = 0; k < 8; k++) {
                System.out.print(a[k] + ((k == 7) ? "" : " | "));
            }
            System.out.println();
        } else {
            for (int i = 0; i < 8; i++) {
                boolean isTrue = true;
                for (int j = 0; j < num; j++) {
                    if (a[j] == i || i - num == a[j] - j || i + num == a[j] + j) {
                        isTrue = false;
                    }
                }
                if (isTrue) {
                    a[num] = i;
                    chessBoard(a, num + 1);
                }
            }
        }
        
    }

    public static void main(String[] args) {
        int[] a = new int[8];
        int num = 0;

        chessBoard(a, num);
    }
}
    
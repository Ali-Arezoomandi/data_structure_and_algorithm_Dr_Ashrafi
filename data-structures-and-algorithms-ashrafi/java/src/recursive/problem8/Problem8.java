public class Problem8 {
    
    public static void printTruthTable(int n, String s){
        if (s.length() == n) {
            System.out.print(s + "\n");
        } else{
            printTruthTable(n, s + "0");
            printTruthTable(n, s + "1");
        }
    }

    public static void main(String[] args) {
        int n = 2;
        String s = "";

        printTruthTable(n, s);
    }
}

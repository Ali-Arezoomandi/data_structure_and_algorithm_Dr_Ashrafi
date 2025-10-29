public class Problem4 {
    
    public static void toBinary(int a){
        if (a / 2 == 0) {
            System.out.print(a);
        } else {
            toBinary(a / 2);
            System.out.print(a % 2);
        }
    }

    public static void main(String[] args) {
        int num = 93;

        toBinary(num);
    }
}

public class Problem17 {
    
    public static double calculetForX(String s, int x){

        s = s.replace(" ", "");

        if (s.equals("x")) {
            return x;
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                char operator = s.charAt(i);
                if (operator == '+'){
                  return calculetForX(s.substring(0, i), x) + calculetForX(s.substring(i + 1), x);   
                }
                if (operator == '-'){
                     return calculetForX(s.substring(0, i), x) - calculetForX(s.substring(i + 1), x);
                }
            }
            for (int i = 0; i < s.length(); i++) {
                char operator = s.charAt(i);
                if (operator == '*'){
                     return calculetForX(s.substring(0, i), x) * calculetForX(s.substring(i + 1), x);
                }
                if (operator == '/'){
                     return calculetForX(s.substring(0, i), x) / calculetForX(s.substring(i + 1), x);
                }
            }
        }
        return Double.parseDouble(s);
    }

    public static void main(String[] args) {
        String s = "x + x * x / x - x + x + x - x + x";
        int x = 2;

        System.out.printf("Answer is = %.2f%n", calculetForX(s, x));
    }
}

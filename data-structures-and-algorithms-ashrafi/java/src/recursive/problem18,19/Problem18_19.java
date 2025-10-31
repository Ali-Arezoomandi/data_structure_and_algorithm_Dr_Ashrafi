public class Problem18_19 {
    
    public static boolean isDuplicate(String s){
        if (s.length() == 0) {
            return true;
        } else if (s.length() % 2 != 0) {
            return false;
        } else {
            int mid = (s.length() - 1) / 2;
            if ((s.substring(0, mid + 1)).equals(s.substring(mid + 1))) {
                return isDuplicate(s.substring(1, mid + 1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String word = "AllAll";

        System.out.println(isDuplicate(word));
    }
}

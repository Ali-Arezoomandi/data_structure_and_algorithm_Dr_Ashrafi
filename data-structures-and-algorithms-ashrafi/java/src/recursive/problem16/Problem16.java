import java.util.List;
import java.util.ArrayList;

public class Problem16 {

    public static ArrayList<ArrayList<Integer>> allSubSets = new ArrayList<>();
    
    public static void subSets(int[] set, int i, List<Integer> subSet){
        if (i == set.length) {
            allSubSets.add(new ArrayList<>(subSet));
            return;
        }
        subSets(set, i + 1, subSet);
        subSet.add(set[i]);
        subSets(set, i + 1, subSet);
        subSet.remove(subSet.size() - 1);
    }

    public static void main(String[] args) {
        int[] set = {1, 2, 3};
        ArrayList<Integer> subSet = new ArrayList<>();
        int i = 0;
        
        subSets(set, i, subSet);

        System.out.println(allSubSets);
    }
}

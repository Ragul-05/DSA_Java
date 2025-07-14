package strings;

import java.util.*;

public class SubSetGenerator {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        List<List<Integer>> subsets = subset(arr);
        
        for (List<Integer> list : subsets) {
            System.out.println(list);
        }

        System.out.println("Total subsets: " + subsets.size());
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}

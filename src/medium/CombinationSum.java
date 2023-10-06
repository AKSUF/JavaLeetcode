package medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();

        for (int i = 0; i < candidates.length; i++) {
            int currentCandidate = candidates[i];

            if (currentCandidate == target) {
                combinations.add(new ArrayList<>(List.of(currentCandidate)));
            } else if (currentCandidate < target) {
                List<List<Integer>> combinationsWithCurrentCandidate = combinationSum(candidates, target - currentCandidate);

                for (List<Integer> combination : combinationsWithCurrentCandidate) {
                    List<Integer> newCombination = new ArrayList<>();
                    newCombination.add(currentCandidate);
                    newCombination.addAll(combination);
                    combinations.add(newCombination);
                }
            }
        }

        return combinations;
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> combinations = combinationSum(candidates, target);

        System.out.println(combinations); // [[2,2,3],[7]]
    }
}

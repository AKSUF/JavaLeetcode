package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        Integer[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSums(nums);
        System.out.println(result);
    }

    private static List<List<Integer>> threeSums(Integer[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array in ascending order

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i].equals(nums[i - 1])) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j > i + 1 && nums[j].equals(nums[j - 1])) {
                    continue;
                }

                for (int k = j + 1; k < nums.length; k++) {
                    if (k > j + 1 && nums[k].equals(nums[k - 1])) {
                        continue;
                    }

                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        result.add(triplet);
                    }
                }
            }
        }

        return result;
    }
}

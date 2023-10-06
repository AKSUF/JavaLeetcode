package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateCheck {
    public static void main(String[] args) {
        Integer[] nums = {1, 1, 2};
        List<Integer> result = findDuplicate(nums);
        System.out.println(result);
    }

    private static List<Integer> findDuplicate(Integer[] nums) {
        int k = 1;
        if (nums.length == 0) {
            return new ArrayList<>(Collections.singletonList(0));
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return new ArrayList<>(Arrays.asList(Arrays.copyOfRange(nums, 0, k)));
    }
}


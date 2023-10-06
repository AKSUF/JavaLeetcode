package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOccurence {
    public static void main(String[] args) {
        Integer[]nums={1,1,2};
        Integer k=2;
        List<Integer>result=findremove(nums,k);
        System.out.println(result);
    }
    private static List<Integer> findremove(Integer[] nums, Integer k) {
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=k){
                nums[l]=nums[i];
                l++;
            }

        }
        return new ArrayList<>(Arrays.asList(Arrays.copyOfRange(nums,0,l)));
    }

}

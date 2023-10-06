package medium;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[]nums={5, 7, 7, 8, 8, 10};
        int target=8;
        int[]result=searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] searchRange(int[] nums, int target) {
        int firstOccurence=findFirstOccurence(nums,target);
            if(firstOccurence==-1){
                return new int[]{-1,1};
            }

        int lastOccrence=findLastOccurrence(nums,target);
        return new int[]{firstOccurence,lastOccrence};
    }

    private static int findFirstOccurence(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return  i;
            }
        }
        return -1;
    }
    private static int findLastOccurrence(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[]nums={1,2,3};
        List<List<Integer>>permutations=permutate(nums);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }

    private static List<List<Integer>> permutate(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
   generatePermutation(nums,0,result);
   return result;
    }

    private static void generatePermutation(int[] nums, int index, List<List<Integer>> result) {
        if(index==nums.length-1){
            List<Integer>permutatiion=new ArrayList<>();
            for(int num:nums){
                permutatiion.add(num);
            }
            result.add(permutatiion);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            generatePermutation(nums,index+1,result);
            swap(nums,index,i);
        }

    }
    private static  void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

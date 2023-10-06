package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foursum {
    public static void main(String[] args) {
        Integer[]nums = {1,0,-1,0,-2,2};
        List<List<Integer>> result=fourSum(nums);
        System.out.println(result);
    }

    private static List<List<Integer>> fourSum(Integer[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i].equals(nums[i-1])){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j].equals(nums[j-1])){
                    continue;
                }
                for(int k=j+1;k<nums.length-1;k++){
                    if(k<j+1 && nums[k].equals(nums[k-1])){
                        continue;
                    }
                    for( int l=k+1;l<nums.length;l++){
                        if(l<k+1 && nums[l].equals(nums[l-1])){
                            continue;
                        }
                        int sum=nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum==0){
                            List<Integer> fourplet=new ArrayList<>();
                            fourplet.add(nums[i]);
                            fourplet.add(nums[j]);
                            fourplet.add(nums[k]);
                            fourplet.add(nums[l]);
                            result.add(fourplet);

                        }
                    }
                }
            }
        }
        return result;
    }
}

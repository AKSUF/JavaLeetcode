package easy;

public class TwoSum {
    public static void main(String[] args) {
        int[]nums={2,7,11,15};
        int target=9;
        int[]result=findTwoSum(nums,target);
if(result.length==2){
    System.out.println("indices"+result[0]+","+result[1]);
}else{
    System.out.println("no  solution found");
}
    }

    static int[] findTwoSum(int[] nums, int target) {
for(int i=0;i< nums.length;i++){
    for(int j=i;j< nums.length;j++){
        if(nums[i]+nums[j]==target){
            return new int[]{i,j};
        }
    }
}
        return new int[]{};
    }

}

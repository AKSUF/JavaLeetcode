package medium;

public class Insert {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        int target=3;
        int result=serachInsertPOSITION(nums,target);
        System.out.println(result);
    }

    private static int serachInsertPOSITION(int[] nums, int target) {

        int i;

        for(i=0;i<=nums.length;i++){
            if(nums[i]>=target){
                break;
            }
        }

        return i;
    }
}

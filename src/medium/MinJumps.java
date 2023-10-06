package medium;

public class MinJumps {
    public static void main(String[] args) {
        int[]nums={2,1,5,1,4};
        int result=minJumps(nums);
        System.out.println("The minimum number of jumps is"+result);
    }

    private static int minJumps(int[] nums) {
int n=nums.length;
int[] dp=new int[n];
dp[0]=0;

for(int i=1;i<n;i++){
    int minJump=Integer.MAX_VALUE;
    for(int j=0;j<=i && j<nums[i];j++){
        minJump=Math.min(minJump,dp[i-j]+1);
    }
    dp[i]=minJump;
}

        return dp[n-1];
    }
}

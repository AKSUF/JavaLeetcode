package easy;

public class RemoveElement {
    public static void main(String[] args) {
        int[]nums={3,2,2,3,4,5,6};
        int val=3;

        int resultlength=removeElememnt(nums,val);
        System.out.println("Modigifed array");
        for(int i=0;i<resultlength;i++){
            System.out.println(nums[i]+"");
        }
        System.out.println("Number of elememnt not equal"+val+"+"+resultlength);
    }

    private static int removeElememnt(int[] nums, int val) {
        int k=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k++;
    }
}

package Kunal;

public class Lin1 {
    public static void main(String[] args) {
int []nums={23,45,1,2,8,19,16,-11,28};
int target=19;
int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int elemet=arr[i];
            if(elemet==target){
                return elemet;
            }
        }
        return -1;
    }
}

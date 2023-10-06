package easy;

import java.util.Scanner;

import static easy.TwoSum.findTwoSum;

public class TwoSum1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elememnts ");
        int n=scanner.nextInt();
        int[]nums=new int[n];
        System.out.println("Enter th elements of the array");
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        System.out.println("Enter the target sum");
        int target=scanner.nextInt();
        int[]result=findTwoSum(nums,target);
        System.out.println("Indices of the two sum"+result[0]+"and"+result[1]);
    }
}

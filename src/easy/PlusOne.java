package easy;

public class PlusOne {

    public static void main(String[] args) {
        int[]digits={1,2,3};
        int[] result=plusOne(digits);

        System.out.println("Orginal Arryay");
        for(int digit:digits){
            System.out.println(digit+"");
        }
        System.out.println("nIncremebt Array");
        for(int digit:result){
            System.out.println(digit+"");
        }
    }

    private static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            digits[i]++;
            if(digits[i]<=9){
                return digits;

            }
            digits[i]=0;
        }
int[]result=new int[n+1];
        result[0]=1;

        return result;
    }

}


package medium;

public class Rotated {
    public static void main(String[] args) {
        Integer[]nums={1,2,3,4,5,6};
        Integer m=4;
        double n=findroted(nums,m);
        System.out.println(n);
    }

    private static double findroted(Integer[] nums, Integer m) {
        Integer n = nums.length;
        double left = 0;
        double right = n - 1;

        double mid = 0;
        while (left <= right) {
            mid = Math.floor((left + right) / 2);
            if (nums[(int) mid] == m) {
                if (nums[(int) left] <= m && m <= nums[(int) mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[(int) mid] <= m && m <= nums[(int) right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        return mid;
    }
}

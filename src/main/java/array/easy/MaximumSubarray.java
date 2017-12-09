package array.easy;

//53. Maximum Subarray

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0){
                sum = nums[i];
            }else {
                sum += nums[i];
            }
            if (maxsum < sum){
                maxsum = sum;
            }

        }

        return maxsum ;
    }

    public static void main(String[] args) {
        int[] arr = {0,-2,3,5,-1,2};
        int n = maxSubArray(arr);

        System.out.println(n);
    }

}

package array.easy;

/**
 * 628. Maximum Product of Three Numbers
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 */

import java.util.Arrays;

public class Maximum {
    public static  int maximumProduct(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;

        int a = nums[n-1]*nums[n-2]*nums[n-3];
        int b = nums[0]* nums[1]* nums[n-1];

        return  a>b ?  a:b;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,5,9,2};
        int n = maximumProduct(nums);

        System.out.println(n);
    }
}

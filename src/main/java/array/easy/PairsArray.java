package array.easy;

import java.util.Arrays;

//532. K-diff Pairs in an Array
public class PairsArray {
    public static int findPairs(int[] nums, int k) {
        int count = 0 ;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
               if (nums[j] - nums[i] == k){
                   count++;
                   break;
               }

            }
            while (i<nums.length-1 && nums[i] == nums[i+1]){
                i++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int n = findPairs(arr,0);
        System.out.println(n);
    }
}

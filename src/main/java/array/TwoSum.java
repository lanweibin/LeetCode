package array;

/**
 * Given an array of integers,
 * return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *Because nums[0] + nums[1] = 2 + 7 = 9,    return [0, 1]
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int a = 0;

        for (int i = 0; i < nums.length; i++) {

            a = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == a){
                    result[0] = i;
                    result[1] = j;
                }

            }

        }
        return  result;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] result = twoSum(nums ,6);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}

package array.easy;

//167. Two Sum II - Input array is sorted
public class TwoSumII {
    public static int[] find(int[] nums, int target){
        int i = 0 , j = nums.length - 1;
        int[] result = new int[2];

        while (i!=j){
              if (nums[i] + nums[j] == target) {
                  result[0] = i+1;
                  result[1] = j+1;
                  break;
              }else if (nums[i] + nums[j] < target){
                  i++;
              }else {
                  j--;
              }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int[] r = find(nums,6);

        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]+" ");

        }
    }
}

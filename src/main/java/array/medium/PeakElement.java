package array.medium;

public class PeakElement {
    public int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1] && nums[i] > nums[i-1]){
                return i;
            }

        }

        return nums.length <= 1 || nums[0] > nums[1] ? 0 : nums.length - 1;
    }
}

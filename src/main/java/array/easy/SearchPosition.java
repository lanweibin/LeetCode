package array.easy;
//35. Search Insert Position
public class SearchPosition {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] > target){
                result =  0;
            }else if (nums[nums.length-1] <target){
                result =  nums.length;
            }else if (nums[i] == target){
                result = i;
            }else if (nums[i] <target && nums[i+1] > target){
                result = i+1;
            }

        }
        return result;
    }

}

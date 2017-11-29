package array.medium;

//75. Sort Colors
public class SortColors {
    public void sortColors(int[] nums) {
        int head = 0 , end = nums.length-1,i = 0;
        while (i<end){
            if (nums[i] == 0){
                nums[i] = nums[head];
                nums[head] = 0;
                i++;

            }
            if (nums[i] == 2){
                nums[i] = nums[end];
                nums[end] = 2;
                end --;
            }
            i++;
        }
    }
}
